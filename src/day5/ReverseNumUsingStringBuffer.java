package day5;

import java.util.Scanner;

public class ReverseNumUsingStringBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String str=sc.next();
	/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	System.out.println(rev);*/
		
		//StringBuilder Method
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(str);
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println(rev);
	}

}
