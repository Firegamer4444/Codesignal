package exploringTheWaters;

public class AddBorder {

    public String[] solution(String[] picture) {
        String[] outputPicture = new String[picture.length + 2];
        StringBuilder strBuilder = new StringBuilder();
        int outputStrLength = picture[0].length() + 2;

        for (int i = 0; i < outputPicture.length; i++){
            for (int j = 0; j < outputStrLength; j++){
                if (i == 0| j == 0 | i == picture.length + 1| j == outputStrLength - 1 ){
                    strBuilder.append('*');
                }
                else{
                    strBuilder.append(picture[i-1].charAt(j - 1));
                }
            }
            outputPicture[i] = strBuilder.toString();
            strBuilder.delete(0, strBuilder.length());
        }

        return outputPicture;
    }
}
