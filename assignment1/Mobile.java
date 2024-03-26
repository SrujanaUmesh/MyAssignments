package assignment1;



public class Mobile {

	
	public void makeCall() {
		System.out.println("Make a Call");
String mobileModle="Samsung";
float mobileWt=(float)123.2;
System.out.println("Mobile Model="+mobileModle);
System.out.println("Mobile Wt="+mobileWt);

	}
	
	public void sendMsg() {
		
		System.out.println("send msg");
		int mobileCost=9000;
		boolean isMobileCharged=true;
		System.out.println("mobileCost"+mobileCost);
		System.out.println("IsMobileCharged"+isMobileCharged);
	}
	
	public static void main(String[] args) {
		
		
		
		Mobile mb=new Mobile();
		mb.makeCall();
		mb.sendMsg();
		System.out.println("This is my mobile");
		
	}
}
