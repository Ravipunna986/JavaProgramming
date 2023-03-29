package day9;

public class ConstructorDemo {
/*int x,y;
String s;
ConstructorDemo()//default constructor
{
	x=100;
	y=200;
	s="Ravi";
}
void displayData() {
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
}

public static void main(String[] args) {
	ConstructorDemo cd=new ConstructorDemo();//invoking default constructor
cd.displayData();
}*/
	
	
	
	
	
	int x,y;
	String s;
	ConstructorDemo(int p,int q,String r)//Parameterized constructor
	{
		x=p;
		y=q;
		s=r;
	}
		void displayData() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(s);
		
	}
	public static void main(String[] args) {
		ConstructorDemo cdp=new ConstructorDemo(10,20,"Ravi");//Invoaking parameterzide constructor
	cdp.displayData();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







}
