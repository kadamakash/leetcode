/**
 * Created by Akash on 1/25/2017.
 * Given nums = [-2, 0, 3, -5, 2, -1]

 sumRange(0, 2) -> 1
 sumRange(2, 5) -> -1
 sumRange(0, 5) -> -3
 */
public class DPNumArray {

    int[] nums;
    public DPNumArray(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }

        this.nums = nums;
    }

    public int sumRange(int i, int j){
        if(i==0){
            return  nums[j];
        }
        else{
            return (nums[j] - nums[i-1]);
        }
    }

    public static void main(String[] args){
        int a[] = {-2,0,3,-5,2,-1};
        DPNumArray obj = new DPNumArray(a);
        System.out.print(obj.sumRange(0,5));
        System.out.print(obj.sumRange(2,5));
    }
}
