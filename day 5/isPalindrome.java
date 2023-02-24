package recursion;

public class isPalindrome {
	static boolean palindrome(String s,int r,int l) {
		if(l>=r) return true;
		return (s.charAt(l)==s.charAt(r))&& palindrome(s, r--, l++);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(palindrome("racecar", 0, 7));
	}

}
