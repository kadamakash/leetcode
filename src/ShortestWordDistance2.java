import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Akash on 1/23/2017.
 */
public class ShortestWordDistance2 {

    private Map<String, List<Integer>> map;

    public ShortestWordDistance2(String[] words){
        map = new HashMap<String, List<Integer>>();

        for(int i = 0; i < words.length; i++){
            String k = words[i];
            if(map.containsKey(k)){
                map.get(k).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(k,list);
            }
        }}

        public int shortest(String word1, String word2){
            List<Integer> list1 = map.get(word1);
            List<Integer> list2 = map.get(word2);
            int result = Integer.MAX_VALUE;
            int in1 = 0, in2 = 0;
            while(in1 < list1.size() && in2 < list2.size()){
                int w1 = list1.get(in1), w2 = list2.get(in2);
                result = Math.min(result, Math.abs(w1-w2));
                if(w1<w2) in1++;
                else in2++;

            }
            return result;
    }


    public static void main(String args[]){
        String words[] = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding"; String word2 = "perfect";

        ShortestWordDistance2 d = new ShortestWordDistance2(words);


        System.out.print(d.shortest(word1, word2));
    }
}
