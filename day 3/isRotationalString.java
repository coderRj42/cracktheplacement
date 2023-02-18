package Strings;

public class isRotationalString {
	static boolean rotaitonalString(String s1,String s2) {
		if(s1.length()==s2.length()){
			return true;
		}
		String doubleString = s1+s2;
		return doubleString.contains(s2);
	}
	public static void main(String[] args) {
	String s1="abcd";
	String s2 ="cdab";
    System.out.println(rotaitonalString(s1, s2));
	}

}
