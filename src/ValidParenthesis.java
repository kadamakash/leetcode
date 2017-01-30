import java.util.Stack;

/**
 * Created by Akash on 1/29/2017.
 */
public class ValidParenthesis {

    private boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "((({{[[]]}})))";
        ValidParenthesis obj = new ValidParenthesis();
        System.out.print(obj.isValid(s));

    }

    }

