import org.junit.Test;
import scaler.array.GreatestCommonDivisorDeleteOne;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorDeleteOneTest {
    @Test
    public void testcase1(){
        GreatestCommonDivisorDeleteOne gdo= new GreatestCommonDivisorDeleteOne();
        int solve = gdo.solve(Arrays.asList(12, 15, 18));
        assertEquals(6,solve);
    }

    @Test
    public void testcase2(){
        GreatestCommonDivisorDeleteOne gdo= new GreatestCommonDivisorDeleteOne();
        int solve = gdo.solve(Arrays.asList(21, 7, 3, 42, 63));
        assertEquals(7,solve);
    }
}
