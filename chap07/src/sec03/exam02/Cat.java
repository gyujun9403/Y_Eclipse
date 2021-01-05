package sec03.exam02;

public class Cat extends Animal{
	public Cat(String kind) {super(kind);}
	//sound() 재선언 없으면 The type Cat must implement the inherited abstract method Animal.sound()
	public void sound() {System.out.println("Meow");}
}
