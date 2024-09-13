package edgeoftheocean;

public class AdjacentElementsProduct {

    public int solution(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < inputArray.length - 1 ; i++){
            int product = (inputArray[i]*inputArray[i + 1]);
            if (product > max){
                max = product;
            }
        }
        return max;
    }
}
