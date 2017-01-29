/**
 * Created by Akash on 1/25/2017.
 */
public class ClimbingStairs {

    private int climb(int n){
        int memo[] = new int[n];

        memo[0] = 1;
        memo[1] = 2;

       for(int i = 2; i < n; i++){
           memo[i] = memo[i-1] + memo[i-2];
       }
       return memo[n-1];
    }



    public static void main(String[] args){
        ClimbingStairs obj = new ClimbingStairs();
        int memo[] = new int[4];
        System.out.print(obj.climb(4));
    }
}
