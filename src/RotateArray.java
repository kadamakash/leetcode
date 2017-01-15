/**
 * Created by Akash on 1/15/2017.
 */
public class RotateArray {

    public void rotate(int[] nums, int k){
        k = k % nums.length;

        reverse(nums, 0, nums.length - k - 1);

        reverse(nums, nums.length-k, nums.length-1);

        reverse(nums, 0, nums.length-1);
        for(int m : nums){
            System.out.print(m);
        }

    }

    void reverse(int[] nums, int i, int j){
        int temp = 0;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }

    public static void main(String args[]){
        RotateArray obj = new RotateArray();

        int a[] = {1,2,3,4,5,6,7};
        obj.rotate(a, 3);

    }
}
