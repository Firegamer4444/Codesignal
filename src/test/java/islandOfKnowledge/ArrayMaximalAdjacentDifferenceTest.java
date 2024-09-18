package islandOfKnowledge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayMaximalAdjacentDifferenceTest {

    ArrayMaximalAdjacentDifference arrayMaximalAdjacentDifference;

    @Before
    public void setup(){
        arrayMaximalAdjacentDifference = new ArrayMaximalAdjacentDifference();
    }

    @Test
    public void test1(){
        assertEquals(3 , arrayMaximalAdjacentDifference.solution(new int[]{2, 4, 1, 0}));
    }

    @Test
    public void test2(){
        assertEquals(0 , arrayMaximalAdjacentDifference.solution(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void test3(){
        assertEquals(7 , arrayMaximalAdjacentDifference.solution(new int[]{-1, 4, 10, 3, -2}));
    }

    @Test
    public void test4(){
        assertEquals(2 , arrayMaximalAdjacentDifference.solution(new int[]{10, 11, 13}));
    }

    @Test
    public void test5(){
        assertEquals(0 , arrayMaximalAdjacentDifference.solution(new int[]{-2, -2, -2, -2, -2}));
    }

    @Test
    public void test6(){
        assertEquals(4 , arrayMaximalAdjacentDifference.solution(new int[]{-1, 1, -3, -4}));
    }

    @Test
    public void test7(){
        assertEquals(30 , arrayMaximalAdjacentDifference.solution(new int[]{-14, 15, -15}));
    }

}
