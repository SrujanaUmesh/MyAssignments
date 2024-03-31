package assignment2;

public class LearnPartiallyMatch {

	public static void main(String[] args) {
		String text1="Arjun Software Solutions";
		String text2="Solutions";
		
		if(text1.contains(text2)) {
			System.out.println("Partially match");
		}
		else {
			System.out.println("Not a Match");
		}
	}

}
