package leetcode.sept2021;

import leetcode.sep2021.LongestTurbulentSubarray;
import org.junit.Test;

public class LongestTurbulentSubarrayTest {

    @Test
    public void testcase1(){
        LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();
        int x[] ={9,4,2,10,7,8,8,1,9};
        longestTurbulentSubarray.maxTurbulenceSize(x);
    }
    //[4,8,12,16]
    @Test
    public void testcase2(){
        LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();
        int x[] ={4,8,12,16};
        longestTurbulentSubarray.maxTurbulenceSize(x);
    }
}
