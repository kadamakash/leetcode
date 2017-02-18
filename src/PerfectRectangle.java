import java.util.HashSet;

/**
 * Created by Akash on 2/12/2017.
 */
public class PerfectRectangle {

    public static boolean isRectangleCover(int[][] rectangles){
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        HashSet<String> set = new HashSet<String>();

        long area = 0;

        for(int[] rect : rectangles){
            x1 = Math.min(x1, rect[0]);
            y1 = Math.min(y1, rect[1]);
            x2 = Math.max(x2, rect[2]);
            y2 = Math.max(y2, rect[3]);

            String c1 = rect[0] + "" + rect[1];
            String c2 = rect[2] + "" + rect[1];
            String c3 = rect[2] + "" + rect[3];
            String c4 = rect[0] + "" + rect[3];

            area += (rect[2] - rect[0]) * (rect[3] - rect[1]);
            System.out.println(area);

            if(!set.add(c1)) set.remove(c1);
            if(!set.add(c2)) set.remove(c2);
            if(!set.add(c3)) set.remove(c3);
            if(!set.add(c4)) set.remove(c4);
        }

        System.out.println((x2-x1) * (y2 - y1));
        if(!(set.contains(x1+""+y1)) || !(set.contains(x2+""+y2)) || !(set.contains(x1+""+y2)) || !(set.contains(x2+""+y1)) || set.size()!=4) return false;
        return (area == ((x2-x1) * (y2 - y1)));
    }
    public static void main(String[] args){
        int[][] rectangles = {{1,1,3,3}, {1,3,4,4}, {3,1,4,3}};
        int[][] rectangles1 = {{1,1,3,3}, {3,1,4,2}, {1,3,2,4}, {2,2,4,4}};
        int[][] rectangles2 = {{0,0,1,1}, {0,1,3,2}, {1,0,2,2}};

        System.out.println(isRectangleCover(rectangles2));
    }
}
