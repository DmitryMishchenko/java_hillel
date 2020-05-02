package l5_basics_oop.students_no_oop;

public class StudentsApp {

    public static void main(String[] args) {

        String[] surnames = new String[5];
        int[][] marks = new int[5][8];
        //1
        addStudent(surnames, "Ivanov");
        addStudent(surnames, "Petrov");
        setMark("Petrov", 5, 2, surnames, marks);


        //6
        print(surnames, marks);


    }

    private static void setMark(String name,
                                int mark,
                                int lessonIndex,
                                final String[] surnames,
                                final int[][] marks) {
        // find student
        int studentsIndex = -1;
        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i].equals(name)) {
                studentsIndex = i;
            }
        }
        if (studentsIndex == -1) {
            System.out.println("Look better");
            return;
        }
        marks[studentsIndex][lessonIndex] = mark;
    }

    private static void addStudent(String[] surnames, String name) {
        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i] == null) {
                surnames[i] = name;
                return;
            }
        }

    }

    public static void print(String[] surname, int[][] marks) {
        for (int i = 0; i < surname.length; i++) {
            if (surname[i] == null) {
                return;
            }
            System.out.print(surname[i] + "\t");
            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

}
