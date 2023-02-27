package arrays;

public class insert {
	static int ins(int a[],int n,int x,int pos,int cap){
		{
			if(n==cap) return n ;
			int idx=pos-1;
			int i;
			for(i=n-1;i>idx;i--){
				a[i+1]=a[i];
				a[idx]=x;		
			}
		
			return (i+1);
		}
	}
		public static void main(String[] args) {
		int a[] ={1,2,3,5};;

		}

	}
