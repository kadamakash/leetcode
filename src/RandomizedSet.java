import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Akash on 1/23/2017.
 */
public class RandomizedSet {

    List<Integer> nums;
    Map<Integer, Integer> map;
    java.util.Random rand = new java.util.Random();

    /** Initialize your data structure here. */
    public RandomizedSet() {

        nums = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contains = map.containsKey(val);
        if(map.containsKey(val)){
            return false;
        } else {
            map.put(val, nums.size());
            nums.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int loc = map.get(val);
            if(loc < nums.size()-1){
                int last = nums.get(nums.size() - 1);
                nums.set(loc, last);
                map.put(last, loc);
            }
            map.remove(val);
            nums.remove(nums.size()-1);
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }

    public static void main(String args[]){
        RandomizedSet obj = new RandomizedSet();
        obj.insert(1);
        obj.insert(20);
        obj.remove(20);
        System.out.print(obj.getRandom());
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

