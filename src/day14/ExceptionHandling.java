package day14;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		try {
			System.out.println(100/num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		

	}

}
