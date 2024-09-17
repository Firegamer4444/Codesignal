package islandOfKnowledge;

public class AreEquallyStrong {

    public boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        int yourWeakestArm = 0;
        int yourStrongesttArm = 0;
        int friendsWeakestArm = 0;
        int friendsStrongestArm = 0;

        if (yourLeft > yourRight){
            yourWeakestArm = yourRight;
            yourStrongesttArm = yourLeft;
        }
        else{
            yourWeakestArm = yourLeft;
            yourStrongesttArm = yourRight;
        }
        if (friendsLeft > friendsRight){
            friendsWeakestArm = friendsRight;
            friendsStrongestArm = friendsLeft;
        }
        else{
            friendsWeakestArm = friendsLeft;
            friendsStrongestArm = friendsRight;
        }

        return yourStrongesttArm == friendsStrongestArm && yourWeakestArm == friendsWeakestArm;
    }

}
