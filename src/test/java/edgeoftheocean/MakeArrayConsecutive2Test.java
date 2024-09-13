package edgeoftheocean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeArrayConsecutive2Test {

    MakeArrayConsecutive2 makeArrayConsecutive2;

    @Before
    public void setup(){
        makeArrayConsecutive2 = new MakeArrayConsecutive2();
    }

    @Test
    public void test1(){
        assertEquals(3 , makeArrayConsecutive2.solution(new int[] {6, 2, 3, 8}));
    }

    @Test
    public void test2(){
        assertEquals(2 , makeArrayConsecutive2.solution(new int[] {0, 3}));
    }

    @Test
    public void test3(){
        assertEquals(0 , makeArrayConsecutive2.solution(new int[] {5, 4, 6}));
    }

    @Test
    public void test4(){
        assertEquals(2 , makeArrayConsecutive2.solution(new int[] {6, 3}));
    }

    @Test
    public void test5(){
        assertEquals(0 , makeArrayConsecutive2.solution(new int[] {1}));
    }

}
