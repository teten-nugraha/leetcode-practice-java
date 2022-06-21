package array;

import java.util.Arrays;

public class RotateArrayLeft {
	
	public static void main(String[]args) {
		int[]datas = new int[]{1, 2, 3, 4, 5, 6, 7};
		int countRotate = 2;
		rotateLeft(datas, countRotate);
		System.out.println(Arrays.toString(datas));
	}

	private static void rotateLeft(int[] inputArray, int countRotate) {

        System.out.println("Before = "+Arrays.toString(inputArray));

        final int arrLength = inputArray.length;
        int firstElement;
        for (int i = 1; i <= countRotate; i++) {
            firstElement  = inputArray[0];

            for (int j = 0; j < arrLength-1; j++) {
                inputArray[j] = inputArray[j+1];
            }

            inputArray[arrLength-1]  =firstElement;
        }

        System.out.println("After = "+Arrays.toString(inputArray));
    }
	
}
