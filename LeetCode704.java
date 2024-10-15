package BinarySearch;

public class LeetCode704 {

	public static void main(String[] args) {
		LeetCode704 Object = new LeetCode704();
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		int target = 2;
		
		System.out.println(Object.BinarySearch(array, target));
		
		int[] array1 = {9,8,7,6,5,4,3,2,1};
		int target1 = 2;
		
		System.out.print(Object.BinarySearch1(array1, target1));
	}
	public int BinarySearch(int[] array, int target) {
		
		int Start=0;
		int End = array.length-1;
		
		while(Start <= End) {
			
			int mid = Start + (End - Start)/2;
			
			if(target < array[mid]) {
				End = mid-1;
			}else if(target> array[mid]) {
				Start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public int BinarySearch1(int[] array1 , int target1) {
		
		int Start = 0;
		int End = array1.length-1;
		
		boolean isacc;
		if(array1[Start] < array1[End]) {
			isacc = true;
		}else{
			isacc = false;
		}
		
		while(Start<= End) {
			
			int mid = Start + (End - Start)/2;
			
			if(array1[mid] == target1 ) {
				return mid;
			}
			if(isacc) {
				if(target1 < array1[mid]) {
					End = mid-1;
				}else if(target1 > array1[mid]){
					Start = mid+1;
				}
			}else {
				if(target1 > array1[mid]) {
					End = mid-1;
				}else if(target1 < array1[mid]){
					Start = mid+1;
				}
			}
		}
		return -1;
	}

}
