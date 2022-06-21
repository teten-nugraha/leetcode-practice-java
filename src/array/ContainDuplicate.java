package array;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
	
	public static void main(String[]args) {
		boolean isDuplicate  =checkDuplicate(new int[]{1, 2, 3});
        System.out.println(isDuplicate);
	}

	private static boolean checkDuplicate(int[] datas) {
		
		Set<Integer> dataUnique = new HashSet<>();
		int arrLength = datas.length;
		
		for(int i=0; i < arrLength; i++) {
			dataUnique.add(datas[i]);
		}
		
		if(dataUnique.size() == arrLength) return false;
		
		return true;
		
	}
	
}
