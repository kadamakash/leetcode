/**
 * Created by Akash on 1/29/2017.
 */
public class NumberOfIslands {

    private int count = 0;
    private int m;
    private  int n;

    private void checkNeighbours(char[][] grid, int i, int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';

        checkNeighbours(grid, i+1, j);
        checkNeighbours(grid, i-1, j);
        checkNeighbours(grid, i, j+1);
        checkNeighbours(grid, i, j-1);

    }

    public int numIslands(char[][] grid){
        m = grid.length;
        if(m == 0) return 0;
        n = grid[0].length;
        for(int row=0; row < m; row++){
            for(int col=0; col < n; col++){

                if(grid[row][col] == '1'){
                    checkNeighbours(grid, row, col);
                    ++count;
                }
            }
        }

        return count;
    }

    public static void main(String args[]){
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};

        NumberOfIslands obj = new NumberOfIslands();
        System.out.print(obj.numIslands(grid));
    }
}
