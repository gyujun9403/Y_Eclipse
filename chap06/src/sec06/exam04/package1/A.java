package sec06.exam04.package1;

public class A {
	//������
	A(){}				//default�� �⺻ ������
	public A(boolean b) {}	//public ������
	private A(String s) {}	//private ������
	
	A a1 = new A();			//���� ����
	A a2 = new A(true);		//���� ����
	A a3 = new A("string");	//���� ����
}
