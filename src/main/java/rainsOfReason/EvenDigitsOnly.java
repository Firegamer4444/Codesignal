package rainsOfReason;

public class EvenDigitsOnly {

    public boolean solution(int n) {
        String nStr = n + "";
        for (int i = 0; i < nStr.length(); i++){
            if(nStr.charAt(i)%2 != 0){
                return false;
            }
        }
        return true;
    }
}
