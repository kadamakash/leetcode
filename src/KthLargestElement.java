/**
 * Created by Akash on 2/13/2017.
 */
public class KthLargestElement {
    static int nums[] = {10,100,30,20,5,200,15,25};
    private static int findElement(int[] nums, int k){
        if( k< 1 || nums == null){
            return 0;
        }
        return kthLargest(nums,  nums.length-k+1,0, nums.length-1);
    }

    private static int kthLargest(int[] nums, int k, int left, int right){
        int pivot = nums[left];
        int start = left;
        int end = right;

        while(true){
            while (nums[start] < pivot && start < end){
                start++;
            }
            while(nums[end] >= pivot && start < end){
                end--;
            }
            if(start == end) break;

            swap(nums, start, end);
        }
        swap(nums, start, end);

        if(k == start+1){ return pivot;}
        else if(k < start + 1){
            return kthLargest(nums, k, left, start-1);
        }
        else {
            return kthLargest(nums, k, start+1, right);
        }

    }

    private static void swap(int[] nums, int l, int r){
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }

    public static void main(String[] args){

        System.out.println(findElement(nums, 3));
    }
}
