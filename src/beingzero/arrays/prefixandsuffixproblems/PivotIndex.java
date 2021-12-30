package beingzero.arrays.prefixandsuffixproblems;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println("pivot is "+pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;

        for(int i =0; i < nums.length; i++){
            totalSum += nums[i];
        }

        int sum = 0;
        for(int i =0; i < nums.length; i++){
            sum =  totalSum - nums[i];

            if(sum == totalSum){
                return i+1;
            }
        }

        return -1;
    }

}
