package day10;

public class Account {
int account_no;
String Name;
double amount;
//Setter medthod
void setaccno(int accno)
{
	account_no=accno;
}

//getter method
int getaccno()
{
	return account_no;
}


public static void main(String[] args) {
	Account ac=new Account();
	ac.setaccno(1222);
	System.out.println(ac.getaccno());
}










}
