package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		//Animal animal = new Animal(); Cannot instantiate the type Animal
		Cat cat1 = new Cat("���þ� ���");
		Dog dog1 = new Dog("�����ڱ�");
		Animal cat2 = new Cat("�ڸ��� �����");
		Animal dog2 = new Dog("�ù��̴�");
		//�θ�Ŭ������ Animal�߻� Ŭ�������� ��ӵ� Ŭ����
		cat1.breath();
		cat2.breath();
		dog1.breath();
		dog2.breath();
		//�ڽ� Ŭ������ ���� �缱���� �߻�޼ҵ��� sound()
		cat1.sound();
		cat2.sound();
		dog1.sound();
		dog2.sound();
		

	}

}
