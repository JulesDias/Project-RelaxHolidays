public class Customer extends Person {
    private String address;

    public Customer(String name, String email, String phoneNumber, String address) {
        super(name, email, phoneNumber);
        this.address = address;
    }

    // getters and setters
}
