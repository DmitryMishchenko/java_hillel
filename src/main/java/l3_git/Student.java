package l3_git;

public class Student implements Comparable<Student> {
  private String name;
  private String surname;

  private Student(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public static Student of(String name, String surname) {
    return new Student(name, surname);
  }

  public String getSurname() {
    return surname;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(Student student) {
    return this.getSurname().compareTo(student.getSurname());
  }
}
