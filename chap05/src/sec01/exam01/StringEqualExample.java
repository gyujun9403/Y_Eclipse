package sec01.exam01;

public class StringEqualExample {

	public static void main(String[] args) {
		String strval1 = "������";
		String strval2 = "������";
		String strval3 = new String("������");
		String strval4 = new String("������");
		
		System.out.println("String strval1 = \"������\";");
		System.out.println("String strval2 = \"������\";");
		if(strval1 == strval2) {System.out.println("strval1�� strval2�� ���� ����.");}
		else {System.out.println("strval1�� strval2�� ���� �ٸ���.");}
		if(strval1.equals(strval2)) {System.out.println("strval1�� strval2�� ������ ����.");}
		else {System.out.println("strval1�� strval2�� ������ �ٸ���.");}
		
		System.out.println("-------------------------------");
		
		System.out.println("String strval3 = new String(\"������\");");
		System.out.println("String strval4 = new String(\"������\");");
		if(strval3 == strval4) {System.out.println("strval3�� strval4�� ������ ����.");}
		else {System.out.println("strval3�� strval4�� ���� �ٸ���.");}
		if(strval3.equals(strval4)) {System.out.println("strval3�� strval4�� ������ ����.");}
		else {System.out.println("strval3�� strval4�� ������ �ٸ���.");}
	}
}
