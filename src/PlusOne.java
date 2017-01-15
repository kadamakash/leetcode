/**
 * Created by Akash on 1/15/2017.
 */
public class PlusOne {

    public int[] addOne(int digits[]){
        for(int i = digits.length-1; i >=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
            if(digits[0] == 0){
                int[] nw= new int[digits.length+1];
                nw[0] = 1;
                return nw;
            }

        return  digits;

    }
    public static void main(String args[]){
        PlusOne obj = new PlusOne();
        int a[] = {9,9,9,9};
        int b[] = obj.addOne(a);
        for(int i : b){
            System.out.print(i);
        }
    }
}
