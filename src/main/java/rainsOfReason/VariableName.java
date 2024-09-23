package rainsOfReason;

public class VariableName {

    public boolean solution(String name) {
        String regex = "^[a-z,A-Z,_][a-z,A-Z,_,0-9]*";
        return name.matches(regex);
    }
}
