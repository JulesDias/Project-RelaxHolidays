public class Employee extends Person {
    private String position;
    private int empNumber;
    
    public Employee(String firstName, String lastName, String email, String password, String position, int empNumber) {
        super(firstName, lastName, email, password);
        this.position = position;
        this.empNumber = empNumber;
    }

    // getters and setters
}
