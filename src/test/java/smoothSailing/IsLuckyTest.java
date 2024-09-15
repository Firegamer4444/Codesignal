package smoothSailing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsLuckyTest {

    IsLucky isLucky;

    @Before
    public void setup(){
        isLucky = new IsLucky();
    }

    @Test
    public void test1(){
        assertTrue(isLucky.solution(1230));
    }

    @Test
    public void test2(){
        assertFalse(isLucky.solution(239017));
    }

    @Test
    public void test3(){
        assertTrue(isLucky.solution(134008));
    }

    @Test
    public void test4(){
        assertFalse(isLucky.solution(10));
    }

    @Test
    public void test5(){
        assertTrue(isLucky.solution(11));
    }

    @Test
    public void test6(){
        assertTrue(isLucky.solution(1010));
    }

    @Test
    public void test7(){
        assertFalse(isLucky.solution(261534));
    }

    @Test
    public void test8(){
        assertFalse(isLucky.solution(100000));
    }

    @Test
    public void test9(){
        assertTrue(isLucky.solution(999999));
    }

    @Test
    public void test10(){
        assertTrue(isLucky.solution(123321));
    }

}
