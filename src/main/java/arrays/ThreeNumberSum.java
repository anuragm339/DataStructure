package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        ArrayList<Integer[]> finallist = new ArrayList();
        for(int i=0;i<array.length;i++){
            int leftPointer=i+1;
            int rightPointer=array.length-1;
            while (leftPointer<rightPointer){
                if(array[i]+array[leftPointer]+array[rightPointer]==targetSum){
                    Integer [] x= new Integer[3];
                    x[0]=array[i];
                    x[1]=array[leftPointer];
                    x[2]=array[rightPointer];
                    finallist.add(x);
                    leftPointer++;
                }else if(array[i]+array[leftPointer]+array[rightPointer]<targetSum){
                    leftPointer++;
                }else {
                    rightPointer--;
                }
            }
        }
        return  finallist;
    }
}
