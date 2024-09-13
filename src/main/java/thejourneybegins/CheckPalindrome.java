package thejourneybegins;

public class CheckPalindrome {

    public boolean solution(String inputString) {
        for (int i = 0 ; i <= inputString.length()/2 ; i++){
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
