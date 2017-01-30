/**
 * Created by Akash on 1/29/2017.
 */
public class MaximumProductSubarray {

    private int maxProduct(int[] nums){

        if(nums.length == 0) return 0;

        int currMax = nums[0];
        int currMin = nums[0];
        int globalMax = nums[0];
        int localMax, localMin;

        for(int i = 1; i < nums.length; i++){
            localMax = Math.max((Math.max(currMax * nums[i], currMin * nums[i])), nums[i]);
            localMin = Math.min((Math.min(currMin * nums[i], currMax * nums[i])), nums[i]);
            globalMax = Math.max(localMax, globalMax);
            currMax = localMax;
            currMin = localMin;
        }
        return globalMax;
    }

    public static void main(String args[]){
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int a[] = {-2,3,-4};
        System.out.print(obj.maxProduct(a));
    }

}
