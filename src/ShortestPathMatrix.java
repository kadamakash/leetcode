/**
 * Created by Akash on 2/8/2017.
 */
public class ShortestPathMatrix {
    static int m[][] = {{1,2,3}, {4,5,1}, {1,2,7}};
    private static void findPath(int m[][]){

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j <m[0].length; j++){

                if(i == 0  && j == 0){
                    m[i][j] = m[i][j];
                } else if (i == 0 && j != 0){
                    m[i][j] = m[i][j] + m[i][j-1];
                } else if (i != 0 && j==0){
                    m[i][j] = m[i][j] + m[i-1][j];
                } else {
                    m[i][j] = Math.min(m[i-1][j], m[i][j-1]) + m[i][j];
                }
            }
        }

    }
    public static void main(String[] args){

        findPath(m);

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
