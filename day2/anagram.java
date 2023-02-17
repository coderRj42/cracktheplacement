package Strings;

public class anagram {
public static void main(String[] args) {
    String s1 = "Race";
    String s2 = "Care";
    
    int a[]= new int [ 256];
    for(int i =0;i<s1.length();i++) {
    	a[s1.charAt(i)]++;
    }
    for(int i =0;i<s2.length();i++) {
    	a[s2.charAt(i)]--;
    }
    for(int e:a) {
    	if(e!=0) System.out.println("false");
    	System.out.println("true");
    }
    System.out.println("true");
}
}
