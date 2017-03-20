/**
 * Created by Akash on 3/4/2017.
 */
public class DPUniquePaths {

    // O(m*n)
    private static int uniquePaths(int m, int n) {
        if(m==0 || n==0) return 0;
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }

        for(int i = 0; i < n; i++){
            dp[0][i] = 1;
        }

        for(int i = 1 ; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }

    private static int uniqueP(int m, int n){
        if(m>n) return uniqueP(n, m);

        int[] memo = new int[m];
        memo[0] = 1;

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                memo[j] += memo[j-1];
            }
        }
        return memo[m-1];
    }

    public static void main(String[] args){
        System.out.println(uniqueP(3,6));
    }
}
