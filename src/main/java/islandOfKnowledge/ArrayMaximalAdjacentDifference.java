package islandOfKnowledge;

public class ArrayMaximalAdjacentDifference {

    public int solution(int[] inputArray) {
        int maxDiff = 0;
        for (int i = 1; i < inputArray.length; i++){
            if (inputArray[i] > inputArray[i-1]){
                if ((inputArray[i] - inputArray[i-1]) > maxDiff){
                    maxDiff = inputArray[i] - inputArray[i-1];
                }
            }
            else {
                if ((inputArray[i-1] - inputArray[i]) > maxDiff){
                    maxDiff = inputArray[i-1] - inputArray[i];
                }
            }
        }
        return maxDiff;
    }
}
