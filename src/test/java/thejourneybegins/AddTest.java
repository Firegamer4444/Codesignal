package thejourneybegins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {

    private Add add;

    @Before
    public void setup(){
        add = new Add();
    }

    @Test
    public void test1() {
        assertEquals(3 , add.solution(1 , 2));
    }

    @Test
    public void test2() {
        assertEquals(1000 , add.solution(0 , 1000));
    }

    @Test
    public void test3() {
        assertEquals(-37 , add.solution(2 , -39));
    }

    @Test
    public void test4() {
        assertEquals(199 , add.solution(99 , 100));
    }

    @Test
    public void test5() {
        assertEquals(0 , add.solution(-100 , 100));
    }

    @Test
    public  void test6() {
        assertEquals(-2000 , add.solution(-1000 , -1000));
    }

}
