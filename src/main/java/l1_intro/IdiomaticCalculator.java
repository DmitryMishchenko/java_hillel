package l1_intro;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdiomaticCalculator {
  final private Pattern highPriorityOperationsReg = Pattern.compile("(-?\\d+\\.?\\d*)([*/])(-?\\d+\\.?\\d*)");
  final private Pattern lowPriorityOperationsReg = Pattern.compile("(-?\\d+\\.?\\d*)([+-])(-?\\d+\\.?\\d*)");
  private Scanner scanner;
  private Map<String, BiFunction<Double, Double, Double>> operations;

  public static void main(String[] args) {
    IdiomaticCalculator calculator = new IdiomaticCalculator();
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.ENGLISH);
    calculator.run(scanner);
  }

  public void run(Scanner scanner) {
    this.initOperationsMap();
    this.scanner = scanner;

    System.out.println(ConsoleColors.GREEN + "Welcome to idiomatic calculator." + ConsoleColors.RESET);
    while (true) {
      try {
        String expression = getExpressionFromUser("Specify expression and I'll calculate it for you. Example: \"2 * (3 / 9) + 3\"");
        double result = calculateDynamic(expression);
        System.out.println(expression + " = " + result);
      } catch (Exception err) {
        System.out.println("Invalid expression");
      }
    }
  }

  public double calculateDynamic(String expression) {
    expression = expression.replaceAll("\\s+","");
    String innerExpression;
    do {
      innerExpression = findNestedExpression(expression);
      if (innerExpression != null) {
        expression = expression.replace('(' + innerExpression + ')', Double.toString(execAtomicExpression(innerExpression)));
      }
    } while (innerExpression != null);
    return execAtomicExpression(expression);
  }

  private double execAtomicExpression(String expression) {
    Matcher matcher = highPriorityOperationsReg.matcher(expression);

    // first try to find high priority operations like division and multiplication
    if (!matcher.find()) {
      // then low priority like plus and minus
      matcher = lowPriorityOperationsReg.matcher(expression);
      // if no operations left in the string return result
      if (!matcher.find()) return ValidationService.parseDouble(expression).value;
    }

    String match = matcher.group(1) + matcher.group(2) + matcher.group(3);
    ValidationResponse<Double> a = ValidationService.parseDouble(matcher.group(1));
    String operation = matcher.group(2);
    ValidationResponse<Double> b = ValidationService.parseDouble(matcher.group(3));

    double result = operations.get(operation).apply(a.value, b.value);

    // replace match with executed result and continue to search and exec expressions
    return execAtomicExpression(expression.replace(match, Double.toString(result)));
  }

  static String findNestedExpression(String expression) {
    int openBracketIndex = expression.lastIndexOf('(');
    if (openBracketIndex == -1) return null;
    int closeBracketIndex = expression.substring(openBracketIndex).indexOf(')') + openBracketIndex;

    return expression.substring(openBracketIndex + 1, closeBracketIndex);
  }

  private void initOperationsMap() {
    Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();
    operations.put("+", Double::sum);
    operations.put("-", (a, b) -> a - b);
    operations.put("/", (a, b) -> a / b);
    operations.put("*", (a, b) -> a * b);
    this.operations = operations;
  }

  public String getExpressionFromUser(String message) {
    System.out.println(ConsoleColors.BLUE_BOLD + message + ConsoleColors.RESET);
    return this.scanner.nextLine();
  }
}
