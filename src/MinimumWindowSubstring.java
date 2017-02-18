/**
 * Created by Akash on 2/17/2017.
 */
public class MinimumWindowSubstring {

    private static String minSubstring(String s, String t){

        int start = 0, end = 0, d = Integer.MAX_VALUE;
        int arr[] = new int[256];
        int counter = t.length();
        int head = 0;

        for(char c :  t.toCharArray()){
            arr[c]++;
        }

        while(end < s.length()){
            if(start < s.length() && arr[s.charAt(start++)]-- > 0) counter--;
            while(counter==0){
                if(end-start < d) d = end - (head=start);
                if(arr[s.charAt(start++)]++ == 0) counter++;
            }
        }
        return d == Integer.MAX_VALUE ? "" : s.substring(head, d);


    }
    public static void main(String args[]){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minSubstring(s,t));
    }
}
