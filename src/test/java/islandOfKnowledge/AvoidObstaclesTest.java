package islandOfKnowledge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AvoidObstaclesTest {

    AvoidObstacles avoidObstacles;

    @Before
    public void setup(){
        avoidObstacles = new AvoidObstacles();
    }

    @Test
    public void test1(){
        assertEquals(4 , avoidObstacles.solution(new int[]{5, 3, 6, 7, 9}));
    }

    @Test
    public void test2(){
        assertEquals(4 , avoidObstacles.solution(new int[]{2, 3}));
    }

    @Test
    public void test3(){
        assertEquals(7 , avoidObstacles.solution(new int[]{1, 4, 10, 6, 2}));
    }

    @Test
    public void test4(){
        assertEquals(6 , avoidObstacles.solution(new int[]{1000, 999}));
    }

    @Test
    public void test5(){
        assertEquals(3 , avoidObstacles.solution(new int[]{19, 32, 11, 23}));
    }

    @Test
    public void test6(){
        assertEquals(6 , avoidObstacles.solution(new int[]{5, 8, 9, 13, 14}));
    }

}
