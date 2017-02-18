import java.util.HashMap;

/**
 * Created by Akash on 2/12/2017.
 */
public class NumberOfBoomerangs {

    private static int numberOfBoomerangs(int[][] points){
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i  = 0; i < points.length; i++){
            for(int j = 0; j<points[0].length; j++){
                if( i == j) {continue;}


                else{
                    System.out.println("i = " + i+" j = "+j);
                    int d = getDistance(points[i], points[j]);
                    System.out.println(d);
                    if(map.containsKey(d)){
                        map.put(d, map.get(d)+1);
                    } else {
                        map.put(d, 1);
                    }
                    System.out.println("value  = "+map.get(d));
                }

            }

            for(int val : map.values()){
                System.out.println("value =" +val);
                result += val * (val-1);
                System.out.println("result = "+result);
            }
            map.clear();
        }
      return result;
    }
    private static int getDistance(int[] a, int[] b){
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }
    public static void main(String[] args){
        int nums[][] = {{0,0}, {1,0}, {2,0}};

        System.out.println("number = "+numberOfBoomerangs(nums));
    }
}
