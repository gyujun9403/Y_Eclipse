package sec03.exam01;

public abstract class Phone {
	public String owner;
	public Phone(String owner) {this.owner = owner;}
	 
	public void on() {System.out.println("������ ŵ�ϴ�.");}
	public void off() {System.out.println("������ ���ϴ�.");}
}
;