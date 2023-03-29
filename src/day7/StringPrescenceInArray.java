package day7;

public class StringPrescenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= {"Ravi","pavan","teja","Shravya"};
int len=str.length;
for(int i=0;i<len;i++) {
	if(("Ravit").equals(str[i])) {
		System.out.println("match found");
	}
	else
	{
		System.out.println("Match not found");
	}
}
	}

}
