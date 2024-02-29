public class Employee extends Person {
    private String position;

    public Employee(String name, String email, String phoneNumber, String position) {
        super(name, email, phoneNumber);
        this.position = position;
    }

    // getters and setters
}
