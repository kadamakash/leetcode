import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Akash on 2/7/2017.
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs){

        if(strs == null || strs.length == 0) return new ArrayList<List<String>>();

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        //Arrays.sort(strs);
        for(String s : strs){
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String k = String.valueOf(ar);
            //System.out.println(k);

            if(!map.containsKey(k)){
                map.put(k, new ArrayList<String>());
            }
                map.get(k).add(s);

        }
        return new ArrayList<List<String>>(map.values());

    }

    public static void main(String[] args){
        String[] ar = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.print(groupAnagrams(ar));
    }
}
