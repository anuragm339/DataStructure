import arrays.SmallestDifference;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SmallestDifferenceTest {
    @Test
    public void TestCase1() {
        int[] expected = {28, 26};
        Assert.assertTrue(Arrays.equals(
                        SmallestDifference.smallestDifference(
                                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
                        expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {-123, -124};
        Assert.assertTrue(Arrays.equals(
                SmallestDifference.smallestDifference(
                        new int[] {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123}, new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530}),
                expected));
    }
}
