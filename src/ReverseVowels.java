import java.util.HashSet;

/**
 * Created by Akash on 2/12/2017.
 */
public class ReverseVowels {

    private static String reverseVowels(String s){
        HashSet<Character> set = new HashSet<Character>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !(set.contains(arr[i]))) {
                i++;
            }
            while ((i < j && !(set.contains(arr[j])))) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static void main(String args[]){
        String a = "hello";
        System.out.println(reverseVowels(a));
    }
}
