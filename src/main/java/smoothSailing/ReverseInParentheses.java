package smoothSailing;

public class ReverseInParentheses {

    String solution(String inputString) {
        int beginIndex = 0;
        int endIndex = 0;
        int parenthesesCount = 1;
        while (parenthesesCount >= 1){
            for (int i = 0; i < inputString.length(); i++ ){
                if (inputString.charAt(i) == '('){
                    beginIndex = i;
                    parenthesesCount += 1;
                }
                if (inputString.charAt(i) == ')'){
                    endIndex = i;
                    String betweenParentheses = inputString.substring(beginIndex + 1, endIndex);
                    String beforeParentheses = inputString.substring(0, beginIndex);
                    String afterParentheses = inputString.substring(endIndex + 1);
                    StringBuilder betweenParenthesesStrB = new StringBuilder(betweenParentheses);
                    inputString = beforeParentheses + betweenParenthesesStrB.reverse().toString() + afterParentheses;
                    break;
                }
            }
            parenthesesCount -= 1;
        }
        return inputString;
    }
}
