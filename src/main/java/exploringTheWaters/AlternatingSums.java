package exploringTheWaters;

public class AlternatingSums {

    public int[] solution(int[] a) {

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++ ){
            if (i%2 == 0){
                sum1 += a[i];
            }
            else{
                sum2 += a[i];
            }
        }
        return new int[]{sum1 , sum2};
    }
}
