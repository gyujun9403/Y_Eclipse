package sec03.exam02;

public abstract class Animal {
	public String kind;
	public Animal(String kind) {this.kind = kind;}
	//��� ���� Ŭ������ ���������� �����ϴ� �޼ҵ�
	public void breath() {System.out.println(this.kind + "�� ���� ����.");}
	//���� Ŭ�������� �ٸ� ���� ����� ������ �޼ҵ�� �߻� �޼ҵ��.
	public abstract void sound();
}
