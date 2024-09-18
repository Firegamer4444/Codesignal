package islandOfKnowledge;

public class IsIPv4Address {

    public boolean solution(String inputString) {


        String[] ipv4Array = inputString.split("\\.");

        if (ipv4Array.length != 4){
            return false;
        }

        for (int i = 0; i < ipv4Array.length; i++){
            if (!ipv4Array[i].matches("\\d+") | ipv4Array[i].length() > 3 ){
                return false;
            }
            if (Integer.valueOf(ipv4Array[i]) <= 255){
                if (ipv4Array[i].charAt(0) == '0' & ipv4Array[i].length() >= 2){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;

    }
}
