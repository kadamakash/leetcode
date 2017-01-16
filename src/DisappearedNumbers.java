import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akash on 1/15/2017.
 */
public class DisappearedNumbers {

    public List<Integer> findDisappearedNumber(int[] nums){
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i <nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                list.add(i+1);
        }

        return list;
    }

    public static void main(String args[]){
        DisappearedNumbers obj = new DisappearedNumbers();
        int[] a = {1,2,3,4,2,7,1,8};

        List<Integer> list = new ArrayList<Integer>();
        list = obj.findDisappearedNumber(a);
        for(int i : list){
            System.out.print(i);
        }
    }
}
