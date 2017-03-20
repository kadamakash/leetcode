/**
 * Created by Akash on 3/5/2017.
 */
public class DPCountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int result = 10;
        int uniqueDigits = 9;
        int availableCount = 9;

        while(n-->1 && availableCount>0){
            uniqueDigits = uniqueDigits * availableCount;
            result = result + uniqueDigits;
            availableCount--;
        }
        return result;
    }
}
