package recursion;

public class sumNatural {
	static int sum(int n ) {
		if(n<=0) return n ;
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}

}
