package day5;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		//int n=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int rev=0;
		int temp=n;
	while(n!=0) {
		
	
	rev=rev*10+n%10;
	n=n/10;
	}
		System.out.println(rev);
		
if (temp==rev) {
	System.out.println("Polindrome");
}
	}

}
