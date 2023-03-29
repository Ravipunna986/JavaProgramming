package day9;
public class ThisKeyWord 
{
int x,y;//instance variables/class variables
void SetData(int x,int y) //Local variable/method
{
	this.x=x;
	this.y=y;//this indicates class basically
		}
void display()
{
	System.out.println(x);
	System.out.println(y);
		}
public static void main(String[] args)
{
ThisKeyWord thk=new ThisKeyWord();
thk.SetData(10, 250);
thk.display();
	}
		}