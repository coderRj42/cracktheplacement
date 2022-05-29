class Solution {
    public void sortColors(int[] a) {
        int c=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                int temp = a[i];
                a[i]=a[c];
                a[c]=temp;
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==1){
                int temp = a[i];
                a[i]=a[c];
                a[c]=temp;
                c++;
            }
        }
    }
}
