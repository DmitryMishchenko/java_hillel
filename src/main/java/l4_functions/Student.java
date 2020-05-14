package l4_functions;

public class Student implements Comparable<Student> {

  private String name;
  private String surname;
  private boolean[] attendance;
  private int[] rating;

  private Student(String name, String surname, int numberOfLectures) {
    this.name = name;
    this.surname = surname;
    this.rating = new int[numberOfLectures];
    this.attendance = new boolean[numberOfLectures];
  }

  public static Student of(String name, String surname) {
    return new Student(name, surname, 32);
  }

  public static Student of(String name, String surname, int numberOfLectures) {
    return new Student(name, surname, numberOfLectures);
  }

  public String getSurname() {
    return surname;
  }

  public String getName() {
    return name;
  }

  public boolean[] getAttendance() {
    return attendance;
  }

  public int[] getRating() {
    return rating;
  }

  public void rate(int lectureNum, int value) {
    if (lectureNum > 0 && lectureNum <= this.rating.length) {
      this.rating[lectureNum - 1] = value;
    }
  }

  public void attend(int lectureNum) {
    if (lectureNum > 0 && lectureNum <= this.attendance.length) {
      this.attendance[lectureNum - 1] = true;
    }
  }

  @Override
  public int compareTo(Student student) {
    return this.getSurname().compareTo(student.getSurname());
  }
}
