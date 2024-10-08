package islandOfKnowledge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BoxBlurTest {

    BoxBlur boxBlur;

    @Before
    public void setup(){
        boxBlur = new BoxBlur();
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[][]{{1}} , boxBlur.solution(new int[][]{{1,1,1},{1,7,1},{1,1,1}}));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[][]{{28}} , boxBlur.solution(new int[][]{{0,18,9},{27,9,0},{81,63,45}}));
    }

    @Test
    public void test3(){
        assertArrayEquals(new int[][]{{40,30}} , boxBlur.solution(new int[][]{{36,0,18,9},{27,54,9,0},{81,63,72,45}}));
    }

    @Test
    public void test4(){
        assertArrayEquals(new int[][]{{5,4},{4,4}} , boxBlur.solution(new int[][]{{7,4,0,1},{5,6,2,2},{6,10,7,8},{1,4,2,0}}));
    }

    @Test
    public void test5(){
        assertArrayEquals(new int[][]{{39,30,26,25,31},{34,37,35,32,32},{38,41,44,46,42},{22,24,31,39,45},{37,34,36,47,59}} , boxBlur.solution(new int[][]{{36,0,18,9,9,45,27},{27,0,54,9,0,63,90},{81,63,72,45,18,27,0},{0,0,9,81,27,18,45},{45,45,27,27,90,81,72},{45,18,9,0,9,18,45},{27,81,36,63,63,72,81}}));
    }

    @Test
    public void test6(){
        assertArrayEquals(new int[][]{{82,73,48,25,31},{77,80,57,32,32},{81,106,88,68,42},{44,96,103,89,45},{59,113,137,126,80}} , boxBlur.solution(new int[][]{{36,0,18,9,9,45,27},{27,0,254,9,0,63,90},{81,255,72,45,18,27,0},{0,0,9,81,27,18,45},{45,45,227,227,90,81,72},{45,18,9,255,9,18,45},{27,81,36,127,255,72,81}}));
    }

}
