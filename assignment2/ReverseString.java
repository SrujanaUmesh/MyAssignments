package assignment2;

public class ReverseString {
	public static void main(String[] args) {
		String name="Srujana";
		char[] eachCharater=name.toCharArray();
		for (int i = eachCharater.length-1;i>=0; i--) {
			System.out.print(eachCharater[i]);
			
		}
	}

}
