public class Customer extends Person {
    private String address;
    private String phoneNumber;

    public Customer(String address,  String firstName, String lastName, String email, String password,    String phoneNumber) {
        super(firstName, lastName, email, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // getters and setters
}
