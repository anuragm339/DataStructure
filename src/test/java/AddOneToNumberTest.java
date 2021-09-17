
import org.junit.Test;
import scaler.array.AddOneToNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumberTest {
    @Test
    public void testCase1(){
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(addOneToNumber.plusOne(l1));
    }

    @Test
    public void testCase2(){
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(2,9,9));
        System.out.println(addOneToNumber.plusOne(l1));
    }

    @Test
    public void testCase3(){
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(9,9,9));
        System.out.println(addOneToNumber.plusOne(l1));
    }

    @Test
    public void testCase4(){
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(0 ,3 ,7 ,6 ,4 ,0 ,5 ,5 ,6 ));
        System.out.println(addOneToNumber.plusOne(l1));
    }

    @Test
    public void testCase5(){
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(0, 6, 0, 6, 4, 8, 8, 1));
        System.out.println(addOneToNumber.plusOne(l1));
    }

    @Test
    public void testCase6(){
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(0, 6, 0, 6, 4, 8, 8, 1 ));
        System.out.println(addOneToNumber.plusOne(l1));
    }
}
