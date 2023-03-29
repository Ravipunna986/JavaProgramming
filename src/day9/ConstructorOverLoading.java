package day9;

public class ConstructorOverLoading {
	int x,y,z;
	double d;
	
	ConstructorOverLoading()
	{
		x=10;y=20;
	}
	ConstructorOverLoading(int a,int b){
	x=a;
	y=b;
	
	}
	ConstructorOverLoading(int a,double b){
		x=a;
		d=b;
	}
	
	ConstructorOverLoading(double b,int a){
		x=a;
		d=b;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		ConstructorOverLoading con=new ConstructorOverLoading();
		con.display();
	
	ConstructorOverLoading con2=new ConstructorOverLoading(10,500);
		con2.display();
	ConstructorOverLoading con3=new ConstructorOverLoading(10.5,2000);
		con3.display();
	ConstructorOverLoading con4=new ConstructorOverLoading(10,20.00);
		con4.display();
}  
}
