package scaler.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int start=0;
        int end=0;
        int currentSum=0;
        int s=0;
        int maxSum=0;
        for(int i=0;i<A.size();i++){
            if(currentSum<0)
                currentSum = 0;
            currentSum +=  A.get(i);
            if (maxSum < currentSum)
            {
                maxSum = currentSum;
                start = s;
                end = i;
            }
            if (currentSum < 0)
            {
                currentSum = 0;
                s = i + 1;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        ArrayList finalList= new ArrayList();
        if(maxSum<=0){
            System.out.println("Testing -->"+finalList);
            return finalList;
        }else {
            for (int i = start; i <= end; i++) {
                finalList.add(A.get(i));
            }
            return finalList;
        }
    }
    // 5 -1 -1 -1 -1 -1
}
