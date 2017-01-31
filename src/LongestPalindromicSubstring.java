/**
 * Created by Akash on 1/30/2017.
 */
public class LongestPalindromicSubstring {

    int start;
    int maxLen = 0;
    private String longestPalindrome(String s){
        int n = s.length();

        if(n < 2) return s;

        for(int i = 0; i < n-1; i++){
            expandString(s, i, i);
            expandString(s, i, i+1);
        }

        return s.substring(start, start+maxLen);

    }

    private void expandString(String s, int i1, int i2){
        int l = i1;
        int r = i2;
        int n = s.length();

        while( l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        if(maxLen < r-l-1){
            start = l+1;
            maxLen = r-l-1;
        }

    }

    public static void main(String[] args){
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();

        String s = "aabbcfdaba";
        System.out.print(obj.longestPalindrome(s));
    }
}
