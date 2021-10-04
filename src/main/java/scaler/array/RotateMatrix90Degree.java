package scaler.array;

import java.util.ArrayList;

public class RotateMatrix90Degree {
    public ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> matrix) {
        int n = matrix.size();
        for(int layer=0;layer<n/2;layer++){
            int first=layer;
            int last=n-1-layer;
            for(int i=first;i<last;i++){
                int offset=i-first;
                int top = matrix.get(first).get(i); //save top
// left -> top
               int x1 = matrix.get(last-offset).get(first);
                matrix.get(first).set(i,x1);
//bottom -> left
                int x2=  matrix.get(last).get(last-offset);
                matrix.get(last-offset).set(first,x2);
//right -> bottom
                int x3 = matrix.get(i).get(last);
                matrix.get(last).set(last-offset,x3);
//top -> right
                int x4=top;
                matrix.get(i).set(last,x4);
            }
        }
        return matrix;
    }
}
