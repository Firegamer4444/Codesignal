package exploringTheWaters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeRearrangingTest {

    PalindromeRearranging palindromeRearranging;

    @Before
    public void setup(){
        palindromeRearranging = new PalindromeRearranging();
    }

    @Test
    public void test1(){
        assertTrue(palindromeRearranging.solution("aabb"));
    }

    @Test
    public void test2(){
        assertFalse(palindromeRearranging.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
    }

    @Test
    public void test3(){
        assertTrue(palindromeRearranging.solution("abbcabb"));
    }

    @Test
    public void test4(){
        assertTrue(palindromeRearranging.solution("zyyzzzzz"));
    }

    @Test
    public void test5(){
        assertTrue(palindromeRearranging.solution("z"));
    }

    @Test
    public void test6(){
        assertTrue(palindromeRearranging.solution("zaa"));
    }

    @Test
    public void test7(){
        assertFalse(palindromeRearranging.solution("abca"));
    }

    @Test
    public void test8(){
        assertFalse(palindromeRearranging.solution("abcad"));
    }

    @Test
    public void test9(){
        assertFalse(palindromeRearranging.solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa"));
    }

    @Test
    public void test10(){
        assertFalse(palindromeRearranging.solution("abdhuierf"));
    }

}
