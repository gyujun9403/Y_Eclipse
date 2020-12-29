package sec02.exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "array", "copy", "method"};
		String[] newStrArray =  new String[5];
		
		if(oldStrArray.length <= newStrArray.length)
			System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String str:newStrArray) 
			System.out.println(str);
		
	}

}
