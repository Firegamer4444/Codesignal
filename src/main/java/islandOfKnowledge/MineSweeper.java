package islandOfKnowledge;

public class MineSweeper {

    public int[][] solution(boolean[][] matrix) {
        int[][] mineSweeperBoard = new int[matrix.length][matrix[0].length];
        int minesNumber = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                for (int k = Math.max(0 , i-1); k <= Math.min(matrix.length - 1 , i+1); k++){
                    for (int l = Math.max(0 , j-1); l <= Math.min(matrix[k].length - 1 ,j+1); l++){
                        if (i != k || j != l){
                            if (matrix[k][l] == true){
                                minesNumber++;
                            }
                        }
                    }
                }
                mineSweeperBoard[i][j] = minesNumber;
                minesNumber = 0;
            }
        }
        return mineSweeperBoard;
    }
}
