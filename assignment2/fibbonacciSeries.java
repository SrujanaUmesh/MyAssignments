package assignment2;

public class fibbonacciSeries {

	public static void main(String[] args) {
	int	series[] = {0,1,1,2,3,5,8,13};
	int FN=0;
	int SN=1;
	int sum=0;
	System.out.print(FN);
	System.out.print(" "+SN);
	for (int i = 0; i<=8; i++) {
		
		sum=FN+SN;
		System.out.print(" "+sum+" ");
		FN=SN;
		SN=sum;
	
		
	}

	}

}
