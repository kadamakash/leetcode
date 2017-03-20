/**
 * Created by Akash on 2/10/2017.
 */
public class LongestPalindromicSubsequence {

    private static int findSubsequence(String s){
        int length = s.length();
        return findPalindrome(s, new int[length][length], 0, length-1);
    }

    private static int findPalindrome(String s, int[][] memo, int i, int j){
        if(memo[i][j] != 0 ) return memo[i][j];
       if(i>j) return 0;
       if(i == j) return 1;

       if(s.charAt(i) == s.charAt(j)){
           memo[i][j] = 2 + findPalindrome(s, memo, i+1, j-1);
       } else {
           memo[i][j] = Math.max(findPalindrome(s, memo, i+1, j), findPalindrome(s, memo, i, j-1));
       }
       return memo[i][j];


    }

    // recursive without memoization
    private static int palindSubs(String s){
        return findPalind(s, 0, s.length()-1);

    }
    private static int findPalind(String s, int i, int j){
        if(i==j) return 1;
        else if(s.charAt(i) == s.charAt(j)){
            return  2 + findPalind(s, i+1, j-1);
        } else {
            return Math.max(findPalind(s, i+1, j), findPalind(s, i, j-1));
        }
    }

    public static void main(String[] args){
        String in = "turboventilator";

        System.out.println(palindSubs(in));
    }
}
