package l4_functions;

import l1_intro.ConsoleColors;

import java.util.*;

public class StudentsGroup {
  private List<Student> list = new ArrayList<>();

  public List<Student> getStudentsList() {
    return this.list;
  }

  public void addStudent(Student student) {
    list.add(student);
  }

  public Student findStudent(String surname) {
   return list.stream()
      .filter((Student student) -> student.getSurname().equals(surname))
      .findFirst()
      .orElse(null);
  }

  public boolean contains(String surname) {
    return findStudent(surname) != null;
  }

  public Student findAndRemove(String surname) {
    Iterator<Student> listIterator = list.iterator();
    Student removedStudent = null;
    while (listIterator.hasNext()) {
      Student current = listIterator.next();
      if (current.getSurname().equals(surname)) {
        list.remove(current);
        removedStudent = current;
        break;
      }
    }

    return removedStudent;
  }

  public void clear() {
    list.clear();
  }

  public List<Student> getSortedList() {
    List<Student> sorterList = new ArrayList<>(list);
    sorterList.sort(Student::compareTo);
    return sorterList;
  }

  public void print() {
    list.forEach((Student student) -> {
      System.out.println(ConsoleColors.BLUE_BOLD  + "Name: " + student.getName() + " surname: " + student.getSurname() + ConsoleColors.RESET);

      System.out.println("Student marks: " + Arrays.toString(student.getRating()));
      System.out.println("Student attendance: " + Arrays.toString(student.getAttendance()));
    });
  }
}
