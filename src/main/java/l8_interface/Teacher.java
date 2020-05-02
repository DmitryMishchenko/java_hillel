package l8_interface;

public class Teacher implements Greetable {
    private String firstName;
    private String lastName;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String getFirstName() {
        return "123";
    }

    private String getLastName() {
        return lastName;
    }

    public void greet() {
        System.out.println("Good afternoon, my name is " + getFirstName() + " " + getLastName());
    }
}
