import java.util.*;
public class Tester {

	public static void main(String[] args) {
		
		
		
		Scanner integer= new Scanner(System.in);
		System.out.print("Enter an integer. ");
		
		int i1=integer.nextInt();
		int i2=i1%2;
		
		
		
		if (i2==1){
			System.out.println("The integer " + i1 +" is odd.");
		}
		else{
			System.out.println("The integer " + i1+ " is even.");
		}
	}

}
