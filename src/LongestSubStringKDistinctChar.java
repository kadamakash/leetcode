import java.util.HashMap;

/**
 * Created by Akash on 2/13/2017.
 */
public class LongestSubStringKDistinctChar {

    private static int longestSubstring(String s, int k){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0, max = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            while (map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0 ){
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max, i-left+1);
        }
        return max;
    }
    public static void main(String args[]){
        String s = "eceba";
        System.out.println(longestSubstring(s, 3));
    }
}
