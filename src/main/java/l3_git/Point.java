package l3_git;

public class Point {
  public int x;
  public int y;

  private Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static Point of(int x, int y) {
    return new Point(x, y);
  }
}
