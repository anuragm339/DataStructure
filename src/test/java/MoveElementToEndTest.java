import arrays.MoveElementToEnd;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoveElementToEndTest {
    @Test
    public void TestCase1() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
        List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 2));
        List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> outputStart = output.subList(0, 3);
        outputStart.sort(Comparator.naturalOrder());
        List<Integer> outputEnd = output.subList(3, output.size());
        Assert.assertTrue(outputStart.equals(expectedStart));
        Assert.assertTrue(outputEnd.equals(expectedEnd));
    }
}
