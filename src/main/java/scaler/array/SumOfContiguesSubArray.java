package scaler.array;

import java.util.List;

public class SumOfContiguesSubArray {
    public int maxSubArray(final List<Integer> A) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<A.size();i++){
            if(currentSum<0)
                currentSum = 0;
            currentSum +=  A.get(i);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

}
