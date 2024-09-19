package islandOfKnowledge;

public class AvoidObstacles {

    public int solution(int[] inputArray) {
        int minJumps = 1;
        while(true){
            for(int i = 0 ; i < inputArray.length ; i++){
                if (inputArray[i]%minJumps == 0){
                    minJumps++;
                    break;
                }
                if (i == inputArray.length - 1){
                    return minJumps;
                }
            }
        }
    }
}
