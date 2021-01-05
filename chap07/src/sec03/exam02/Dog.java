package sec03.exam02;

public class Dog extends Animal{
	public Dog(String kind) {super(kind);}
	//sound() 재선언 없으면 The type Dog must implement the inherited abstract method Animal.sound()
	public void sound() {System.out.println("Woof");}
}
