package arrays;

public class search {
	static int search (int []a,int n ,int x) {
		for (int i =0;i<n;i++) {
			if(a[i]==x) return x;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,5,20,15,16};
System.out.println(search(a, 7, 5));
	}

}
