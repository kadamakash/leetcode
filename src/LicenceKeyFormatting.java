/**
 * Created by Akash on 2/5/2017.
 */
public class LicenceKeyFormatting {

    private String formatter(String S, int K){

        StringBuilder re = new StringBuilder();
        for(int i = S.length()-1; i >=0; i--){
            if(S.charAt(i) != '-'){
                //re.append(((re.length() % K) == 0) ? "-" : "").append(S.charAt(i));
                re.append(re.length() % (K + 1) == K ? '-' : "").append(S.charAt(i));
            }
        }
        return re.reverse().toString().toUpperCase();
        /*String newS = s.replaceAll("-","").toUpperCase();

        int stringLength = newS.length();
        if(stringLength == 0) return "";
        int firstGroupElementCount = stringLength % k;

        StringBuilder result = new StringBuilder();

        int groupCounter = k;
        int count = 0;
        String formatter = "-";

        if(firstGroupElementCount > 0) {
            for(int i = 0; i < firstGroupElementCount; i++){
                result.append(newS.charAt(i));
            }
            result.append(formatter);
            for(int i = firstGroupElementCount; i < stringLength; i++){

                result.append(newS.charAt(i));
                count++;
                if(count == k){
                    result.append(formatter);
                    count = 0;
                }


            }

        } else {
            for(int i = 0; i < stringLength; i++){

                result.append(newS.charAt(i));
                count++;
                if(count == k){
                    result.append(formatter);
                    count = 0;
                }

            }
        }

        String finalS = result.toString();
        return finalS.substring(0, finalS.length()-1);*/
    }

    public static void main (String args[]){
        LicenceKeyFormatting obj = new LicenceKeyFormatting();
        String s = "2-4A0r7-4k";
        System.out.print(obj.formatter(s, 3));
    }
}
