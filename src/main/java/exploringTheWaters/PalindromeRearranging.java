package exploringTheWaters;

public class PalindromeRearranging {

    public boolean solution(String inputString) {
        int identicalPairNumbers = 0;
        StringBuilder inputStringBuilder = new StringBuilder(inputString);

        for (int i = 0; i < inputStringBuilder.length(); i++){
            for (int j = 1 + i; j < inputStringBuilder.length(); j++){
                if (inputStringBuilder.charAt(i) == inputStringBuilder.charAt(j)){
                    identicalPairNumbers += 1;
                    inputStringBuilder.deleteCharAt(j);
                    break;
                }
            }
        }
        return identicalPairNumbers == inputString.length()/2;
    }
}
