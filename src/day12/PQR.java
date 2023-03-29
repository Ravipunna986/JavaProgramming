package day12;

public class PQR extends MNO implements ABC,XYZ{



@Override
public void m2() {
	System.out.println("This is from XYZ interface");
	
}

@Override
public void m1() {
	System.out.println("This is from ABC");
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
PQR obj=new PQR();
obj.m1();
obj.m2();
obj.m3();
obj.wait(x, y);
	}
}
