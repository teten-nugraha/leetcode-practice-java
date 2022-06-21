package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveDuplicateArray {
	
	public static void main(String[]args) {
		int[]datas = new int[] {1,1,2};
		int arrayClearCount = removeDuplicatesList(datas);
//		System.out.println(arrayClearCount);
	}
	
	public static int removeDuplicatesList(int[] arrays) {
		
		int arrayscount = arrays.length;
		int count = 0;
		for(int i=0; i < arrayscount; i++) {
			if(i < arrayscount -1 && arrays[i] == arrays[i+1]) {
				continue;
			}
			// arrayClear.add(arrays[i]);
			count++;
		}
		
		
		return count;
	}
}
