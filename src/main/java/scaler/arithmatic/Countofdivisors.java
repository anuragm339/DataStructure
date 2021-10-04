package scaler.arithmatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Countofdivisors {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> returList= new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int x1= A.get(i);
            int count=0;
            Set<Integer>  intSet= new HashSet<>();
            if(x1==1){
                count=1;
            }
            else{
                for(int j=1;j<=Math.sqrt(x1);j++) {
                    if (x1 % j == 0) {
                        intSet.add(j);
                        intSet.add(x1/j);
                    }
                }
            }
            count=intSet.size();
            returList.add(count);
        }
        return returList;
    }

    public static void main(String[] args) {
        Countofdivisors countofdivisors = new Countofdivisors();
        countofdivisors.solve(new ArrayList<>(Arrays.asList(8,9,10)));
    }
}
