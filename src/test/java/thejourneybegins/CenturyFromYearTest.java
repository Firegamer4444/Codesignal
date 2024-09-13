package thejourneybegins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenturyFromYearTest {
    private CenturyFromYear centuryFromYear;

    @Before
    public void setup(){
        centuryFromYear = new CenturyFromYear();
    }

    @Test
    public void test1() {
        assertEquals(20 , centuryFromYear.solution(1905));
    }

    @Test
    public void test2() {
        assertEquals(17 , centuryFromYear.solution(1700));
    }

    @Test
    public void test3() {
        assertEquals(20 , centuryFromYear.solution(1988));
    }

    @Test
    public void test4() {
        assertEquals(20 , centuryFromYear.solution(2000));
    }

    @Test
    public void test5() {
        assertEquals(21 , centuryFromYear.solution(2001));
    }

    @Test
    public void test6() {
        assertEquals(2 , centuryFromYear.solution(200));
    }

    @Test
    public void test7() {
        assertEquals(4 , centuryFromYear.solution(374));
    }

    @Test
    public void test8() {
        assertEquals(1 , centuryFromYear.solution(45));
    }

    @Test
    public void test9() {
        assertEquals(1 , centuryFromYear.solution(8));
    }
}
