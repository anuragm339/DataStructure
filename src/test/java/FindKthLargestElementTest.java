import arrays.FindKthLargestElement;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindKthLargestElementTest {
    @Test
    public void testCase1(){
        int expected=7;
        List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k=2;
        int actual = FindKthLargestElement.findKthLargest(ints, k);
        Assert.assertEquals(expected,actual);

    }
}
