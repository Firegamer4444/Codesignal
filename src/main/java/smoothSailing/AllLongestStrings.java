package smoothSailing;

public class AllLongestStrings {

    public String[] solution(String[] inputArray) {
        int max = 0;
        int maxStrings = 0;
        for (int i = 0 ; i < inputArray.length ; i++){
            if (inputArray[i].length() > max){
                max = inputArray[i].length();
                maxStrings = 0;
            }
            if (inputArray[i].length() == max){
                maxStrings += 1;
            }
        }
        String[] outputArray = new String[maxStrings];
        int index = 0;
        for (int i = 0; i < inputArray.length ; i++){
            if (inputArray[i].length() == max){
                outputArray[index] = inputArray[i];
                index += 1;
            }
        }
        return outputArray;
    }
}
