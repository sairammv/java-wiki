package maths;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(addDigitsRecursively(199));

    }

    public static int addDigitsRecursively(int num) {

        if (num == 0)
            return 0;

        return num % 9 == 0 ? 9 : num % 9;
    }

    public static int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int re = num % 10;
            sum += re;
            num = num / 10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }

}
