/**
 * Created by Akash on 1/25/2017.
 */
public class FindDuplicate3 {

    public int findduplicate(int nums[]){
        if (nums.length > 1)
        {
            int slow = nums[0];
            //System.out.print(slow);
            int fast = nums[nums[0]];
            //System.out.print(fast);
            //System.out.println();
            while (slow != fast)
            {
                slow = nums[slow];
                //System.out.print(slow);
                fast = nums[nums[fast]];
                //System.out.print(fast);
                //System.out.println();
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
               // System.out.print(fast);
                slow = nums[slow];
               // System.out.print(slow);
               // System.out.println();
            }
            return slow;
        }
        return -1;
    }

    public static void main(String args[]){
        int a[] = {4,2,3,2,1};
        FindDuplicate3 obj = new FindDuplicate3();
        System.out.print(obj.findduplicate(a));
    }
}
