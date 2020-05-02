package l1_intro;

public class ValidationResponse<T> {
  public String error;
  public T value;

  public ValidationResponse(T value, String error) {
    this.value = value;
    this.error = error;
  }

  public ValidationResponse(T value) {
    this.value = value;
    this.error = null;
  }
}
