package leetcodebiweekly72;

public class CountEqualAndDivisiblePairs {
    public static void main(String[] args) {
        int[] in = {3,1,2,2,2,1,3};
        System.out.println(countPairs(in, 2));
    }


    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if(((i * j) % k) == 0 ){
                       count++;
                    }
                }
            }
        }
        return count;
    }
}
