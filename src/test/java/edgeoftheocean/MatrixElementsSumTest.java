package edgeoftheocean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixElementsSumTest {

    MatrixElementsSum matrixElementsSum;

    @Before
    public void setup(){
        matrixElementsSum = new MatrixElementsSum();
    }

    @Test
    public void test1(){
        assertEquals(9 , matrixElementsSum.solution(new int[][]{{0,1,1,2},{0,5,0,0},{2,0,3,3}}));
    }

    @Test
    public void test2(){
        assertEquals(9 , matrixElementsSum.solution(new int[][]{{1,1,1,0},{0,5,0,1},{2,1,3,10}}));
    }

    @Test
    public void test3(){
        assertEquals(18 , matrixElementsSum.solution(new int[][]{{1,1,1},{2,2,2},{3,3,3}}));
    }

    @Test
    public void test4(){
        assertEquals(0 , matrixElementsSum.solution(new int[][]{{0}}));
    }

    @Test
    public void test5(){
        assertEquals(5 , matrixElementsSum.solution(new int[][]{{1,0,3},{0,2,1},{1,2,0}}));
    }

    @Test
    public void test6(){
        assertEquals(6 , matrixElementsSum.solution(new int[][]{{1},{5},{0},{2}}));
    }

    @Test
    public void test7(){
        assertEquals(15 , matrixElementsSum.solution(new int[][]{{1,2,3,4,5}}));
    }

    @Test
    public void test8(){
        assertEquals(17 , matrixElementsSum.solution(new int[][]{{2},{5},{10}}));
    }

    @Test
    public void test9(){
        assertEquals(15 , matrixElementsSum.solution(new int[][]{{4,0,1},{10,7,0},{0,0,0},{9,1,2}}));
    }

    @Test
    public void test10(){
        assertEquals(1 , matrixElementsSum.solution(new int[][]{{1}}));
    }

}
