 class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//create array of size(length of 1st array plus length of second array)
		int[] fin = new int[nums1.length + nums2.length] ;
		
		int i =0;
		int j = 0;
		int k = 0;

		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] < nums2[j]) {
				fin[k] = nums1[i];
				i++;
				k++;
			}
			else {
				fin[k] = nums2[j];
				j++;
				k++;
			}
		}
		
		if(i < nums1.length) {
			while(i < nums1.length) {
				fin[k] = nums1[i];
				k++;
				i++;
			}
		}
		else {
			while(j < nums2.length) {
				fin[k] = nums2[j];
				k++;
				j++;
			}
		}
		
	
		if(fin.length % 2 ==  0) {
			return (fin[fin.length/2] + fin[(fin.length/2)- 1] ) / (2 * (1.0));
		}
		else {
			return fin[fin.length/2];
		}
	    
		
        
        
        
        
    }
       
}
