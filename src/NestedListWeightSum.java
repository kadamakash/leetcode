/**
 * Created by Akash on 1/23/2017.
 */
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
/*public class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList){
        return helper(nestedList, 1);
    }

    public  int helper(List<NestedInteger> list, int depth){
        int result = 0;

        (for NestedInteger n : list){
            result += n.isInteger() ? n.getInteger() * depth : helper(n.getList(), depth+1);
        }
        return result;
    }
}*/
