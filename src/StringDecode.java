import java.util.Stack;

/**
 * Created by Akash on 2/18/2017.
 */
public class StringDecode {

    private static String decodedString(String s){
        Stack<Integer> countStack = new Stack<Integer>();
        Stack<String> stringStack = new Stack<String>();

        int i = 0;
        String res = "";

        while( i < s.length()){

            if(Character.isDigit(s.charAt(i))){
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = 10 * count + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if(s.charAt(i) == '['){
                stringStack.add(res);
                i++;
                res = "";
            } else if(s.charAt(i) == ']'){
                int count = countStack.pop();
               // System.out.println("String stack = "+stringStack.peek());
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for(int j = 0 ; j < count; j++){
                    temp.append(res);
                }
                res = temp.toString();
                i++;
            }

            else {
                res += s.charAt(i++);
            }
        }
        return res;
    }

    public static void main(String[] args){
        String d = "3[a]2[bc3[a]]";
        System.out.println(decodedString(d));
    }
}
