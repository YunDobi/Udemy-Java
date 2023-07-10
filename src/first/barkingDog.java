package first;

public class barkingDog {
    public static boolean shouldWakeUp (boolean barking, int hoursOfDay) {
        if (0 > hoursOfDay || hoursOfDay >= 24) {
            return false;
        }

        if (barking && hoursOfDay < 8 || hoursOfDay >= 23) {
            return true;
        } else {
            return false;
        }
    }
}