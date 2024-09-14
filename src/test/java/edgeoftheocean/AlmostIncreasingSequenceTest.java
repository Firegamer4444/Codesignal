package edgeoftheocean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlmostIncreasingSequenceTest {

    AlmostIncreasingSequence almostIncreasingSequence;

    @Before
    public void setup(){
        almostIncreasingSequence = new AlmostIncreasingSequence();
    }

    @Test
    public void test1(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 3, 2, 1}));
    }

    @Test
    public void test2(){
        assertTrue(almostIncreasingSequence.solution(new int[]{1, 3, 2}));
    }

    @Test
    public void test3(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 2, 1, 2}));
    }

    @Test
    public void test4(){
        assertFalse(almostIncreasingSequence.solution(new int[]{3, 6, 5, 8, 10, 20, 15}));
    }

    @Test
    public void test5(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 1, 2, 3, 4, 4}));
    }

    @Test
    public void test6(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 4, 10, 4, 2}));
    }

    @Test
    public void test7(){
        assertTrue(almostIncreasingSequence.solution(new int[]{10, 1, 2, 3, 4, 5}));
    }

    @Test
    public void test8(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 1, 1, 2, 3}));
    }

    @Test
    public void test9(){
        assertTrue(almostIncreasingSequence.solution(new int[]{0, -2, 5, 6}));
    }

    @Test
    public void test10(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 2, 3, 4, 5, 3, 5, 6}));
    }

    @Test
    public void test11(){
        assertFalse(almostIncreasingSequence.solution(new int[]{40, 50, 60, 10, 20, 30}));
    }

    @Test
    public void test12(){
        assertTrue(almostIncreasingSequence.solution(new int[]{1, 1}));
    }

    @Test
    public void test13(){
        assertTrue(almostIncreasingSequence.solution(new int[]{1, 2, 5, 3, 5}));
    }

    @Test
    public void test14(){
        assertFalse(almostIncreasingSequence.solution(new int[]{1, 2, 5, 5, 5}));
    }

    @Test
    public void test15(){
        assertFalse(almostIncreasingSequence.solution(new int[]{10, 1, 2, 3, 4, 5, 6, 1}));
    }

    @Test
    public void test16(){
        assertTrue(almostIncreasingSequence.solution(new int[]{1, 2, 3, 4, 3, 6}));
    }

    @Test
    public void test17(){
        assertTrue(almostIncreasingSequence.solution(new int[]{1, 2, 3, 4, 99, 5, 6}));
    }

    @Test
    public void test18(){
        assertTrue(almostIncreasingSequence.solution(new int[]{123, -17, -5, 1, 2, 3, 12, 43, 45}));
    }

    @Test
    public void test19(){
        assertTrue(almostIncreasingSequence.solution(new int[]{3, 5, 67, 98, 3}));
    }

}
