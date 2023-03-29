package day7;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Raviteja";
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		String s2="Pavan Teja";
		StringBuilder sbu=new StringBuilder(s2);
		StringBuilder rever=sbu.reverse();
		System.out.println(rever);
		 
		
		String r1="ravipavan";
		String r2="";
		int len=r1.length();
		for(int i=len-1;i>=0;i--) {
			r2=r2+r1.charAt(i);

			System.out.println(r2);	
		}
		String r4="psp";
		char a[]=r4.toCharArray();
		int lent=a.length;
		String r3="";
		for(int i=lent-1;i>=0;i--) {
			r3=r3+r4.charAt(i);

			System.out.println(r3);
		}	
		
		if(r3.equals(r4)) {
			System.out.println("palindrome");// It compares with value
		}
		
		
		
		
		
		
		
	}

}
