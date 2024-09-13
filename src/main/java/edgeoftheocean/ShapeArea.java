package edgeoftheocean;

public class ShapeArea {

    public int solution(int n) {
        int result = 1;
        int adjacents = 0;
        for (int i = 1 ; i < n ; i++){
            adjacents = adjacents + 4;
            result = adjacents + result;
        }
        return result;
    }

}
