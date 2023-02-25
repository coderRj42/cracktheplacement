package recursion;

public class sumSubset {
	static int countSubset(int arr[],int n ,int sum){
		if(n==0) return (sum==0)? 1:0;
		return countSubset(arr, n-1, sum)+countSubset(arr, n-1, sum-arr[n-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,2,3,4,5,6};;
System.out.println(countSubset(a, 6, 5));
	}

}
