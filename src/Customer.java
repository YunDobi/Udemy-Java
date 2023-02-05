public class Customer {
    private String name;
    private double creatLimit;
    private String email;

    public Customer(String name, double creatLimit, String email) {
        this.name = name;
        this.creatLimit = creatLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public Customer() {
        this("Nobody", "nobody@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreatLimit() {
        return creatLimit;
    }

    public String getEmail() {
        return email;
    }
}