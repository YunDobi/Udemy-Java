package DesignPattern.AdaptterPattern;

// does not matter unrelated methods or parameters, the adapter will help to connect to the clients
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(50f));
        System.out.println(adapter.halfOf(25f));
    }
}
