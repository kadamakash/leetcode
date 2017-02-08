import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akash on 2/7/2017.
 */
public class FlipGame {

    public static List<String> generateComb(String in){
        List<String> list = new ArrayList<>();

        for(int i = 1; i < in.length(); i++){
            if(in.charAt(i) == '+' && in.charAt(i-1) == '+'){
                list.add(in.substring(0,i-1) + "--"+ in.substring(i+1, in.length()));
            }
        }
        return list;
    }

    public static void main (String args[]){
        String in = "++++";
        System.out.print(generateComb(in));
    }
}
