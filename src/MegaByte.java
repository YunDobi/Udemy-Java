public class MegaByte {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mega = (kiloBytes / 1024);
            int kilo = kiloBytes - (mega * 1024);
            System.out.println(kiloBytes + " KB = " + mega + " MB and " + kilo + " KB");
        }
    }
}
