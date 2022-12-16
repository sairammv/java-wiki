package altemerik;

import java.util.List;

class GFG
{

    static int maxDiff (List<Integer> px)
    {
        int difference = px.get(1) - px.get(0);
        int currentSum = difference;
        int maximumSum = currentSum;

        for(int startIndex = 0 ; startIndex < px.size() - 1; startIndex++)
        {
            difference = px.get(startIndex + 1) - px.get(startIndex);

            if (currentSum > 0)
                currentSum += difference;
            else
                currentSum = difference;

            if (currentSum > maximumSum)
                maximumSum = currentSum;
        }

        return maximumSum;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = {80, 2, 6, 3, 100};
        int n = arr.length;


    }
}