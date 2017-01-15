import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akash on 1/14/2017.
 */
public class PascalsTriangle {

    List<List<Integer>> generate(int numRows){

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();

        for(int i = 0; i < numRows; i++){
            row.add(0,1);
            for(int j = 1; j < row.size()-1; j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            list.add(new ArrayList<Integer>(row));
        }

        return list;
    }

    List<Integer> generateNew(int numRows){


        List<Integer> row = new ArrayList<Integer>();

            for(int i = 0; i < numRows+1; i++) {
                row.add(0, 1);
                for (int j = 1; j < row.size() - 1; j++) {
                    row.set(j, row.get(j) + row.get(j + 1));
                }
            }


        return row;
    }


    public static void main(String args[]){
        PascalsTriangle obj = new PascalsTriangle();

        List<Integer> nl = obj.generateNew(3);
        for(Integer n : nl){
            System.out.print(n.intValue());
        }

        List<List<Integer>> list = obj.generate(5);
        for(List<Integer> l : list){
            System.out.println();
            for(Integer i: l){
                System.out.print(i.intValue());

            }
        }

    }
}
