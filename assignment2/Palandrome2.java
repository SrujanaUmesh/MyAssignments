package assignment2;

public class Palandrome2 {
	
	public static void main(String[] args) {
		String Text="malayalam";
		String Reverse="";
		char[] eachCharacter=Text.toCharArray();
		
		for(int i=eachCharacter.length-1;i>=0;i--) {
			
			Reverse=Reverse+eachCharacter[i];
		}
			System.out.println(Reverse);
			
			
			if(Reverse.equals(Text)) {
				
				System.out.println("The given string is palindrome");
			}else {
				System.out.println("Not a palindrome");
					
					
				}
			}
		}
		
	

