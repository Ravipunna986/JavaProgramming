package day7;

public class StringOperation {

	public static void main(String[] args) {
		String s=new String("Welcome");
		String str="to Java";
		String s1="test";
		System.out.println(s);
System.out.println(str);
System.out.println(s.length());
System.out.println(s+str);
System.out.println(s.concat(str));
System.out.println(s.concat(str).concat(s1));

s="           Ravi            ";
System.out.println(s.length());//27
System.out.println(s.trim());//Ravi
System.out.println(s.trim().length());//4
// CharAt --Returns a single value based on index
String sr="shrav!ya";
System.out.println(sr.charAt(2));

//Contains--return boolean value like true or false
//weather it checks the given word is present or not
// Strings are case sensitive

System.out.println(sr.contains("rav!"));
System.out.println(sr.contains("Rav!"));//Case sensitive--false
System.out.println(sr.contains("rava"));//false
// equals--equalIgnorecase----These two compare strings
String c1,c2;
c1="raviteja";
c2="RAVITEJA";
System.out.println(c1.equals(c2));//false--coz it is not ignoring case sensitive
System.out.println(c1.equalsIgnoreCase(c2));// true coz it will ignore case sensitive
// replace---replace single or multiple character in string
String rep="Need to get a job in a january month,this was a last month";
System.out.println(rep.replace('e', 'k'));//Nkkd to gkt a job in a january month,this was a last month
System.out.println(rep.replaceAll("month", "only"));//Need to get a job in a january only,this was a last only
// substring--use this method to extract substring from main string
System.out.println(rep.substring(0, 4));//need
//01234567---beginIndex starts from 0
//welocome---
//12345678----end index starts from 1
String ss="welcome";
System.out.println(ss.substring(3, 7));//come
//Split---it will divide the string into multiple parts using delimeter/seperator
String sp="ravitejapunna1@gmail.com";
String spl[]=sp.split("@");// store the data in single array
System.out.println(spl[0]);//ravitejapunna1
System.out.println(spl[1]);//gmail.com

String dot="ravi.teja.shravya";
String dot1[]=dot.split(".");
//System.out.println(dot1[0]);----should not use this symbol * $ . ? + - ^

//toUpperCase and toLowerCase-----used to convert lower case to upper case viseversa

System.out.println(rep.toLowerCase());//need to get a job in a january month,this was a last month
System.out.println(rep.toUpperCase());//NEED TO GET A JOB IN A JANUARY MONTH,THIS WAS A LAST MONTH



























	}

}
