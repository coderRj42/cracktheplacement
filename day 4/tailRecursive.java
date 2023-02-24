package recursion;

public class tailRecursive {
static int fact(int n,int k ) {
	if(n==0|| n ==1) return 1;
	return n*fact(n-1,k+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6, 1));
	}

}
