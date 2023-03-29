package day5;

public class EvenOddCount {

	public static void main(String[] args) {
		int num=12534;
		int num1,count = 0;
		int data = 0;
		while(num>0) {
		num1=num%10;
		if(num1%2==0) {
			count++;
		}
		else {
			
			data++;
		}
		num=num/10;
		}
		System.out.println("Even num"+count);
		System.out.println("Odd num"+data);
	}

}
