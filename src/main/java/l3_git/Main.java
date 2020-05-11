package l3_git;

//Plan:
//  Arrays
//  Two and more dimensional arrays (rectangular and non-rectangular arrays)
//  Foreach
//  Functions
//
//  Tasks:
//  Реализовать функцию по нахождению сумм цифр в числе (123->6, 202->4).
//  Пользователь вводит координаты верхнего левого и нижнего правого угла прямоугольника, а также координаты точки (X,Y) в прямоугольной системе координат. Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.
//  Хранение данных о студентах (фамилии, оценки, посещение) - продумать реализацию.
//  Хранение данных о студентах (массив фамилий) реализовать функции :
//  добавление нового студента
//  удаление по фамилии
//  contains - есть ли студент с определенной фамилией в группе
//  clear - очистка массива
//  сортировка по фамилии*
//  print - красивый вывод на печать группы
//  Кодировать в этом задании нужно все. Нужно продумать в какой форме хранить данные и какие методы нужны для удобной работы с данными.

import java.util.List;

public class Main {
  public static void main(String[] args) {
//    1 Реализовать функцию по нахождению сумм цифр в числе (123->6, 202->4).
    System.out.println(calculateSumOfDigits(1215));
    System.out.println(isRectangleContainsDot(
      Point.of(-10, 5),
      Point.of(-5, -10),
      Point.of(-7, -8)
    ));

    StudentsGroup group = new StudentsGroup();
    Student s1 = Student.of("Vova", "Pain");
    Student s2 = Student.of("Dina", "Runa");
    Student s3 = Student.of("Viola", "Best");
    Student s4 = Student.of("Roma", "Killer");
    Student s5 = Student.of("Geny", "Lola");

    group.addStudent(s1);
    group.addStudent(s2);
    group.addStudent(s3);
    group.addStudent(s4);
    group.addStudent(s5);

    group.rateStudent(s1, "Math", 4);
    group.rateStudent(s1, "Philosophy", 5);
    group.rateStudent(s1, "Programming", 5);

    group.rateStudent(s2, "Math", 3);
    group.rateStudent(s2, "Philosophy", 4);
    group.rateStudent(s2, "Programming", 4);

    group.rateStudent(s5, "Math", 3);
    group.rateStudent(s5, "Philosophy", 5);
    group.rateStudent(s5, "Programming", 4);

    group.print();
  }

  public static boolean isRectangleContainsDot(Point topLeft, Point bottomRight, Point point) {
    return point.y <= topLeft.y && point.y >= bottomRight.y && point.x >= topLeft.x && point.x <= bottomRight.x;
  }

  public static int calculateSumOfDigits(int n) {
    int result = 0;

    while (n >= 10) {
      result += n % 10;
      n /= 10;
    }

    return result + n;
  }
}
