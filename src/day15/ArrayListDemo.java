package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String>mylist= new ArrayList<String>();
List mylist1=new ArrayList();
ArrayList mylist2=new ArrayList();
mylist1.add(15);
mylist1.add(1000);
mylist1.add(10.55);
mylist1.add("Raviteja");

mylist2.add(100);
mylist2.add(10.5);
mylist2.add("Ravi");
mylist2.add(true);
mylist2.add(10.5);
mylist2.add("Ravi");
mylist2.add(100);
mylist2.add(null);
mylist2.add(null);
mylist2.add(100);
mylist2.add(10.5);
mylist2.add("Ravi");
mylist2.add(100);
mylist2.add(10.5);
mylist2.add("Ravi");

mylist2.add(mylist1);
mylist2.remove(2);
mylist2.remove("Ravi");
mylist2.remove("Ravi");
//Inserting the new element in the middle of the list
//polymorphisam -over loading concept on add method
mylist2.add(2,"Raviteja");

System.out.println(mylist2);

System.out.println(mylist2.size());

System.out.println(mylist2.get(2));
System.out.println(mylist2.get(2));
//read all the data from array list
for(int x=0;x<mylist2.size();x++) {
	System.out.println(mylist2.get(x));
}
for(Object y:mylist1) {
	System.out.println(y);
}

mylist1.clear();
System.out.println("List values:"+mylist1);














	}

}
