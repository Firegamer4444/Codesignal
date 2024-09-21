package rainsOfReason;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayReplaceTest {

    ArrayReplace arrayReplace;

    @Before
    public void setup(){
        arrayReplace = new ArrayReplace();
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[]{3, 2, 3} , arrayReplace.solution(new int[]{1, 2, 1} , 1 , 3));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[]{1, 2, 0, 4, 5} , arrayReplace.solution(new int[]{1, 2, 3, 4, 5} , 3 , 0));
    }

    @Test
    public void test3(){
        assertArrayEquals(new int[]{10, 10, 10} , arrayReplace.solution(new int[]{1, 1, 1} , 1 , 10));
    }

    @Test
    public void test4(){
        assertArrayEquals(new int[]{1, 1, 1, 1, 1} , arrayReplace.solution(new int[]{1, 2, 1, 2, 1} , 2 , 1));
    }

    @Test
    public void test5(){
        assertArrayEquals(new int[]{1, 2, 1, 2, 1} , arrayReplace.solution(new int[]{1, 2, 1, 2, 1} , 2 , 2));
    }

    @Test
    public void test6(){
        assertArrayEquals(new int[]{9, 1} , arrayReplace.solution(new int[]{3, 1} , 3 , 9));
    }

    @Test
    public void test7(){
        assertArrayEquals(new int[]{10, 10} , arrayReplace.solution(new int[]{10, 10} , 0 , 9));
    }

    @Test
    public void test8(){
        assertArrayEquals(new int[]{2, 1} , arrayReplace.solution(new int[]{2, 1} , 3 , 9));
    }

}
