package assignment2;

public class SplittingMethods {

	public static void main(String[] args) {
		String text="I Love Warangal";
		String[] split=text.split("\\s+");
		int length=split.length;
		System.out.println(length);
		
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

}
