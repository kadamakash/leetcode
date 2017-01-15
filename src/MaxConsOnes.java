/**
 * Created by Akash on 1/15/2017.
 */
public class MaxConsOnes {

    int findMaxConsecutiveOnes(int[] nums){
        int maxCount = 0;
        int count = 0;

        for(int a: nums){

                if(a==1){
                    count++;
                    if(maxCount < count) maxCount = count;
                }
                else{
                    count=0;
                }

        }
        return maxCount;
    }
    public static void main(String args[]){
        int a[] = {1,1,0,1,1,1,0};
        MaxConsOnes obj = new MaxConsOnes();
        System.out.print(obj.findMaxConsecutiveOnes(a));
    }
}
