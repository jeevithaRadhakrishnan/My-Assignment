package week1.day2;
import java.util.Scanner; 
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number to check if it is prime:");
int number=scanner.nextInt();
if (isPrime(number)) 
{
	System.out.println((number +" is a prime number."));
}
	else
	{
		System.out.println((number +" is not  a prime number."));
}


	} 
	public static boolean isPrime(int num)
	{
if(num<=1)
{
	return false;
	}
for(int i=2;i<=Math.sqrt(num);i++)
{
	if(num%i==0)
	{
		return false;
	}
}
return true;
	}
}
	

