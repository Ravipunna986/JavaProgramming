package day3;

public class OperatorDemo {

	public static void main(String[] args) {
		
//1.Arthimetic operator +-*/%
		
		int a=20,b=10;
		System.out.println("sum of a and b is;"+(a+b));//30
		System.out.println("difference between a and b is :"+(a-b));//10
		System.out.println("multiplication of a and b is:"+(a*b));//200
		System.out.println("Division of a and b is:"+(a/b));//2
		System.out.println("Percentile of a and b is"+(a%b));//0
		
		char c='k';
		System.out.println(c-a);
		
		
		
//2. Relational/comparision operator > >= < <= != ==		
	//returns true/false (Boolean values only)	
		  
		System.out.println(a>b );//true
		System.out.println(a<b );//false
		
	//	System.out.println(a<c);
		
		
		b=20;
		
		System.out.println(a>=b);//true
		System.out.println(a<=b);//true
		
		System.out.println(a!=b);//false
		System.out.println(a==b);//true
		
// 3. Logical operators  && || !		
		//Logical operators we can use only between only boolean values
		//Returns true/false
		
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);	//false
		System.out.println(x||y);	//true
		System.out.println(!x);		//false
		System.out.println(!y);		//true
		
		boolean b1=10>20;	//false
		boolean b2=20>10;	//true
		System.out.println(b1);	//false
		System.out.println(b1&&b2);//false
		System.out.println(b1||b2);//true
		
		
// 4. increment and decrement operators		
		//++ is called increment operator----> Pre and post increment operator
		
		int d=10;
		// Scenario 1 -there is no difference between pre and post increment
		//d=d+1;
	//	d++;-------> Post increment
	//++d;	------->Pre Increment
		
		System.out.println(d); //11
		
// Scenario 2		
		
	int res=d++;	
		System.out.println(res);//10
		System.out.println(d);//11
		
	int resu=++d;	
		System.out.println(resu);//12
		System.out.println(d);//12
		
		
// -- Decrement operator		
		//Scenario 1
		int e=100;
		e--;
		System.out.println(e);//99
		System.out.println(e);
		--e;
		System.out.println(e);//98
		
		//Scenario2
		int f=100;
		int result=f--;//post decrement
		System.out.println(f);//99
		
		System.out.println(result);//100
		
		int g=200;
		int result1=--g;
		
		System.out.println(g);//199
		System.out.println(result1);//199
		
// Assignment operators =	+=	-=	*=	/=	%=
		//also called as shorthand operators
		// Increment more values +=
		
	 a=10;//=
	 a=a+5;
	 System.out.println(a);//15
	 a+=5;
		System.out.println(a);//20
		
		//decrement more values -=
	a=a-5;	
	System.out.println(a);//15
		a-=5;
		System.out.println(a);//10
		
		
		//*=	/=	%=
		
		int s=5;
		
		s=s*2;
		System.out.println(s);//10
		
		s*=3;
		
		System.out.println(s);//30
		
		int r=6;
		r=r/2;
		System.out.println(r);//3
		r/=2;
		System.out.println(r);
		
		
		
		int p=5;//written reminder in output
		p=p%2;
		System.out.println(p);//0
		r%=2;
		System.out.println(p);//0
		
		
		
//Ternary operator 	-checking for the conditions
		// we normally use with relational operator
		
		//Syntax for terminory operator
		//var= exp ? result1 : result2;
		
		
	int	m=200,		n=100;
		int o=m>n ? m : n;
		System.out.println(o);//200
		m=1000;
		n=2000;
		
		o=n<m ? n:m;
		System.out.println(o);//1000
		
		int h=(1==1)? 100:200;
		
		System.out.println(h);
		
		int age= 20;
		String result11= (age>=18)? "Eligible for vote":"Not eligible for vote";
		System.out.println(result11);
		
		
		
		
	}

}
