package edgeoftheocean;

public class MakeArrayConsecutive2 {

    public int solution(int[] statues) {

        for (int i = 0 ; i < statues.length ; i++){
            for (int j = 0 ; j < i  ; j++){
                if (statues[j] > statues[j+1]){
                    int value = statues[j+1];
                    statues[j+1] = statues[j];
                    statues[j] = value;
                }
            }
        }

        int n = statues[0];
        int result = 0;
        for (int i = 0 ; i < statues.length ; i++){
            if (n != statues[i]){
                result += statues[i] - n;
                n = statues[i];
            }
            n += 1;
        }
        return result;

    }
}
