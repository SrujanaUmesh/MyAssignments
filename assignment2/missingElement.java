package assignment2;

import java.util.Arrays;

public class missingElement {

	public static void main(String[] args) {
		int[] Array= {1,2,3,4,5,6,8,9};
		Arrays.sort(Array);
	
for (int i = 0; i < Array.length; i++) {
	if (i+1!=Array[i]) {
		System.out.println(i+1);
		break;
		
	} 
}
	}
}
	
	

	


