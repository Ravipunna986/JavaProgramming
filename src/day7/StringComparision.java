package day7;

public class StringComparision {

	public static void main(String[] args) {
		// case 1
 String s1="Raviteja";
 String s2="Raviteja";
 System.out.println(s1==s2);//true
 System.out.println(s1.equals(s2));//true
 // == is used with primitive data types like int double long
 // equals i used with non primitive data types
 
 	// case 2
 String n1=new String("Raviteja");
 String n2=new String("Raviteja");
 System.out.println(n1==n2);// false--
 // == will compare objects, 
 
 System.out.println(n1.equals(n2));//True
 // Equals method compare value of the objects
 
 
 String p1="Ravi";
 String p2=new String("Ravi");
 String p3=p2;
 
 System.out.println(p2.equals(p3));//true
 System.out.println(p2==p3);//true
 System.out.println(p1==p2);//false
 System.out.println(p1.equals(p2));//true
 System.out.println(p1==p3);//false
 
 
 
 
 
	}

}
