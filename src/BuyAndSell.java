/**
 * Created by Akash on 1/16/2017.
 */
public class BuyAndSell {

    public int maxProfit(int[] nums){
        int curMin = nums[0];
        int max = 0;

        for(int i=0; i<nums.length; i++){
            if(curMin < nums[i]){
                max = Math.max(max, nums[i] - curMin);
            }
            else{
                curMin = nums[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int a[] = {7, 1, 5, 3, 6, 4};
        BuyAndSell o = new BuyAndSell();
        System.out.print(o.maxProfit(a));
    }
}
