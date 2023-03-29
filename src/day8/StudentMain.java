package day8;

public class StudentMain {

	public static void main(String[] args) {
		// Approach1 using reference variable---Creatibg Object method 
/*Student stu=new Student();
stu.sid=101;
stu.sname="Pavan";
stu.grade='A';
stu.show();

// Approach 2 method
stu.setData(102, "Sravya", 'k');
stu.show();*/
		Student cons=new Student(103, "Shravya", 'p');
		cons.show();

	}

}
