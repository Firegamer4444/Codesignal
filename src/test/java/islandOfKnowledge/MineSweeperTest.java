package islandOfKnowledge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MineSweeperTest {

    MineSweeper mineSweeper;

    @Before
    public void setup(){
        mineSweeper = new MineSweeper();
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[][]{{1, 2, 1},{2,1,1},{1,1,1}} , mineSweeper.solution(new boolean[][]{{true,false,false},{false,true,false},{false,false,false}}));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[][]{{0,0,0},{0,0,0}} , mineSweeper.solution(new boolean[][]{{false,false,false},{false,false,false}}));
    }

    @Test
    public void test3(){
        assertArrayEquals(new int[][]{{0,2,2,1},{3,4,3,3},{1,2,3,1}} , mineSweeper.solution(new boolean[][]{{true,false,false,true},{false,false,true,false},{true,true,false,true}}));
    }

    @Test
    public void test4(){
        assertArrayEquals(new int[][]{{3,5,3},{5,8,5},{3,5,3}} , mineSweeper.solution(new boolean[][]{{true,true,true},{true,true,true},{true,true,true}}));
    }

    @Test
    public void test5(){
        assertArrayEquals(new int[][]{{3,3,3,2},{2,4,5,2},{2,3,2,2}} , mineSweeper.solution(new boolean[][]{{false,true,true,false},{true,true,false,true},{false,false,true,false}}));
    }

    @Test
    public void test6(){
        assertArrayEquals(new int[][]{{1,2},{2,3},{2,1},{1,1},{0,0}} , mineSweeper.solution(new boolean[][]{{true,false},{true,false},{false,true},{false,false},{false,false}}));
    }

}
