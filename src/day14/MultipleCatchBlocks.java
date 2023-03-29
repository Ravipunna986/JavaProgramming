package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) throws Exception {
		System.out.println("Program is started");
		Thread.sleep(5000);
		System.out.println("Program is in progress");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		try {
			System.out.println(100/num);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter valid num");
		}
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter valid num");
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Enter valid num");
		}
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			//vbne.printStackTrace();
			System.out.println("Enter valid num");
		}
		finally {
			System.out.println("not done");
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		
	}

}
