package day6;

public class EvenOddNumInArray
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int count=0;
		int data=0;
		for (int i=0;i<a.length;i++)
			
		{
			if(a[i]%2==0) 
			{
				System.out.println("Even Num"+a[i]);
				count++;
			}
		}
		System.out.println("count of even numbers"+count);
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2!=0)
	 		{
		 		System.out.println("Odd Num"+a[i]);
		 		data++;
	 		}
		}
		System.out.println("count of odd numbers"+data);
	}
}

