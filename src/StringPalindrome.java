import java.util.Arrays;

/**
 * Created by Akash on 2/7/2017.
 */
public class StringPalindrome {

    public static Boolean isPalindrome(String s){
        if(s.isEmpty()) return true;

        int head = 0;
        int tail = s.length()- 1;
        char headC;
        char tailC;

        while (head <= tail){
            headC = s.charAt(head);
            tailC = s.charAt(tail);

            if(!Character.isLetterOrDigit(headC)){
                head++;
            } else if (!Character.isLetterOrDigit(tailC)){
                tail--;
            } else {
                if(Character.toLowerCase(headC) != Character.toLowerCase(tailC)){
                    return false;
                }
                head++;
                tail--;
            }
        }
    return true;
    }

    public static void main(String[] args){
        String in = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(in));
        String ar[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Arrays.sort(ar);
        for(String s: ar){
            System.out.println(s);
        }
    }
}
