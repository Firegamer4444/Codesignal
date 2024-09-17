package exploringTheWaters;

public class ArrayChange {

    public int solution(int[] inputArray) {
        int numberOfMoves = 0;
        for (int i = 1; i < inputArray.length; i++){
            while (inputArray[i] <= inputArray[i-1]){
                inputArray[i] += 1;
                numberOfMoves += 1;
            }
        }
        return numberOfMoves;
    }
}
