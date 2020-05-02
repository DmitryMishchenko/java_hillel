package l6.inheritance;

public class Student extends Person {

    private int[] marks;

    public Student(String firstName, String lastName, int[] marks) {
        super(firstName, lastName);
        super.getFirstName();
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}