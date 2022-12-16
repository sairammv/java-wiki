package leetcodeweekly281;

public class CountEvenIntegersSum {
    public static void main(String[] args) {

        System.out.println(countEven(4));
        System.out.println(countEven(30));
    }

    public static int countEven(int num) {

        int count = 0;

        for (int startIndex = 2; startIndex <= num; startIndex++) {

            if (digitsSum(startIndex) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int digitsSum(int num) {

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
