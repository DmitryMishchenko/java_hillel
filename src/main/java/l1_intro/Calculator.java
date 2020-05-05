package l1_intro;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {
  private Scanner scanner;
  private Map<String, BiFunction<Double, Double, Double>> operations;

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.ENGLISH);
    calculator.run(scanner);
  }

  public void run(Scanner scanner) {
    this.initOperationsMap();
    this.scanner = scanner;

    double firstNumber = getNumberFromUser("Please input first number: ");
    System.out.print("Your input ");
    System.out.print(firstNumber);
    System.out.println(" as a first number.");
    double secondNumber = getNumberFromUser("Please input second number: ");
    System.out.print("Your input ");
    System.out.print(secondNumber);
    System.out.println(" as a second number.\n");

    String operation = getMathOperationFromUser("Please specify math operation that you wanna perform", "Valid operations are +, -, /, *, %");
    System.out.println(operation);

    Double result = operations.get(operation).apply(firstNumber, secondNumber);
    System.out.println(firstNumber + operation + secondNumber + " = " + result);

    this.scanner.close();
    System.exit(0);
  }

  private void initOperationsMap() {
    Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
    operations.put("+", Double::sum);
    operations.put("-", (a, b) -> a - b);
    operations.put("/", (a, b) -> a / b);
    operations.put("*", (a, b) -> a / b);
    operations.put("%", (a, b) -> a % b);
    this.operations = operations;
  }

  public String getMathOperationFromUser(String message, String error) {
    System.out.println(message);
    while (true) {
      String userInput = this.scanner.next();
      if (this.operations.containsKey(userInput)) {
        return userInput;
      } else {
        System.out.println(ConsoleColors.RED + error + ConsoleColors.RESET);
      }
    }
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
