package l1_intro;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
  Scanner scanner;

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.ENGLISH);
    calculator.run(scanner);
  }

  public void run(Scanner scanner) {
    this.scanner = scanner;

    double firstNumber = getNumberFromUser("Please input first number: ");
    System.out.print("Your input ");
    System.out.print(firstNumber);
    System.out.println(" as a first number.");
    double secondNumber = getNumberFromUser("Please input second number: ");

    System.out.print("Your input ");
    System.out.print(secondNumber);
    System.out.println(" as a second number.\n");

    double sum = firstNumber + secondNumber;
    System.out.println("Sum is " + sum);
    double diff = firstNumber - secondNumber;
    System.out.println("Difference is " + diff);
    double mult = firstNumber * secondNumber;
    System.out.println("Multiplication is " + mult);
    double div = firstNumber / secondNumber;
    System.out.println("Division is " + div);

    this.scanner.close();
    System.exit(0);
  }

  public double getNumberFromUser(String message) {
    ValidationResponse<Double> result;

    do {
      System.out.println(message);
      String userInput = this.scanner.next();
      result = ValidationService.parseDouble(userInput);
      if (result.error != null) {
        System.out.println(ConsoleColors.RED + result.error + ConsoleColors.RESET);
      }
    } while (result.error != null);

    return result.value;
  }
}
