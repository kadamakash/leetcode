import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akash on 2/10/2017.
 */
public class PermutationsNumbers {

    private static List<List<Integer>> permutations(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
       // System.out.println("Bactrack called");
        if(tempList.size() == nums.length){
           // System.out.println("permutation reached "+tempList);
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0; i < nums.length; i++){
               // System.out.println("i = "+i);
                if(tempList.contains(nums[i])) {
               //     System.out.println("already present so skipping");
                    continue;
                }
             //   System.out.println("adding = " + nums[i]);
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
             //   System.out.println("removing = " + nums[(tempList.size() - 1)]);
                tempList.remove(tempList.size()-1);
             //   System.out.print(tempList);
             //   System.out.println();


            }
        }


    }

    public static void main(String[] args){
        int a[] = {1,2,3};
        List<List<Integer>> result = permutations(a);


        System.out.println(result);
       // System.out.println( 4 & (1<<("aca".charAt(0)-'a')));
    }
}
