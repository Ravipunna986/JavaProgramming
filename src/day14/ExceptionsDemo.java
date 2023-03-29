package day14;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(100/num);
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		
		
		
		
	}

}
