/**
 * Created by Akash on 1/29/2017.
 */
public class MatrixRotation {

    private  void rotate(int[][] matrix){

        int first = 0;
        int last =  0;
        int offset = 0;
        int n = matrix.length;

        for(int layer = 0 ; layer <  n/2; layer++){
            first = layer;
            last = n - layer - 1;
            for(int i = first; i < last; i++){
                offset = i-layer;

                int top = matrix[layer][i];

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];

                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top;


            }
        }
    }

    public static void main(String args[]){
        MatrixRotation obj = new MatrixRotation();

        int m[][] = {{1,2,3},{4,5,6}, {7,8,9}};

        obj.rotate(m);

        for(int i =0; i < m.length; i++){
            System.out.println();
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]);
            }
        }
    }
}
