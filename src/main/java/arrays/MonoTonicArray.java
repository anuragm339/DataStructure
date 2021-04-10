package arrays;

public class MonoTonicArray {
    public static boolean isMonotonic(int[] array) {
        Boolean returnFlag = true;
        Boolean order=null;
        int nextPointer=1;
        int i=0;
        while (i<array.length && nextPointer<array.length){
            if(order==null){
                if(array[i]<array[nextPointer]){
                    order=true;
                }else if(array[i]>array[nextPointer]){
                    order=false;
                }
            }else{
                if(order){
                    if(array[i]==array[nextPointer]){
                        i++;
                        nextPointer++;
                        continue;
                    }
                    if(array[i]>array[nextPointer]){
                        return false;
                    }
                }else if(!order){
                    if(array[i]==array[nextPointer]){
                        i++;
                        nextPointer++;
                        continue;
                    }
                    if(array[i]<array[nextPointer]){
                        return false;
                    }
                }
            }

            i++;
            nextPointer++;
        }
        return returnFlag;
    }
}
