import org.junit.Test;
import scaler.array.Flip;

public class FlipTest {
    @Test
    public void test1(){
        Flip flip = new Flip();
        flip.flip("11");
    }

    @Test
    public void test2(){
        Flip flip = new Flip();
        flip.flip("010");
    }

    @Test
    public void test3(){
        Flip flip = new Flip();
        flip.flip("100");
    }

    @Test
    public void test4(){
        Flip flip = new Flip();
        flip.flip("10010011101");
    }
}
