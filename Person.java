public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;

    
    public Person(String firstName, String lastName, String email, String password ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


}

