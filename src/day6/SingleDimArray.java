 package day6;

import java.util.Arrays;

/* 1. declaration of an array
  * 2. insert values into array
  * find size of an array
  * read single value from an array
  * read multiple values from an array
  */

public class SingleDimArray {

	public static void main(String[] args) {
		
		//Declaration
		//Approach1
		
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a[0]);
		//approach 2
		int b[]= {100,200,300,5000,6000};
		System.out.println(b[3]);
		
		//size or length of array
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		
		
		
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
		
	}

}
