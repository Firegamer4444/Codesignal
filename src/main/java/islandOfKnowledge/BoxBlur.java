package islandOfKnowledge;

public class BoxBlur {

    public int[][] solution(int[][] image) {
        int sum = 0;
        int[][] blurImage = new int[image.length-2][image[0].length-2];
        int blurImageRowIndex = 0;
        int blurImageColumnIndex = 0;

        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if(i > 0 & i < image.length - 1 & j > 0 & j < image[i].length - 1){
                    for (int k = i-1; k <= i+1; k++){
                        for (int l = j-1; l <= j+1; l++){
                            sum += image[k][l];
                        }
                    }
                    blurImage[blurImageRowIndex][blurImageColumnIndex] = sum/9;
                    sum = 0;
                    blurImageColumnIndex++;
                    if (blurImageColumnIndex == blurImage[blurImageRowIndex].length){
                        blurImageRowIndex++;
                        blurImageColumnIndex = 0;
                    }
                    if (blurImageRowIndex == blurImage.length){
                        return blurImage;
                    }
                }
            }
        }
        return blurImage;
    }
}
