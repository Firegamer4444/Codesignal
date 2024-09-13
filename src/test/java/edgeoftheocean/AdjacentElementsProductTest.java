package edgeoftheocean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdjacentElementsProductTest {

    AdjacentElementsProduct adjacentElementsProduct;

    @Before
    public void setup(){
        adjacentElementsProduct = new AdjacentElementsProduct();
    }

    @Test
    public void test1(){
        assertEquals(21 , adjacentElementsProduct.solution(new int[]{3, 6, -2, -5, 7, 3}));
    }

    @Test
    public void test2(){
        assertEquals(2 , adjacentElementsProduct.solution(new int[]{-1, -2}));
    }

    @Test
    public void test3(){
        assertEquals(6 , adjacentElementsProduct.solution(new int[]{5, 1, 2, 3, 1, 4}));
    }

    @Test
    public void test4(){
        assertEquals(6 , adjacentElementsProduct.solution(new int[]{1, 2, 3, 0}));
    }

    @Test
    public void test5(){
        assertEquals(50 , adjacentElementsProduct.solution(new int[]{9, 5, 10, 2, 24, -1, -48}));
    }

    @Test
    public void test6(){
        assertEquals(30 , adjacentElementsProduct.solution(new int[]{5, 6, -4, 2, 3, 2, -23}));
    }

    @Test
    public void test7(){
        assertEquals(6 , adjacentElementsProduct.solution(new int[]{4, 1, 2, 3, 1, 5}));
    }

    @Test
    public void test8(){
        assertEquals(-12 , adjacentElementsProduct.solution(new int[]{-23, 4, -3, 8, -12}));
    }

    @Test
    public void test9(){
        assertEquals(0 , adjacentElementsProduct.solution(new int[]{1, 0, 1, 0, 1000}));
    }

}
