package smoothSailing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllLongestStringsTest {

    AllLongestStrings allLongestStrings;

    @Before
    public void setup(){
        allLongestStrings = new AllLongestStrings();
    }

    @Test
    public void test1(){
        assertEquals(new String[]{"aba","vcd","aba" } , allLongestStrings.solution(new String[]{"aba","aa","ad","vcd","aba"}));
    }

    @Test
    public void test2(){
        assertEquals(new String[]{"aa"} , allLongestStrings.solution(new String[]{"aa"}));
    }

    @Test
    public void test3(){
        assertEquals(new String[]{"eeee" , "abcd"} , allLongestStrings.solution(new String[]{"abc","eeee","abcd","dcd"}));
    }

    @Test
    public void test4(){
        assertEquals(new String[]{"zzzzzz","abcdef","aaaaaa"} , allLongestStrings.solution(new String[]{"a","abc" , "cbd","zzzzzz","a","abcdef","asasa","aaaaaa"}));
    }

    @Test
    public void test5(){
        assertEquals(new String[]{"varennyky"} , allLongestStrings.solution(new String[]{"enyky","benyky","yely","varennyky"}));
    }

    @Test
    public void test6(){
        assertEquals(new String[]{"abacaba"} , allLongestStrings.solution(new String[]{"abacaba","abacab","abac","xxxxxx"}));
    }

    @Test
    public void test7(){
        assertEquals(new String[]{"yooooooung","watermelon"} , allLongestStrings.solution(new String[]{"young","yooooooung","hot","or","not","come","on","fire","water","watermelon"}));
    }

    @Test
    public void test8(){
        assertEquals(new String[]{"aokbcwthc"} , allLongestStrings.solution(new String[]{"onsfnib","aokbcwthc","jrfcw"}));
    }

    @Test
    public void test9(){
        assertEquals(new String[]{"lbgwyqkry"} , allLongestStrings.solution(new String[]{"lbgwyqkry"}));
    }

    @Test
    public void test10(){
        assertEquals(new String[]{"i"} , allLongestStrings.solution(new String[]{"i"}));
    }

}
