package CodingBat.Logic;

public class CigarParty {
    public static void main(String[] args) {

    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        } else if (isWeekend && cigars >= 40) {
            return true;
        } else {
            return false;
        }
    }
}
