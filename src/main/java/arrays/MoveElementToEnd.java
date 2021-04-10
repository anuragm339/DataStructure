package arrays;

import java.util.Collections;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int lastPointer=array.size()-1;
        int startPointer=0;
        int x= Collections.frequency(array,toMove);
        while (x>0){
            if(array.get(startPointer)==array.get(lastPointer) && array.get(startPointer)==toMove){
                lastPointer--;
                x--;
            }else if(array.get(startPointer)==toMove){
                int temp=array.get(lastPointer);
                array.set(lastPointer,toMove);
                array.set(startPointer,temp);
                startPointer++;
                lastPointer--;
                x--;
            }else {
                startPointer++;
            }

        }
        return array;
    }
}
