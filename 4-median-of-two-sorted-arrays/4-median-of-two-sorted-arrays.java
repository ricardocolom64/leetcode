class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] both = new int[size];
        double median = 0.0;
        
        int count = 0;
        int i = 0;
        int j = 0;
        while(count < both.length)
        {
            if(j > nums2.length - 1)
            {
                both[count] = nums1[i];
                i++;
            }
            else if(i > nums1.length - 1)
            {
                both[count] = nums2[j];
                j++;
            }           
            
            else if(nums1[i] < nums2[j])
            {
                both[count] = nums1[i];
                i++;
            }
            else
            {
                both[count] = nums2[j];
                j++;
            }
            
            System.out.println(both[count]);
            count++;
        }
        
        if(size % 2 == 1)
        {            
            median = both[size / 2];
        }
        else
        {
            median = ((both[size/2 - 1] + both[size/2] ) / 2.0);
        }
        
        return median;
    }
}