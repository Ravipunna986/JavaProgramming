package day6;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		String s=";hj";
		int a[]= {30,20,10,50,4,30};
		int b[]= {30,20,10,50,60,50,4,30};
		int c[]= {30,20,10,50,60,50,4,50,56,45,54565,655,545,30};
		Integer d[]= {30,20,10,50,60,50,4,50,56,45,54565,655,545,30};
		Arrays.sort(d,Collections.reverseOrder());
		System.out.println(Arrays.toString(d));
		Arrays.sort(a);
		System.out.println("Elements in C is :"+Arrays.toString(c));
		Arrays.parallelSort(b);
		System.out.println("Elements in b is:"+Arrays.toString(b));
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		
		System.out.println(Arrays.toString(a));
		}
	}

}
