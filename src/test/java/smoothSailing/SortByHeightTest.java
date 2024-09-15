package smoothSailing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortByHeightTest {

    SortByHeight sortbyHeight;

    @Before
    public void setup(){
        sortbyHeight = new SortByHeight();
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[] {-1, 150, 160, 170, -1, -1, 180, 190} , sortbyHeight.solution(new int[] {-1, 150, 190, 170, -1, -1, 160, 180}));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[]{-1, -1, -1, -1, -1} , sortbyHeight.solution(new int[]{-1, -1, -1, -1, -1}));
    }

    @Test
    public void test3(){
        assertArrayEquals(new int[]{-1} , sortbyHeight.solution(new int[]{-1}));
    }

    @Test
    public void test4(){
        assertArrayEquals(new int[]{2, 2, 4, 9, 11, 16} , sortbyHeight.solution(new int[]{4, 2, 9, 11, 2, 16}));
    }

    @Test
    public void test5(){
        assertArrayEquals(new int[]{1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2} , sortbyHeight.solution(new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1}));
    }

    @Test
    public void test6(){
        assertArrayEquals(new int[]{1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77} , sortbyHeight.solution(new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3}));
    }

}
