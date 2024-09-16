package exploringTheWaters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AlternatingSumsTest {

    AlternatingSums alternatingSums;

    @Before
    public void setup(){
        alternatingSums = new AlternatingSums();
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[]{180, 105} , alternatingSums.solution(new int[]{50, 60, 60, 45, 70}));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[]{100, 50} , alternatingSums.solution(new int[]{100, 50}));
    }

    @Test
    public void test3(){
        assertArrayEquals(new int[]{80, 0} , alternatingSums.solution(new int[]{80}));
    }

    @Test
    public void test4(){
        assertArrayEquals(new int[]{150, 150} , alternatingSums.solution(new int[]{100, 50, 50, 100}));
    }

    @Test
    public void test5(){
        assertArrayEquals(new int[]{150, 151} , alternatingSums.solution(new int[]{100, 51, 50, 100}));
    }

}
