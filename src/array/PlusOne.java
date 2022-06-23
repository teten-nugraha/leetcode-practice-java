package array;

import java.util.Arrays;

/**
 * * For the input array 123, the new array is 124.
 * For the input array 99, the new array is 100.
 * For the input array 9, the new array is 10.
 * For the empty array [ ], the new array is [1].
 * 
 * @author teten.nugraha
 *
 */
public class PlusOne {

	public static void main(String[] args) {
		
		int ar1[] = {9};
        int[]plusOne = makePlusOne(ar1);
        System.out.println(Arrays.toString(plusOne));

	}

	private static int[] makePlusOne(int[] digits) {
		if(digits == null || digits.length ==0)  {
            int[]temp={1};
            return temp;
        }

        int carry=1;
        int i;
        int length = digits.length;
        for(i = length-1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }else{
                carry += digits[i];
                digits[i] = carry;
                break;
            }
        }

        if(i < 0) {
            int[]result = new int[length+1];
            result[0]=1;
            return  result;
        }else{
            return digits;
        }
	}

}
