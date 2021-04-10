package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalOfTwo {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> intList= new ArrayList<>();
        Boolean leftTarversal=true;
        int rowLength=array.length;
        int column=rowLength;
        int count=0;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<column;j++){
                intList.add(array[i][j]);
            }
            i=0;
            column=rowLength-1;
            leftTarversal=!leftTarversal;
        }
        return intList;
    }
    private List<Integer> reccurssion(int[][] arr,int row,int column){

    }
}
