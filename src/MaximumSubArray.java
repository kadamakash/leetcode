/**
 * Created by Akash on 1/29/2017.
 */
public class MaximumSubArray {

    public int maxSubArray(int[] nums){
        int maxCurrent = nums[0];
        int maxOverall = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxCurrent = Math.max(maxCurrent + nums[i], nums[i]);
            maxOverall = Math.max(maxOverall, maxCurrent);
        }
        return maxOverall;
    }

    public static void main(String[] args){
        MaximumSubArray obj = new MaximumSubArray();
        int a[] = {1,-3,4,6,-2,-7,2,5,3,-1,5,6};
        System.out.print(obj.maxSubArray(a));
    }
}
