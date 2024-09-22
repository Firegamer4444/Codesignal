package rainsOfReason;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenDigitsOnlyTest {

    EvenDigitsOnly evenDigitsOnly;

    @Before
    public void setup(){
        evenDigitsOnly = new EvenDigitsOnly();
    }

    @Test
    public void test1(){
        assertTrue(evenDigitsOnly.solution(248622));
    }

    @Test
    public void test2(){
        assertFalse(evenDigitsOnly.solution(642386));
    }

    @Test
    public void test3(){
        assertTrue(evenDigitsOnly.solution(248842));
    }

    @Test
    public void test4(){
        assertFalse(evenDigitsOnly.solution(1));
    }

    @Test
    public void test5(){
        assertTrue(evenDigitsOnly.solution(8));
    }

    @Test
    public void test6(){
        assertFalse(evenDigitsOnly.solution(2462487));
    }

    @Test
    public void test7(){
        assertTrue(evenDigitsOnly.solution(468402800));
    }

    @Test
    public void test8(){
        assertTrue(evenDigitsOnly.solution(2468428));
    }

    @Test
    public void test9(){
        assertFalse(evenDigitsOnly.solution(5468428));
    }

    @Test
    public void test10(){
        assertFalse(evenDigitsOnly.solution(7468428));
    }

}
