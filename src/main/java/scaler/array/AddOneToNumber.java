package scaler.array;

import java.util.ArrayList;
import java.util.List;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> integers= new ArrayList<>();
        int carry=0;
        Boolean flag=true;
        Boolean leftFlag=false;
        ArrayList<Integer> modfiedInput = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(!leftFlag){
                if(A.get(i).equals(0)){

                }else{
                    leftFlag=true;
                    modfiedInput.add(A.get(i));
                }
            }else{
                modfiedInput.add(A.get(i));
            }
        }
        A= modfiedInput;
        int size=A.size()-1;
        for(int i=size;i>=0;i--){
            Integer digit = A.get(i);
            if(digit<9 && flag){
                integers.add(digit+1);
                carry=0;
                flag=false;
            }else if(digit==9&& flag){
                if(carry==0) {
                    integers.add(0);
                    carry=1;
                    flag=true;
                    continue;
                }if(carry==1){
                    integers.add(0);
                }
            }else{
                integers.add(digit);
            }
        }
        if(carry!=0){
            integers.add(carry);
        }
        if(A.isEmpty()){
            integers.add(1);
        }
        A.clear();
        for(int i=integers.size()-1;i>=0;i--){
            A.add(integers.get(i));
        }
        return A;
    }
}
