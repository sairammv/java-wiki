package leetcodebiweekly72;

public class ThreeConsecutivesToGivenNumber {
    public static void main(String[] args) {

        System.out.println(sumOfThree(33));
        System.out.println(sumOfThree(4));
    }

    public static long[] sumOfThree(long num) {

        long[] threeValues = new long[3];

        if (num % 3 == 0) {

            long result = num / (long) 3;
            threeValues[0] = result - 1;
            threeValues[1] = result;
            threeValues[2] = result + 1;
            return threeValues;
        } else {
            long[] emptyArr = {};
            return emptyArr;
        }
    }
}
