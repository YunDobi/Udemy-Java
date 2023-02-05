public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 1000, "Tim@gamil.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreatLimit());
        System.out.println(customer.getEmail());

        Customer second = new Customer();
        System.out.println(second.getName());
        System.out.println(second.getCreatLimit());
        System.out.println(second.getEmail());
    }
}
