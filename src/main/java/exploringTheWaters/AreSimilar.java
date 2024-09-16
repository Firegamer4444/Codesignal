package exploringTheWaters;

public class AreSimilar {

    public boolean solution(int[] a, int[] b) {
        int aNotEqualNumber = 0;
        int bNotEqualNumber = 0;
        int aNotEqualNumber2 = 0;
        int bNotEqualNumber2 = 0;
        int notEqualCount = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                notEqualCount += 1;
                if (notEqualCount == 1){
                    aNotEqualNumber = a[i];
                    bNotEqualNumber2 = b[i];
                }
                if (notEqualCount == 2){
                    bNotEqualNumber = b[i];
                    aNotEqualNumber2 = a[i];
                }
            }
            if (notEqualCount > 2){
                return false;
            }
        }
        return aNotEqualNumber == bNotEqualNumber && aNotEqualNumber2 == bNotEqualNumber2;
    }
}
