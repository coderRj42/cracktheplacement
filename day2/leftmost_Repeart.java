package Strings;

public class leftmost_Repeart{

	  
	  static int firstRepeating(char[] str) {
	    int[] freq = new int[256];
	      for (int i = 0; i < str.length; i++) {
	      freq[str[i]]++;
	    }
	    for (int i = 0; i < str.length; i++) {
	      if (freq[str[i]] > 1) {
	        return i;
	      }
	    }
	    return -1;
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RACECAR";
		char[]arr=s.toCharArray();
		int repeat = firstRepeating(arr);
		if(repeat==-1) {
			System.out.println("empty or distict");
		}
		else System.out.printf("%c",arr[repeat]);
	}

}
