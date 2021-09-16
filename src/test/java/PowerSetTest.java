import org.junit.Test;
import recurssion.PowerSet;

import java.util.ArrayList;
import java.util.List;


public class PowerSetTest {
    @Test
    public void test1(){
        PowerSet powerSet= new PowerSet();
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        powerSet.powerset(integerList);
    }
}

