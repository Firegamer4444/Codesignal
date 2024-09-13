package thejourneybegins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckPalindromeTest {

    private CheckPalindrome checkPalindrome;

    @Before
    public void setup(){
        checkPalindrome = new CheckPalindrome();
    }

    @Test
    public void test1(){
        assertEquals(true , checkPalindrome.solution("aabaa"));
    }

    @Test
    public void test2(){
        assertEquals(false , checkPalindrome.solution("abac"));
    }

    @Test
    public void test3(){
        assertEquals(true , checkPalindrome.solution("a"));
    }

    @Test
    public void test4(){
        assertEquals(false , checkPalindrome.solution("az"));
    }

    @Test
    public void test5(){
        assertEquals(true , checkPalindrome.solution("abacaba"));
    }

    @Test
    public void test6(){
        assertEquals(true , checkPalindrome.solution("z"));
    }

    @Test
    public void test7(){
        assertEquals(false , checkPalindrome.solution("aaabaaaa"));
    }

    @Test
    public void test8(){
        assertEquals(false , checkPalindrome.solution("zzzazzazz"));
    }

    @Test
    public void test9(){
        assertEquals(true , checkPalindrome.solution("hlbeeykoqqqqokyeeblh"));
    }

    @Test
    public void test10(){
        assertEquals(true , checkPalindrome.solution("hlbeeykoqqqokyeeblh"));
    }

}
