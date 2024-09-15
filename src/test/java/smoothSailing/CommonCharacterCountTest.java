package smoothSailing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonCharacterCountTest {

    CommonCharacterCount commonCharacterCount;

    @Before
    public void setup(){
        commonCharacterCount = new CommonCharacterCount();
    }

    @Test
    public void test1(){
        assertEquals(3 , commonCharacterCount.solution("aabcc" , "adcaa"));
    }

    @Test
    public void test2(){
        assertEquals(4 , commonCharacterCount.solution("zzzz" , "zzzzzzz"));
    }

    @Test
    public void test3(){
        assertEquals(3 , commonCharacterCount.solution("abca" , "xyzbac"));
    }

    @Test
    public void test4(){
        assertEquals(0 , commonCharacterCount.solution("a" , "b"));
    }

    @Test
    public void test5(){
        assertEquals(1 , commonCharacterCount.solution("a" , "aaa"));
    }

}
