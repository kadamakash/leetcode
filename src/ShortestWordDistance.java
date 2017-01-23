/**
 * Created by Akash on 1/23/2017.
 */
public class ShortestWordDistance {

    public int shortestDistance(String[] words, String word1, String word2){
        int i1 = -1, i2 = -1, min = Integer.MAX_VALUE;

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                i1 = i;
            }

            if(words[i].equals(word2)){
                i2 = i;
            }

            if(i1 != -1 && i2 != -1){
                min = Math.min(min, Math.abs(i1-i2));
            }
        }
        return min;
    }

    public static void main(String args[]){
        ShortestWordDistance d = new ShortestWordDistance();
        String words[] = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding"; String word2 = "makes";

        System.out.print(d.shortestDistance(words, word1, word2));
    }
}
