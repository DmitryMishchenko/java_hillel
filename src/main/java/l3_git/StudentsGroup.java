package l3_git;

import l1_intro.ConsoleColors;

import java.util.*;

public class StudentsGroup {
  private List<Student> list = new ArrayList<>();
  // student -> table of marks <Subject, Mark>
  private Map<Student, Map<String, Integer>> rating = new HashMap<>();
  // user will insert date and get list of students who attended the lesson
  private Map<Date, List<Student>> attendance = new HashMap<>();

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

  public void rateStudent(Student student, String subject, int rate) {
    if (!this.rating.containsKey(student)) {
      this.rating.put(student, new HashMap<>());
    }
    Map<String, Integer> marks = this.rating.get(student);
    marks.put(subject, rate);
  }

  public void print() {
    list.forEach((Student student) -> {
      System.out.println(ConsoleColors.BLUE_BOLD  + "Name: " + student.getName() + " surname: " + student.getSurname() + ConsoleColors.RESET);
      Map<String, Integer> ratings = this.rating.getOrDefault(student, null);

      if (ratings != null) {
        for (Map.Entry<String, Integer> rate : ratings.entrySet()) {
          System.out.println(rate.getKey() + " = " + rate.getValue());
        }
      }
    });
  }
}
