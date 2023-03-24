package second;

public class StringBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and goodbye");

        java.lang.StringBuilder helloBuilder = new java.lang.StringBuilder("Hello" + "World");
        helloBuilder.append(" and GoodBye");

        printInfo(helloWorld);
        printInfo(helloBuilder);

        java.lang.StringBuilder emptyStart = new java.lang.StringBuilder();
        emptyStart.append("a".repeat(17));
        java.lang.StringBuilder emptyStart32 = new java.lang.StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInfo(emptyStart);
        printInfo(emptyStart32);
    }

    public static void printInfo (String string) {
        System.out.println("String= " + string);
        System.out.println("length= " + string.length());
    }
    public static void printInfo (java.lang.StringBuilder builder) {
        System.out.println("Builder= " + builder);
        System.out.println("length= " + builder.length());
        System.out.println("capatity= " + builder.capacity());
    }
}
