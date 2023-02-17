package Strings;

public class reverseWordInString {
	public static void reversChar(char []s,int i,int j) {
		while(i<j) {
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
	}
	static String reverseWords(String s ) {
		char[] c= s.toCharArray();
		int start=0;
		int end=0;
		for(;end<s.length();end++) {
			if(c[end]==' ') {
				reversChar(c, start, end-1);
				start = end+1;
			}
		}
		reversChar(c, start,s.length()-1);
		reversChar(c, 0,s.length()-1);
		return new String(c);
	}
	public static void main(String[] args) {
		 String s= "I am the boss";
		 String p =(reverseWords(s));
		System.out.println((p));
	}

}
