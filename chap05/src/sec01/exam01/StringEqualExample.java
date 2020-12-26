package sec01.exam01;

public class StringEqualExample {

	public static void main(String[] args) {
		String strval1 = "연규준";
		String strval2 = "연규준";
		String strval3 = new String("연규준");
		String strval4 = new String("연규준");
		
		System.out.println("String strval1 = \"연규준\";");
		System.out.println("String strval2 = \"연규준\";");
		if(strval1 == strval2) {System.out.println("strval1과 strval2는 참고가 같다.");}
		else {System.out.println("strval1과 strval2는 참고가 다르다.");}
		if(strval1.equals(strval2)) {System.out.println("strval1과 strval2는 내용이 같다.");}
		else {System.out.println("strval1과 strval2는 내용이 다르다.");}
		
		System.out.println("-------------------------------");
		
		System.out.println("String strval3 = new String(\"연규준\");");
		System.out.println("String strval4 = new String(\"연규준\");");
		if(strval3 == strval4) {System.out.println("strval3와 strval4는 참조가 같다.");}
		else {System.out.println("strval3과 strval4는 참고가 다르다.");}
		if(strval3.equals(strval4)) {System.out.println("strval3와 strval4는 내용이 같다.");}
		else {System.out.println("strval3과 strval4는 내용이 다르다.");}
	}
}
