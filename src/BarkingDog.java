package src;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23)) {
            if (barking) {
                return true;
            }
        } else if (hourOfDay < 0 || hourOfDay > 24) {
            return false;
        }
        return false;
    }



    public static void main(String[] args) {
        shouldWakeUp(true, 23);
    }


}


