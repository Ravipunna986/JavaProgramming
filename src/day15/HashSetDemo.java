package day15;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet myset=new HashSet();
Set myset2=new HashSet();
myset.add(100);
myset.add(100);
myset.add("Ravi");
myset.add(null);
myset.add(null);
myset.add(10.5);
System.out.println(myset);
System.out.println(myset.size());
myset.remove(100);//we need to pass value not index coz set will not support index method
System.out.println(myset);
System.out.println(myset.size());
//insertion is not possible in the middle of set coz it notb follows index
//to get specific value is not possible
	}

}
