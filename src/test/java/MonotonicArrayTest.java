import arrays.MonoTonicArray;
import org.junit.Assert;
import org.junit.Test;

public class MonotonicArrayTest {
    @Test
    public void TestCase1() {
        int[] array = new int[] {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
        Boolean expected = true;
        Boolean actual = MonoTonicArray.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        int[] array = new int[] {-1, -1, -2, -3, -4, -5, -5, -5, -6, -7, -8, -8, -9, -10, -11};
        Boolean expected = true;
        Boolean actual = MonoTonicArray.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }
    //1, 2, 0
    @Test
    public void TestCase3() {
        int[] array = new int[] {1, 2, 0};
        Boolean expected = false;
        Boolean actual = MonoTonicArray.isMonotonic(array);
        Assert.assertEquals(expected, actual);
    }



}
