package arrays;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        int[] products= new int[array.length];
        int leftRunningProducts=1;
        for(int i=0;i<array.length;i++){
            products[i]=leftRunningProducts;
            leftRunningProducts*=array[i];
        }
        int rightRunningProducts=1;
        for(int i=array.length-1;i>=0;i--){
            products[i]*=rightRunningProducts;
            rightRunningProducts*=array[i];
        }
        return products;
    }

    public static int[] arrayOfProducts1(int[] array) {
        // Write your code here.
        if(array.length==0)
            return new int[] {};
        int products=1;
        int[] returnList= new int[array.length];
        for(int i=0;i<array.length;i++){
            products*=array[i];
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=0)
                returnList[i]=products/array[i];
            else
                returnList[i]=0;
        }
        return returnList;
    }
}
