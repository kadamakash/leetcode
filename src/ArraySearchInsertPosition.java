/**
 * Created by Akash on 3/17/2017.
 */
public class ArraySearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans = i;
                break;
            } else if(nums[i] > target){
                ans = i;
                break;
            } else if(i == nums.length-1){
                ans = i+1;
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args){
        int nums[] = {1,3,4,5,9};
        int target = 10;
        System.out.println(searchInsert(nums,target));
    }
}
