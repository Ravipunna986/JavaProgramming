package day9;



public class MethodOverLoading {
	int x,y,z;
	double d;
	//Methods name should be same
		void sum()
		{
		x=10;
		y=15;
		System.out.println(x+y);
		}
		//number of parameters should not be same
		void sum(int a,int b)
		{
			x=a;
			y=b;
			System.out.println(x+y);
		}
		
		
		
		//if the num of parameters is same data type of parameter should be different
		
		void sum(int a,double b) {
			x=a;
			d=b;
			System.out.println(x+d);
		}
		
		//if the num of parameters is same data type of parameter also same but order should be different
		
		void sum(double b,int a) {
			x=a;
			d=b;
			System.out.println(x+d);
		}
				
		public static void main(String[] args) {
			
			MethodOverLoading mo=new MethodOverLoading();
			mo.sum(10, 20);//2
			mo.sum();//1
			mo.sum(9.5, 10);//3
			mo.sum(10, 25.30);
			
			
			
			
			
			
			
			
			
			
			
		}

	}


