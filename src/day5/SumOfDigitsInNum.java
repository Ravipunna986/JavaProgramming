package day5;

public class SumOfDigitsInNum {

	public static void main(String[] args) {
		int num=1234;
		int num1 ;
		int count=0;
		while(num>0) {
		num1=num%10;
		count=count+num1;
		num=num/10;
	
		}
		System.out.println(count);
	}

}
