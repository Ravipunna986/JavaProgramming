package day11;

public class Animal {
	String colour="White";
	void eat() {
		System.out.println("Eating");
}
}
class Dog extends Animal
{
	String colour="Black";
	void displaycolour()
	{
		System.out.println(super.colour);
	}
	void eat() {
		System.out.println("Eating bread");
		super.eat();
}
}