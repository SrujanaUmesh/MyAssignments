package assignment2;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		String text1="cat";
		String text2="dct";
		char[] charArray1=text1.toCharArray();
		char[] charArray2=text2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			
			System.out.println("Both are equals");
		}else {
			System.out.println("Not Equal");
		}
	}

}
