import java.util.HashMap;

/**
 * Created by Akash on 2/12/2017.
 */
public class LongestConsecutiveSubsequence {

    private static int longestConsecutive(int[] nums){
        int result = 0, left, right, sum;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(!map.containsKey(n)){
                System.out.println("For n = " + n);
                left = map.containsKey(n-1) ? map.get(n-1) : 0;
                right = map.containsKey(n+1) ? map.get(n+1) : 0;
                System.out.println("Left = " + left);
                System.out.println("Right = " + right);
                sum = left + right + 1;
                System.out.println("Sum = " + sum);
                System.out.println("n-l = " + (n-left));
                System.out.println("n+r = " + (n+right));
                System.out.println();

                map.put(n, sum);

                result = Math.max(result, sum);

                map.put(n-left, sum);
                map.put(n+right, sum);
            } else continue;
        }

        return result;
    }
    public static void main(String args[]){
        int nums[] = {100,1,200,3,2,4};

        System.out.println(longestConsecutive(nums));
    }
}
