package BinarySearch;

public class LeetCode35 {
	public static void main(String[] args) {
        LeetCode35 Object = new LeetCode35();
		
		int[] array = {1,2,4,5,6,7,8,9};
		int target = 3;
		
		System.out.println(Object.SearchInsertPosition(array, target));
		
	}
	public int SearchInsertPosition(int[] array, int target) {
		
		int Start = 0;
		int End = array.length-1;
		
		while(Start <= End) {
			int mid = Start + (End - Start)/2;
			
			if(target < array[mid]) {
				End = mid-1;
			}else if(target > array[mid]) {
				Start = mid+1;
			}else {
				return mid;
			}
		}
		return Start;
	}
       
}
