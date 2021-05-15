import arrays.LongestPeek;
import org.junit.Assert;
import org.junit.Test;

public class LongestPeekTest {
    @Test
    public void  testCase1(){
        int actual=6;
        int arr[] = new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        int expected= LongestPeek.longestPeak(arr);
        Assert.assertEquals(actual,expected);
    }
    //

    @Test
    public void  testCase2(){
        int actual=3;
        int arr[] = new int[]{1, 3, 2};
        int expected= LongestPeek.longestPeak(arr);
        Assert.assertEquals(actual,expected);
    }

    //5, 4, 3, 2, 1, 2, 10, 12, -3, 5, 6, 7, 10

    @Test
    public void  testCase3(){
        int actual=5;
        int arr[] = new int[]{5, 4, 3, 2, 1, 2, 10, 12, -3, 5, 6, 7, 10};
        int expected= LongestPeek.longestPeak(arr);
        Assert.assertEquals(actual,expected);
    }
}
