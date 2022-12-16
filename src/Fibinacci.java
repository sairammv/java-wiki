public class Fibinacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
   static int[] dp;
    public static int calvalue(int n){
        dp[0] =0;
        dp[1] =1;
        dp[2] =1;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }

    public static int tribonacci(int n) {
        dp = new int[n+1];

        for(int i =0; i <= n; i++){
            dp[i] = -1;
        }
        return calvalue(n);

    }
}
