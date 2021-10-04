package scaler.array;

import java.util.ArrayList;

public class Flip {
    public ArrayList<Integer> flip(String A) {
        int cur = 0;
        int maxx = 0, l = 0, r = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(-1);
        ans.add(-1);
        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i)=='1')
                cur--;
            else cur++;
            if(cur > maxx){
                ans.set(0, l+1);
                ans.set(1, r+1);
                maxx = cur;
            }
            if(cur < 0) {
                cur = 0;
                l = i+1;
                r = i+1;
            }
            else r++;
        }
        if(maxx == 0){
            return new ArrayList<Integer>();
        }
        else return ans;
    }


}
