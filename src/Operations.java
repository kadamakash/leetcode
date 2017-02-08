/**
 * Created by Akash on 2/4/2017.
 */
public class Operations {

    private int findCount(int n){
        int count = 0;
        while(n > 1){
            if( n % 2 == 0){
                n = n / 2;
                count++;
                continue;
            }
            n--;
            count++;

        }
        return count;
    }

    public static void main(String args[]){
        Operations op = new Operations();
        System.out.print(op.findCount(11));

    }
}
