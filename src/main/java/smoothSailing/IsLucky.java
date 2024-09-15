package smoothSailing;

public class IsLucky {

    public boolean solution(int n) {
        String numbers = Integer.toString(n);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length(); i++){
            if (i < numbers.length()/2){
                sum1 += Character.getNumericValue(numbers.charAt(i));
            }
            else{
                sum2 += Character.getNumericValue(numbers.charAt(i));
            }
        }
        return sum1 == sum2;
    }
}
