import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Akash on 1/30/2017.
 */
public class MaximumSlidingWindow {

    private int[] maxSlidingWindow(int[] nums, int k){
        if(nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int res[] = new int[n-k+1];
        int ri = 0;

        Deque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            // remove all the elements from the head of the q which do not belong to the current window
            while(!q.isEmpty() && q.peek() < i-k+1){
                q.poll();
            }

            // remove all elements from the tail of the queue which are less than the current element
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }

            // add element in the queue
            q.offer(i);
            if(i >= k-1){
                res[ri++] = nums[q.peek()];
            }
        }
        return res;
    }

    public  static void main(String[] args){
        MaximumSlidingWindow obj = new MaximumSlidingWindow();

        int a[] = {1,3,-1,-3,5,3,6,7};
        int r[] = obj.maxSlidingWindow(a,3);

        for(int i:r){
            System.out.print(i+",");
        }
    }
}
