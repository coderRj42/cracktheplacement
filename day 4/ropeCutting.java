package recursion;

public class ropeCutting {
	static int  maxPiece(int n,int a ,int b ,int c ) {
		if(n==0) return 0;
		if(n<0) return -1;
		int r = Math.max(maxPiece(n-a, a, b, c),Math.max( maxPiece(n-b, a, b, c),maxPiece(n-c, a, b, c)));
		if(r==-1) return -1;
		return r+1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxPiece(23, 11, 9, 12));
	}

}
