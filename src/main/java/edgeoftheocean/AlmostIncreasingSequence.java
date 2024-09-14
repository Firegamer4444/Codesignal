package edgeoftheocean;

public class AlmostIncreasingSequence {

    public boolean solution(int[] sequence) {

        int[] newSequence = new int[sequence.length - 1];
        newSequence[newSequence.length - 1] = sequence[sequence.length - 1];
        int[] newSequence2 = new int[sequence.length - 1];
        int removedNumbers = 0;
        int indexAdjustment = 0;

        if (newSequence.length == 1){
            return true;
        }

        for (int i = 0 ; i < sequence.length - 1 ; i++){
            if (sequence[i] >= sequence[i+1]){
                newSequence2[i] = sequence[i];
                removedNumbers += 1;
                indexAdjustment += 1;
            }
            else{
                newSequence[i - indexAdjustment] = sequence[i];
                newSequence2[i] = sequence[i + indexAdjustment];
            }
            if (removedNumbers > 1){
                return false;
            }
        }

        boolean increasing = true;
        boolean increasing2 = true;

        for (int i = 0; i < newSequence.length - 1 ; i++){
            if (newSequence[i] >= newSequence[i+1]){
                increasing = false;
            }
            if (newSequence2[i] >= newSequence2[i+1]){
                increasing2 = false;
            }
        }
        return increasing || increasing2;
    }
}
