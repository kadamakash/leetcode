/**
 * Created by Akash on 1/30/2017.
 */
public class StringCompression {

    private String compressString(String text) {
        int count = 1;
        char c = text.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < text.length(); i++) {

            if (c == text.charAt(i)) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(c);
                    sb.append(count);
                    c = text.charAt(i);
                    count = 1;
                } else {
                    sb.append(c);
                    c = text.charAt(i);
                }
            }
        }
        sb.append(c);
        if(count > 1) sb.append(count);

        if(sb.length() < text.length()){
             return sb.toString();
        }


        return sb.toString();

    }

    public static void main(String args[]){
        StringCompression obj = new StringCompression();
        String s = "abc";
        System.out.print(obj.compressString(s));



    }
}
