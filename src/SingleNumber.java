/**
 * Created by Akash on 1/25/2017.
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Subscribe to see which companies asked this question

 Show Tags
 Show Similar Problems

 */
public class SingleNumber {

    int singleNumber(int[] nums){
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            System.out.print(result + "^" + nums[i] +"= ");
            result ^= nums[i];

            System.out.println(result);
        }
        return result;
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,4,3,2};
        SingleNumber obj = new SingleNumber();
        System.out.print(obj.singleNumber(a));
    }
}
