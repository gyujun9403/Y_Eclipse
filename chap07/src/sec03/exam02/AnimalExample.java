package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		//Animal animal = new Animal(); Cannot instantiate the type Animal
		Cat cat1 = new Cat("러시안 블루");
		Dog dog1 = new Dog("웰시코기");
		Animal cat2 = new Cat("코리안 숏헤어");
		Animal dog2 = new Dog("시바이누");
		//부모클래스인 Animal추상 클래스에서 상속된 클래스
		cat1.breath();
		cat2.breath();
		dog1.breath();
		dog2.breath();
		//자식 클래스에 각각 재선언한 추상메소드인 sound()
		cat1.sound();
		cat2.sound();
		dog1.sound();
		dog2.sound();
		

	}

}
