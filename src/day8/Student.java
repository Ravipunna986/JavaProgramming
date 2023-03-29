package day8;

public class Student {
int sid;
String sname;
char grade;

void show() {
	System.out.println(sid+"     "+sname+"      "+grade);
}

void setData(int id,String name,char g) {
	sid=id;
	sname=name;
	grade=g;
}
// Constructor should create with the name of Class name
//constructor need to create like method
//Constructor will not never create any value---Including void
//Constructor is only used for assigning data into variable ,not for looping etc but method can do any thing


Student(int id,String name,char g) {
	sid=id;
	sname=name;
	grade=g;
}


}

