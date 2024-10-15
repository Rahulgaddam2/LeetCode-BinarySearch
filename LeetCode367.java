package BinarySearch;

public class LeetCode367 {

	public static void main(String[] args) {
		LeetCode367 Object = new LeetCode367();
		
		int number = 1;
		
		System.out.println(Object.ValidPerfectSquare(number));

	}
	public boolean ValidPerfectSquare(int number) {
		
		int Start = 0;
		int End = number/2;
		
		if(number == 1) {
			return true;
		}
		
		while(Start <= End) {
			int mid = Start + (End - Start)/2;
			long square = (long)mid*mid;
			
			if(square == number) {
				return false;
			}else if(square < number) {
				Start = mid+1;
			}else {
				End = mid-1;
			}
		}
		return false;
	}

}
