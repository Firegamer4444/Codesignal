package smoothSailing;

public class CommonCharacterCount {

    public int solution(String s1, String s2) {
        int result = 0;
        StringBuilder s2StringBuilder = new StringBuilder(s2);
        for (int i = 0; i < s1.length(); i++){
            for (int j = 0; j < s2StringBuilder.length(); j++){
                if (s1.charAt(i) == s2StringBuilder.charAt(j)){
                    result += 1;
                    s2StringBuilder.setCharAt(j, ' ');
                    break;
                }
            }
        }
        return result;
    }

}
