package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the range for the fibonacci series:");
		int range=scanner.nextInt();
		int num1=0,num2=1;
		System.out.println("fibonacci  series up to"+range+":");
		while(num1<=range)
		{
			System.out.println(num1 +" ");
			int nextNum=num1 + num2;
			num1=num2;
			num2=nextNum;
		}
		scanner.close();
			
		}
	}


