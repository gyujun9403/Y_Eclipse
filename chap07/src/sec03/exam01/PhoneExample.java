package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("������"); Cannot instantiate the type Phone
		SmartPhone smartphone = new SmartPhone("������");
		
		smartphone.on();	//�߻�Ŭ������ �θ�Ŭ������ �޼ҵ�
		smartphone.off();	//�߻�Ŭ������ �θ�Ŭ������ �޼ҵ�
		smartphone.web();	//�ڽ�Ŭ������ �޼ҵ�
	}

}
