package assignment2;

public class Palindrome3 {

	public static void main(String[] args) {
		String text="DADA";
		String reverse="";
		char[] eachCharacter=text.toCharArray();
		for(int i=eachCharacter.length-1;i>=0;i--) {
			
			reverse=reverse+eachCharacter[i];
		}
System.out.println(reverse);
if(reverse.equals(text)) {
	System.out.println("Palindrome");
	
	
}else {
	System.out.println("Not a Palindrome");
}
	}

}
