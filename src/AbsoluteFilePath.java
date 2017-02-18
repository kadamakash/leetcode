/**
 * Created by Akash on 2/13/2017.
 */
public class AbsoluteFilePath {

    private static int findLength(String path){
        String[] paths = path.split("\n");
        int[] length = new int[paths.length + 1];
        int maxLength = 0;
        for(String s : paths){
            System.out.println("For String = " + s);
            int level = s.lastIndexOf("\t") + 1;
            System.out.println("Level = "+level);
            int currentLength = length[level] + s.length() - level + 1;
            System.out.println("Current Length = "+currentLength +": Storing at stack position = "+(level+1));
            length[level + 1] = currentLength;
            if(s.contains(".")) maxLength = Math.max(maxLength, currentLength-1);
            System.out.println();
        }
        return maxLength;
    }
    public static void main(String[] args){
        String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        System.out.print(findLength(path));
    }
}
