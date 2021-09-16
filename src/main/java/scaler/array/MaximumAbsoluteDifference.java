package scaler.array;

import java.util.Arrays;
import java.util.List;

public class MaximumAbsoluteDifference {
    public int maxArr(List<Integer> A) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<A.size();i++){
            max1=Math.max(A.get(i)+i,max1);
            min1=Math.min(A.get(i)+i,min1);
            max2=Math.max(A.get(i)-i,max2);
            min2=Math.min(A.get(i)-i,min2);
        }
        return Math.max(max2-min2,max1-min1);
    }
}
