import org.junit.Test;
import scaler.array.MaxNonNegativeSubArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArrayTest {
    @Test
    public void test1(){
        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
        ArrayList arrayList = new ArrayList(Arrays.asList(1, 2, 5, -7, 2, 3));
        maxNonNegativeSubArray.maxset(arrayList);
    }

    @Test
    public void test2(){
        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
        ArrayList arrayList = new ArrayList(Arrays.asList(-1, -1, -1, -1, -1 ));
        maxNonNegativeSubArray.maxset(arrayList);
    }

    @Test
    public void test3(){
        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
        ArrayList arrayList = new ArrayList(Arrays.asList( 0, 0, -1, 0));
        maxNonNegativeSubArray.maxset(arrayList);
    }
}
