package beingzero.bits;

public class CountNumbersWithKthBitSet {
    public static void main(String[] args) {

        int[] input = {3,5,7};
        int[] input1 = {1,2,3,4};

        System.out.println(getCountWithKthBitSet(input,2));
        System.out.println(getCountWithKthBitSet(input1,6));
    }


    static int getCountWithKthBitSet(int a[], int k)
    {
        int count = 0;
        for (int i : a){
            if(isKthBitSet(i, k-1))
                count = count+1;
        }
        return count;
    }

    static boolean isKthBitSet(long N, int K){
          long mask = 1L << K;
          long output = N & mask;
          if(output != 0)
              return true;
          return false;
    }
}
