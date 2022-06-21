package array;

public class BestTimeForBuyAndSell {
	
	public static void main(String[]args) {
	    int [] arr = {1,2,3,4,5}; 
	    int ans=  maxProfit(arr);
	    System.out.println(ans);
	}

	private static int maxProfit(int[] arr) {
		int lengthArr = arr.length;
		int profit = 0;
		for(int i=1; i < lengthArr; i++) {
			if(arr[i] > arr[i-1]) {
				profit += arr[i] - arr[i-1];
			}
		}
		return profit;
	}
	
}
