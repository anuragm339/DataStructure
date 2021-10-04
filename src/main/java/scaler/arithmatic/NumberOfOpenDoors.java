package scaler.arithmatic;


import java.util.*;

public class NumberOfOpenDoors {
    public int solve(int A) {
        int count=0;
        for(int i=2;i<A;i++){
            int factors=countFactors(i);
            if(factors%2!=0){
                count++;
            }
        }
        return count;
    }

    int countFactors(int A){
        int count=0;
        List<Integer> integers = new ArrayList<>();
        Set<Integer> integers1= new HashSet<>();
        for(int i=1;i<=Math.sqrt(A);i++){
            if(A%i==0){
                integers.add(i);
                count++;
            }
            if(i==A/i){
                integers.add(i);
                count++;
            }
        }
        return count;
    }
}
