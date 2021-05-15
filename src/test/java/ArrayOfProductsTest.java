import arrays.ArrayOfProducts;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOfProductsTest {


    @Test
    public void testCase2(){
        int [] input=new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] expected=new int[]{362880, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int [] actual = ArrayOfProducts.arrayOfProducts(input);
        Assert.assertTrue(expected.length==actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assert.assertTrue(actual[i] == expected[i]);
        }
    }
}
