package l2_datatypes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Homework {
  public static void main(String[] args) {
//    1. Программа, которая находит среднее арифметическое значение двух чисел.
    System.out.println(arithmeticalMean(10, 15));
//    2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.
    System.out.println(arithmeticalMean(10, 15, 10, 90));
//    3. Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых, которые выплачивает банк, длительность вклада (лет). Вывести накопленную сумму денег за каждый год и начисленные проценты.
    System.out.println(bankDeposit(new BigDecimal(1000), 10, 12));

//    4. Вывести на консоль графику (ширину и высоту задает пользователь) вида:
    drawSquare(20, 15);

//  * Конверт (рекомендую сначала нарисовать одну диагональ, а потом вторую)
    drawEnvelop(20, 30);
//  * в шахматном порядке
    drawChessBoard(10, 10);
//    5. Ввести число, определить четное или нет.
    System.out.println(isEven(10));
//    6. Ввести число, определить простое ли оно.
    System.out.println(isPrime(101));
//    7. Ввести число, определить каким числам оно кратно.
    System.out.println(findAllNumberDivisors(100));
  }

  public static Map<Integer, BigDecimal> bankDeposit(BigDecimal amount, double percent, int years) {
    Map<Integer, BigDecimal> profitMap = new HashMap<>();
    BigDecimal sum = amount;
    int currentYear = 0;

    while (currentYear++ < years) {
      BigDecimal currentYearPercentage = sum.multiply(BigDecimal.valueOf(percent / 100)).setScale(2, RoundingMode.HALF_EVEN);
      sum = sum.add(currentYearPercentage).setScale(2, RoundingMode.HALF_EVEN);
      profitMap.put(currentYear, currentYearPercentage);
      System.out.println("Проценты за " + currentYear + " год составляют: " + currentYearPercentage);
      System.out.println("Накопленная сумма за " + currentYear + " год составляет: " + sum);
    }

    return profitMap;
  }

  public static double arithmeticalMean(double a, double b) {
    return (a + b) / 2;
  }

  public static double arithmeticalMean(int... args) {
    double sum = Arrays.stream(args).sum();
    return sum / args.length;
  }

  public static void drawSquare(int width, int height) {
    for (int hIndex = 0; hIndex < height; hIndex++) {
      StringBuilder sBuilder = new StringBuilder();
      for (int wIndex = 0; wIndex < width; wIndex++) {
        char c = (wIndex == 0 || wIndex == width - 1 || hIndex == 0 || hIndex == height - 1) ? '*' : ' ';
        sBuilder.append(c);
      }
      System.out.println(sBuilder.toString());
    }
  }

  public static void drawEnvelop(int width, int height) {
    for (int hIndex = 0; hIndex < height; hIndex++) {
      StringBuilder sBuilder = new StringBuilder();
      for (int wIndex = 0; wIndex < width; wIndex++) {
        char c = (wIndex == 0 || wIndex == width - 1 || hIndex == 0 || hIndex == height - 1 || wIndex == hIndex || hIndex == width - wIndex - 1) ? '*' : ' ';
        sBuilder.append(c);
      }
      System.out.println(sBuilder.toString());
    }
  }

  public static void drawChessBoard(int width, int height) {
    for (int hIndex = 0; hIndex < height; hIndex++) {
      StringBuilder sBuilder = new StringBuilder();
      for (int wIndex = 0; wIndex < width; wIndex++) {
        char c = isEven(hIndex) != isEven(wIndex) ? '*' : ' ';
        sBuilder.append(c);
      }
      System.out.println(sBuilder.toString());
    }
  }

  public static boolean isEven(int n) {
    return n % 2 == 0;
  }

  public static boolean isPrime(int n) {
    if (n <= 1) return false;

    // we can check until square root because one factor will always be equal or less than square root
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static List<Integer> findAllNumberDivisors(int n) {
    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) list.add(i);
    }

    return list;
  }
}