/**
 * Created by Akash on 1/29/2017.
 */
public class ProductExceptSelf {

    private int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        int right = 1;
        for(int i = 1; i < n; i++){
            res[i] = nums[i-1] * res[i-1];
        }

        for(int i = n-1; i >=0; i--){
            res[i] *= right;
            right *= nums[i];
        }

        return res;

    }

    public static void main(String args[]){
        ProductExceptSelf obj = new ProductExceptSelf();
        int a[] = {1,2,3,4};
        int b[] = obj.productExceptSelf(a);

        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i]+",");
        }

    }


}
