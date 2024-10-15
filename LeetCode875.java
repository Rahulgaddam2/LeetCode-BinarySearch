package BinarySearch;

public class LeetCode875 {

	public static void main(String[] args) {
		LeetCode875 Object = new LeetCode875();
		
		int[] piles = {3,6,7,11};
		int Hours = 8;
		
		System.out.println(Object.KOKOEatingBanana(piles, Hours));
		

	}
	public int KOKOEatingBanana(int[] piles ,  int Hours) {
		
		int lower = 1;
		int higher = Integer.MAX_VALUE;
		
		while(lower < higher) {
			int K = lower+(higher - lower)/2;
			int time=0;
			for(int i=0;i<piles.length;i++) {
				if(piles[i] <= K) {
					time++;
				}else {
					time = time+(piles[i] + K-1)/K;
				}
			}
			if(time > Hours) {
				lower = K+1;
			}else {
				higher = K;
			}
		}
		return lower;
	}
	

}
