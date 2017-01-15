/**
 * Created by Akash on 1/15/2017.
 */
public class MajorityElement {

    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    public static void main(String args[]){
        MajorityElement obj = new MajorityElement();
        int a[] = {2,2,2,2,1,1};
        System.out.print(obj.majorityElement(a));
    }
}
