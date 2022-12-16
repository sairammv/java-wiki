package beingzero.subarray;

public class Kadanes {
    public static void main(String[] args) {
    }

    static  public int maxSubArray(int[] nums) {
        int prevSum = nums[0];
        int currentMaxsum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i <= nums.length-1; i++ ){
            currentMaxsum = Math.max(nums[i],prevSum + nums[i] );
            prevSum = currentMaxsum;
            maxSum = Math.max(maxSum, prevSum );
        }
        return maxSum;
    }
}
