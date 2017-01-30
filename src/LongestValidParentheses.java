import java.util.Stack;

/**
 * Created by Akash on 1/29/2017.
 */
public class LongestValidParentheses {

    private int longestValidParentheses(String s){
        Stack<Integer> stack = new Stack<>();
        int longest = s.length();
        int res=0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.add(i);
            }
            else{
                if(stack.isEmpty()){
                    stack.add(i);
                } else {
                    if(s.charAt(stack.peek()) == '(') stack.pop();
                    else stack.add(i);
                }
            }
        }

        if(stack.isEmpty()) return longest;
        else{
            int a = longest, b = 0;
            while (!stack.isEmpty()){
                b = stack.pop();
                System.out.println("b = " + b);
                res = Math.max(res, a-b-1);
                a = b;
            }
            System.out.println("a = " +a);
            System.out.println("res = " +res);
            res = Math.max(a,res);
        }
        return res;
    }

    public static void main(String[] args){
        LongestValidParentheses obj = new LongestValidParentheses();
        String s = "(()((()()(((()(()()()()((()))";
        System.out.println(obj.longestValidParentheses(s));
    }
}
