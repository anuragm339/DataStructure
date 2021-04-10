import arrays.SpiralTraversalOfTwo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralTraversalTest {
    @Test
    public void testCase1(){
        int[][] input= new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7},
        };
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> list = SpiralTraversalOfTwo.spiralTraverse(input);
        System.out.println(list);
        Assert.assertTrue(expectedList.equals(list));
    }
    /*
     @Test
  public void TestCase1() {
    var input =
        new int[][] {
          {1, 2, 3, 4},
          {12, 13, 14, 5},
          {11, 16, 15, 6},
          {10, 9, 8, 7},
        };
    var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
    var actual = Program.spiralTraverse(input);
    Utils.assertTrue(expected.equals(actual));
  }
     */
}
