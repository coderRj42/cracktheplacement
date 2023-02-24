package recursion;

public class gto2 {
static int fun(int n ) {
	if(n==1) return 0;
	else 
		return 1+fun(n/2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(16));

	}

}
