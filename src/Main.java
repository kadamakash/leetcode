import java.util.*;

/**
 * Created by Akash on 3/9/2017.
 */


public class Main {

    public static List<Map<Integer,String>> atheniumGrading(List<Integer> scores) {
        List<Map<Integer, String>> scoresWithGrades = new ArrayList<>();
        Map<Integer, String> scoreMapping;

        // first remove all the duplicates and sort them in descending order
        Set<Integer> sortedNonDuplicateScores = removeDuplicatesAndSort(scores);

        // creating an array to store all the letter grades
        String[] letterGrade = {"A","B","C","D","F"};

        // the value at each index from 0 to 4 in this array indicates the
        // count of students getting a specific grade.
        // eg: gradeBucket[0] = 4 indicates 4 students will get grade A;
        double[] gradeBucket = new double[5];


        int listLength = sortedNonDuplicateScores.size();

        // as the grades are A, B, C, D, & F the count is 5
        int numberOfLetterGrades = 5;

        // if the scores count is less than 5 then perform absolute grading
        // else perform relative grading
        if(listLength <= 5){
            return absoluteGrading(sortedNonDuplicateScores);
        }

        // division gives you the initial bucket value for each grade
        double division = Math.floor(listLength / numberOfLetterGrades);
        // mod gives the remainder of the division which can be distrubted
        // evenly among buckets
        double mod = listLength % numberOfLetterGrades;

        // distributes the remainder from top to bottom buckets
        for(int i=0; i < gradeBucket.length; i++){
            gradeBucket[i] = division;
        }
        int count = 0;
        while(mod>0){
            gradeBucket[count++]++;
            mod--;
        }

        // these indexes are used to access specific grade bucket and their
        // corresponding grade values.
        int letterGradeIdx = 0;
        int gradeBucketIdx = 0;

        // in this loop we iterate on the sorted unique value set to map the interger
        // values to their letter grades
        for(int n : sortedNonDuplicateScores){
            scoreMapping = new HashMap<>();
            letterGradeIdx = gradeBucket[gradeBucketIdx] == 0 ? gradeBucketIdx++ : gradeBucketIdx;
            scoreMapping.put(n, letterGrade[gradeBucketIdx]);
            gradeBucket[gradeBucketIdx]--;
            scoresWithGrades.add(scoreMapping);
        }

        return scoresWithGrades;
    }

    // This methods takes in a list of Integer values and returns a set
    // which contains non-duplicate values sorted in descending order
    private static Set<Integer> removeDuplicatesAndSort(List<Integer> scores){
        Collections.sort(scores);
        Collections.reverse(scores);
        Set<Integer> set = new LinkedHashSet<>(scores);

        return set;
    }

    // This method is called when the score count is less than or equal to 5
    // to perform absolute grading
    private static List<Map<Integer,String>> absoluteGrading(Set<Integer> scores){
        List<Map<Integer,String>> scoresWithGrades = new ArrayList<>();
        Map<Integer, String> scoreMapping;

        for(int num: scores){
            scoreMapping = new HashMap<>();
            if(num >= 90){
                scoreMapping.put(num, "A");
                scoresWithGrades.add(scoreMapping);
            }
            else if(num < 90 && num >= 80){
                scoreMapping.put(num, "B");
                scoresWithGrades.add(scoreMapping);
            }
            else if(num < 80 && num >= 70){
                scoreMapping.put(num, "C");
                scoresWithGrades.add(scoreMapping);
            }
            else if(num < 70 && num>= 60){
                scoreMapping.put(num, "D");
                scoresWithGrades.add(scoreMapping);
            }
            else {
                scoreMapping.put(num, "F");
                scoresWithGrades.add(scoreMapping);
            }
        }

        return scoresWithGrades;
    }



    public static void main(String[] args){

        // For this problem I am assuming that the input to the function will
        // always be an Arraylist of Integer
        List<Integer> scores = new ArrayList<Integer>(Arrays.asList(99, 92, 91, 91, 89, 85, 83, 82, 80, 79, 78,
                78, 77, 76, 75, 74, 62, 55, 43, 20));

        // test scenarios
        List<Integer> scores1 = new ArrayList<Integer>(Arrays.asList(101, 101, 101, 101, 101, 101, 101));
        List<Integer> scores2 = new ArrayList<Integer>(Arrays.asList(10, 51, 51, 81, 101, 101, 101));
        List<Integer> scores3 = new ArrayList<Integer>(Arrays.asList(101, 101, 101, 101, 101, 101, 101, 70, 90, 40, 50));
        List<Integer> scores4 = new ArrayList<Integer>(Arrays.asList(101, 80, 90, 50, 77, 88, 68, 89, 91, 100));


        List<Map<Integer, String>> result = atheniumGrading(scores);

        // To display the result uncomment the following code
        /*for(Map<Integer,String> kv : result){
            for(int k : kv.keySet()){
                String grade = kv.get(k);
                System.out.println(k+","+ grade);
            }
        }*/
    }
}
