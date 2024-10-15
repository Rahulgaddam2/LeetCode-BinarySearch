package BinarySearch;

public class LeetCode33 {

	public static void main(String[] args) {
		LeetCode33 Object = new LeetCode33();
		
		int[] array = {4,5,6,7,0,1,2,3};
		int target = 0;
		
		System.out.println(Object.Searchinrotatedsortedarray(array, target));

	}
	public int Searchinrotatedsortedarray(int[] array , int target) {
		
		int Start = 0;
		int End = array.length-1;
		
		while(Start <= End) {
			int mid = Start + (End - Start)/2;
			if(target == array[mid]) {
				return mid;
			}
			
			if(array[Start] <= array[mid]) {
				if(target >= array[Start] && target <= array[mid]) {
					End = mid;
				}else {
					Start = mid+1;
				}
			}else {
				if(target >= array[mid] && target <= array[End]) {
					Start = mid+1;
				}else {
					End = mid;
				}
			}
			
		}
		return -1;
	}

}
