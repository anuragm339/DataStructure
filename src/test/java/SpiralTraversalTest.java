import arrays.SpiralTraversalOfTwo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralTraversalTest {
    @Test
    public void TestCase1() {
        int[][] input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = SpiralTraversalOfTwo.spiralTraverse(input);
        Assert.assertTrue(expected.equals(actual));
    }
}
