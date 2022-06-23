package array;

public class SingleNumber {
	public static void main(String[]args) {
		int[]datas = new int[] {1,1,2};
		int singleNumber = checkSingleNumber(datas);
		System.out.println(singleNumber);
	}
	
	private static int checkSingleNumber(int[] bs) {
		int singleNumber = 0;
		for(int a: bs) {
			singleNumber = singleNumber ^ a;
		}
		return singleNumber;
	}
}

	
