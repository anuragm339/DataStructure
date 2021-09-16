import org.junit.Assert;
import org.junit.Test;
import scaler.array.SumOfContiguesSubArray;

import java.util.Arrays;

public class SumOfContiguesSubArrayTest {
    @Test
    public void testCase1(){
        SumOfContiguesSubArray sumOfContiguesSubArray = new SumOfContiguesSubArray();
        int[] x={1,2,3,4,-10};
        sumOfContiguesSubArray.maxSubArray(Arrays.asList(1,2,3,4,-10));
    }

    @Test
    public void  testcase2(){
        SumOfContiguesSubArray sumOfContiguesSubArray = new SumOfContiguesSubArray();
        int x=sumOfContiguesSubArray.maxSubArray(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        Assert.assertEquals(x,6);
    }

}
