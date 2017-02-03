import java.util.LinkedList;
import java.util.List;

/**
 * Created by Akash on 1/30/2017.
 */
public class PhoneNumberCombination {

    private List<String> letterCombinations(String digits){
        LinkedList<String> list = new LinkedList<>();
        String map[] = {"0","1","abc","def","ghi","jkl","mno","pqr","stuv","wxyz"};

        list.add("");
        for(int i = 0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));

            while(list.peek().length() == i){
                String t = list.poll();
                for(char c : map[x].toCharArray()){
                    list.add(t+c);
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        PhoneNumberCombination obj = new PhoneNumberCombination();
        String s = "22";
        System.out.print(obj.letterCombinations(s));
    }
}
