package assignment2;

public class palindrome {

	public static void main(String[] args) {
		int num=34343;
		int r,sum=0,temp;
		temp=num;
		while(num>0){    
			   r=num%10;  
			   sum=(sum*10)+r;    
			   num=num/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
		
		
			
		}

	


