package rainsOfReason;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VariableNameTest {

    VariableName variableName;

    @Before
    public void setup(){
        variableName = new VariableName();
    }

    @Test
    public void test1(){
        assertTrue(variableName.solution("var_1__Int"));
    }

    @Test
    public void test2(){
        assertFalse(variableName.solution("qq-q"));
    }

    @Test
    public void test3(){
        assertFalse(variableName.solution("2w2"));
    }

    @Test
    public void test4(){
        assertFalse(variableName.solution(" variable"));
    }

    @Test
    public void test5(){
        assertFalse(variableName.solution("a[riable0"));
    }

    @Test
    public void test6(){
        assertTrue(variableName.solution("variable0"));
    }

    @Test
    public void test7(){
        assertTrue(variableName.solution("a"));
    }

    @Test
    public void test8(){
        assertTrue(variableName.solution("_Aas_23"));
    }

    @Test
    public void test9(){
        assertFalse(variableName.solution("a a_2"));
    }

    @Test
    public void test10(){
        assertFalse(variableName.solution("0ss"));
    }

}
