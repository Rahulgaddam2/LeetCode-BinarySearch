package BinarySearch;

public class LeetCode74 {

	public static void main(String[] args) {
		LeetCode74 Object = new LeetCode74();
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.print(Object.searchmatrix2D(matrix, 10));
		

	}
	public boolean searchmatrix2D(int[][] matrix, int target) {
		int Start = 0;
		int End = matrix.length-1;
		
		while(Start <= End) {
			int mid = Start + (End - Start)/2;
			
			if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1]) {
				return searchmatrix1d(target , matrix[mid]);
			}else if(target < matrix[mid][0]) {
				End = mid-1;
			}else {
				Start = mid+1;
			}
		}
		return false;
	}
	private boolean searchmatrix1d(int target , int[] array) {
		
		int Start = 0;
		int End = array.length-1;
		
		while(Start <= End) {
			int mid = Start + (End - Start)/2;
			
			if(target == array[mid]) {
				return true;
			}else if(target < array[mid]) {
				End = mid - 1;
			}else {
				Start = mid + 1;
			}
		}
		return false;
	}
	

}
