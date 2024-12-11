package week1.day2;
import java.util.Scanner;
public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number is: ");
		int version=scanner.nextInt();
		
		if(version>0)
		{
			System.out.println("The Number is positive.");
		
		}
		else if(version<0) {
			System.out.println("The Number is negative.");
		}
		else
		{
			System.out.println("The Number is zero.");
		}
		scanner.close();
	}

}
