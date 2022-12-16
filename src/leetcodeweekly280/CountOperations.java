package leetcodeweekly280;

public class CountOperations {
    public static void main(String[] args) {
        System.out.println(countOperations(0,1));
        System.out.println(countOperations(2, 3));
        System.out.println(countOperations(10, 10));
        System.out.println(countOperations(1000000000, 1000000));
    }


    public static int countOperations(int num1, int num2) {
        int operationCount = 0;
        int difference = 0;

        while ((num1 > 0 && num2 > 0) && (num1 != 0 || num2 != 0)) {
            if (num1 > num2) {
                difference = num1 - num2;
                num1 = difference;
                operationCount++;
                if (num1 == 0) {
                    break;
                }
            } else if(num1 < num2) {
                difference = num2 - num1;
                num2 = difference;
                operationCount++;
                if (num2 == 0) {
                    break;
                }
            }else {
                difference = num2 - num1;
                operationCount++;
                num1 =0;
                if (difference == 0){
                    break;
                }
            }
        }
        return operationCount;
    }
}
