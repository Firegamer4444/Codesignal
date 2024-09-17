package islandOfKnowledge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AreEquallyStrongTest {

    AreEquallyStrong areEquallyStrong;

    @Before
    public void setup(){
        areEquallyStrong = new AreEquallyStrong();
    }

    @Test
    public void test1(){
        assertTrue(areEquallyStrong.solution(10 , 15 , 15 , 10));
    }

    @Test
    public void test2(){
        assertTrue(areEquallyStrong.solution(15 , 10 , 15 , 10));
    }

    @Test
    public void test3(){
        assertFalse(areEquallyStrong.solution(15 , 10 , 15 , 9));
    }

    @Test
    public void test4(){
        assertTrue(areEquallyStrong.solution(10 , 5 , 5 , 10));
    }

    @Test
    public void test5(){
        assertFalse(areEquallyStrong.solution(10 , 15 , 5 , 20));
    }

    @Test
    public void test6(){
        assertTrue(areEquallyStrong.solution(10 , 20 , 10 , 20));
    }

    @Test
    public void test7(){
        assertTrue(areEquallyStrong.solution(5 , 20 , 20 , 5));
    }

    @Test
    public void test8(){
        assertFalse(areEquallyStrong.solution(20 , 15 , 5 , 20));
    }

    @Test
    public void test9(){
        assertTrue(areEquallyStrong.solution(5 , 10 , 5 , 10));
    }

    @Test
    public void test10(){
        assertFalse(areEquallyStrong.solution(1 , 10 , 10 , 0));
    }

    @Test
    public void test11(){
        assertFalse(areEquallyStrong.solution(5 , 5 , 10 , 10));
    }

    @Test
    public void test12(){
        assertFalse(areEquallyStrong.solution(10 , 5 , 10 , 6));
    }

    @Test
    public void test13(){
        assertTrue(areEquallyStrong.solution(1 , 1 , 1 , 1));
    }

    @Test
    public void test14(){
        assertTrue(areEquallyStrong.solution(0 , 10 , 10 , 0));
    }

}
