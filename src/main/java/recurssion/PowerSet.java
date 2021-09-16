package recurssion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        subsets.add(new ArrayList<Integer>());
        for (Integer ele : array){
            int length = subsets.size();
            for (int i = 0; i < length; i++){
                List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
                currentSubset.add(ele);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }

    public static List<List<Integer>> powerset(List<Integer> array, int idx){
        if (idx < 0){
            List<List<Integer>> emptySet = new ArrayList<List<Integer>>();
            emptySet.add(new ArrayList<Integer>());
            return emptySet;
        }
        int ele = array.get(idx);
        List<List<Integer>> subsets = powerset(array, idx - 1);
        int length = subsets.size();
        for (int i = 0; i < length; i++){
            List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
            currentSubset.add(ele);
            subsets.add(currentSubset);
        }
        return subsets;
    }
}
