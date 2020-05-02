package l1_intro;

public class ValidationService {
  static ValidationResponse<Double> parseDouble(String input) {
    if (input.equals("")) {
      return new ValidationResponse<Double>(null, "String should not be empty");
    }

    try {
      double val = Double.parseDouble(input);

      return new ValidationResponse<Double>(val);
    } catch (Exception e) {
      return new ValidationResponse<Double>(null, "Please specify valid number");
    }
  }
}
