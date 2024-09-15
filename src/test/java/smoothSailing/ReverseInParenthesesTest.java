package smoothSailing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseInParenthesesTest {

    ReverseInParentheses reverseInParentheses;

    @Before
    public void setup(){
        reverseInParentheses = new ReverseInParentheses();
    }

    @Test
    public void test1(){
        assertEquals("rab" , reverseInParentheses.solution("(bar)"));
    }

    @Test
    public void test2(){
        assertEquals("foorabbaz" , reverseInParentheses.solution("foo(bar)baz"));
    }

    @Test
    public void test3(){
        assertEquals("foorabbazmilb" , reverseInParentheses.solution("foo(bar)baz(blim)"));
    }

    @Test
    public void test4(){
        assertEquals("foobazrabblim" , reverseInParentheses.solution("foo(bar(baz))blim"));
    }

    @Test
    public void test5(){
        assertEquals("" , reverseInParentheses.solution(""));
    }

    @Test
    public void test6(){
        assertEquals("" , reverseInParentheses.solution("()"));
    }

    @Test
    public void test7(){
        assertEquals("cbadgfe" , reverseInParentheses.solution("(abc)d(efg)"));
    }

}
