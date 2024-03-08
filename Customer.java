public class Customer extends Person {
    private String address;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

    public Customer(String address,  String firstName, String lastName, String email, String password,    String phoneNumber) {
        super(name, email, phoneNumber);
        this.address = address;
    }

    // getters and setters
}
