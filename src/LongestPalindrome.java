import java.util.HashSet;

/**
 * Created by Akash on 1/30/2017.
 */
public class LongestPalindrome {

    private int LongestPalindrome(String s){
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()) return count*2+1;
        else return count*2;
    }

    public static void main(String[] args){
        LongestPalindrome obj = new LongestPalindrome();
        String s ="agbdba";
        System.out.print(obj.LongestPalindrome(s));
    }
}
