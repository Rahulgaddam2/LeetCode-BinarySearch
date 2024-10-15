package BinarySearch;

public class LeetCode153 {

	public static void main(String[] args) {
		LeetCode153 Object = new LeetCode153();
		
		int[] array = {4,5,6,7,0,1,2};
		
		System.out.println(Object.Findtheminvalueinrotatedsortedarray(array));

	}
	public int Findtheminvalueinrotatedsortedarray(int[] array) {
		
		int Start = 0;
		int End = array.length-1;
		
		while(Start < End) {
			
			int mid = Start + (End - Start)/2;
			if(array[mid] > array[End]) {
				Start = mid + 1;
			}else { 
				End = mid;
			}
		}
		return array[Start];
	}

}
