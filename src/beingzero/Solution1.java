package beingzero;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int[] arr = {1,2};
        System.out.println(sumOfUnique(nums));
        System.out.println(uniqueOccurrences(arr));
    }


    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int i = 0; i < arr.length; i++){
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i], 1);
            }
        }
            Set key = hashMap.keySet();
            Collection<Integer> val =  hashMap.values();
            HashSet output =new HashSet(val);


        return key.size() == output.size();
    }


    public static int sumOfUnique(int[] nums) {
        int sum= 0;
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i], (Integer)hashMap.get(nums[i])+1);
            }else {
                hashMap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
       return  sum;
    }
}
