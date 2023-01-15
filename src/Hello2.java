public class Hello2 {
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        printConversion(1.5);

    }
    public static long toMilesPerHour (double killometersPerHour) {
        if (killometersPerHour < 0) {
            return -1;
        } else {
            double cal = (killometersPerHour / 1.609);
//            long rounded = Math.round(cal);
//            System.out.println(rounded);
            return Math.round(cal);
        }
    };

    public static void printConversion (double killometersPerHour ) {
        System.out.println(killometersPerHour + " km/h = " + toMilesPerHour(killometersPerHour) + " mi/h");
    };
}
