package l4_functions;

import l4_functions.Student;
import l4_functions.StudentsGroup;

public class Main {
  public static void main(String[] args) {
    StudentsGroup group = new StudentsGroup();
    Student s1 = Student.of("Vova", "Pain");
    Student s2 = Student.of("Dina", "Runa");
    Student s3 = Student.of("Viola", "Best");
    Student s4 = Student.of("Roma", "Killer");
    Student s5 = Student.of("Geny", "Lola");

    s1.rate(1, 10);
    s1.rate(100, 10);

    group.addStudent(s1);
    group.addStudent(s2);
    group.addStudent(s3);
    group.addStudent(s4);
    group.addStudent(s5);


    group.print();
  }
}
