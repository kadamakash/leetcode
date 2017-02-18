/**
 * Created by Akash on 2/15/2017.
 */
public class MaxOnes {
    static int count = 0;
    static int index  = 0;
    static int r = 0;
    static int max = Integer.MIN_VALUE;
    public static int findMaxOnes(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){

            while(index < matrix[0].length){
                if(matrix[row][index] == 1){
                    count++;
                    index++;
                } else break;
            }


            if( max < count){
                max = count;
                r = row;}

        }
        return r;
    }

    public static void main(String[] args){
        int[][] m = {{1,1,1,1,1,1,1}, {1,1,1,0,0,0,0},{1,0,0,0,0,0,0},{1,1,1,1,1,1,0},
                {1,1,1,1,0,0,0}};
        System.out.print(findMaxOnes(m));
    }
}


/*

1100000
        1110000
        1000000
        1111110
        1111100

        int count = 0;
        int index  = 0;
        int r = 0;
        int max = MiniNT;
        for(int row = 0; row < matrix.length; row++){

        while(index < matrix[0].length){
        if(matrix[row][index] == 1){
        count++;
        index++;
        } else break;
        }


        if( max < count){
        max = count;
        r = row;}

        }
        return r;

        111111
        331315
        441411
        445221

        return -> output the sum of min cost path

        answer = 9

        00 01 02 03 04 14 24 25 35



        141111
        331315
        441411
        445221
*/






