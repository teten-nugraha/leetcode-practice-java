package array;

import java.util.Arrays;

public class RotateArrayRight {
	
	public static void main(String[]args) {
		int[]datas = new int[]{-1,-100,3,99};
		int countRotate = 2;
		rotate(datas, countRotate);
		System.out.println(Arrays.toString(datas));
	}

	private static void rotate(int[] datas, int countRotate) {
		
		int arrLength = datas.length;
		int lastElement;
		
		for(int i=0; i < countRotate; i++) {
			lastElement = datas[arrLength-1];
			
			for(int j = arrLength-1; j > 0; j--) {
				datas[j] = datas[j-1];
			}
			datas[0] = lastElement;
			
		}
		
	}
	
}
