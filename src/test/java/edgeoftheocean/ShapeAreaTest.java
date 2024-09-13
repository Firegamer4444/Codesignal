package edgeoftheocean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeAreaTest {

    ShapeArea shapeArea;

    @Before
    public void setup(){
        shapeArea = new ShapeArea();
    }

    @Test
    public void test1(){
        assertEquals(5 , shapeArea.solution(2));
    }

    @Test
    public void test2(){
        assertEquals(13 , shapeArea.solution(3));
    }

    @Test
    public void test3(){
        assertEquals(1 , shapeArea.solution(1));
    }

    @Test
    public void test4(){
        assertEquals(41 , shapeArea.solution(5));
    }

    @Test
    public void test5(){
        assertEquals(97986001 , shapeArea.solution(7000));
    }

    @Test
    public void test6(){
        assertEquals(127984001 , shapeArea.solution(8000));
    }

    @Test
    public void test7(){
        assertEquals(199940005 , shapeArea.solution(9999));
    }

    @Test
    public void test8(){
        assertEquals(199900013 , shapeArea.solution(9998));
    }

    @Test
    public void test9(){
        assertEquals(161946005 , shapeArea.solution(8999));
    }

    @Test
    public void test10(){
        assertEquals(19801 , shapeArea.solution(100));
    }

}
