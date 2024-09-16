package exploringTheWaters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBorderTest {

    AddBorder addBorder;

    @Before
    public void setup(){
        addBorder = new AddBorder();
    }

    @Test
    public void test1(){
        assertEquals(new String[]{"*****","*abc*","*ded*","*****"} , addBorder.solution(new String[]{"abc","ded"}));
    }

    @Test
    public void test2(){
        assertEquals(new String[]{"***","*a*","***"} , addBorder.solution(new String[]{"a"}));
    }

    @Test
    public void test3(){
        assertEquals(new String[]{"****", "*aa*","****","*zz*","****"} , addBorder.solution(new String[]{"aa","**","zz"}));
    }

    @Test
    public void test4(){
        assertEquals(new String[]{"*******","*abcde*","*fghij*","*klmno*","*pqrst*","*uvwxy*","*******"} , addBorder.solution(new String[]{"abcde", "fghij", "klmno", "pqrst", "uvwxy"}));
    }

    @Test
    public void test5(){
        assertEquals(new String[]{"*******", "*wzy***", "*******"} , addBorder.solution(new String[]{"wzy**"}));
    }

}
