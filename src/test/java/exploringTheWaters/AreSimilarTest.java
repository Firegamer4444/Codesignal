package exploringTheWaters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AreSimilarTest {

    AreSimilar areSimilar;

    @Before
    public void setup(){
        areSimilar = new AreSimilar();
    }

    @Test
    public void test1(){
        assertTrue(areSimilar.solution(new int[]{1, 2, 3} , new int[]{1, 2, 3}));
    }

    @Test
    public void test2(){
        assertTrue(areSimilar.solution(new int[]{1, 2, 3} , new int[]{2, 1, 3}));
    }

    @Test
    public void test3(){
        assertFalse(areSimilar.solution(new int[]{1, 2, 2} , new int[]{2, 1, 1}));
    }

    @Test
    public void test4(){
        assertTrue(areSimilar.solution(new int[]{1, 2, 1, 2} , new int[]{2, 2, 1, 1}));
    }

    @Test
    public void test5(){
        assertTrue(areSimilar.solution(new int[]{1, 2, 1, 2, 2, 1} , new int[]{2, 2, 1, 1, 2, 1}));
    }

    @Test
    public void test6(){
        assertFalse(areSimilar.solution(new int[]{1, 1, 4} , new int[]{1, 2, 3}));
    }

    @Test
    public void test7(){
        assertFalse(areSimilar.solution(new int[]{1, 2, 3} , new int[]{1, 10, 2}));
    }

    @Test
    public void test8(){
        assertTrue(areSimilar.solution(new int[]{2, 3, 1} , new int[]{1, 3, 2}));
    }

    @Test
    public void test9(){
        assertFalse(areSimilar.solution(new int[]{2, 3, 9} , new int[]{10, 3, 2}));
    }

    @Test
    public void test10(){
        assertFalse(areSimilar.solution(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279} , new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279}));
    }

}
