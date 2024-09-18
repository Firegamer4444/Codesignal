package islandOfKnowledge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsIPv4AddressTest {

    IsIPv4Address isIPv4Address;

    @Before
    public void setup(){
        isIPv4Address = new IsIPv4Address();
    }

    @Test
    public void test1(){
        assertTrue(isIPv4Address.solution("172.16.254.1"));
    }

    @Test
    public void test2(){
        assertFalse(isIPv4Address.solution("172.316.254.1"));
    }

    @Test
    public void test3(){
        assertFalse(isIPv4Address.solution(".254.255.0"));
    }

    @Test
    public void test4(){
        assertFalse(isIPv4Address.solution("1.1.1.1a"));
    }

    @Test
    public void test5(){
        assertFalse(isIPv4Address.solution("1"));
    }

    @Test
    public void test6(){
        assertTrue(isIPv4Address.solution("0.254.255.0"));
    }

    @Test
    public void test7(){
        assertFalse(isIPv4Address.solution("1.23.256.255."));
    }

    @Test
    public void test8(){
        assertFalse(isIPv4Address.solution("1.23.256.."));
    }

    @Test
    public void test9(){
        assertFalse(isIPv4Address.solution("0..1.0"));
    }

    @Test
    public void test10(){
        assertFalse(isIPv4Address.solution("64.233.161.00"));
    }

    @Test
    public void test11(){
        assertFalse(isIPv4Address.solution("64.00.161.131"));
    }

    @Test
    public void test12(){
        assertFalse(isIPv4Address.solution("01.233.161.131"));
    }

    @Test
    public void test13(){
        assertFalse(isIPv4Address.solution("35..36.9.9.0"));
    }

    @Test
    public void test14(){
        assertFalse(isIPv4Address.solution("1.1.1.1.1"));
    }

    @Test
    public void test15(){
        assertFalse(isIPv4Address.solution("1.256.1.1"));
    }

    @Test
    public void test16(){
        assertFalse(isIPv4Address.solution("a0.1.1.1"));
    }

    @Test
    public void test17(){
        assertFalse(isIPv4Address.solution("0.1.1.256"));
    }

    @Test
    public void test18(){
        assertFalse(isIPv4Address.solution("129380129831213981.255.255.255"));
    }

    @Test
    public void test19(){
        assertFalse(isIPv4Address.solution("255.255.255.255abcdekjhf"));
    }

    @Test
    public void test20(){
        assertFalse(isIPv4Address.solution("7283728"));
    }

    @Test
    public void test21(){
        assertFalse(isIPv4Address.solution("0..1.0.0"));
    }

}
