package Strings;

public class checkSubsequence {
	static boolean issubsequence(String s1, String s2)
	{
	    int n = s1.length(), m = s2.length();
	    int i = 0, j = 0;
	    while (i < n && j < m) {
	        if (s1.charAt(i) == s2.charAt(j))
	            i++;
	        j++;
	    }
	    
	    return i == n;
	}
	public static void main(String[] args) {
	    String s1 = "abc";
	    String s2 = "baacd";
	    if (issubsequence(s1, s2))
	        System.out.println("yes");
	    else
	        System.out.println("false");

	}

}
