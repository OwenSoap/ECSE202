package ca.mcgill.ecse202.a4;

public class Question5 {

  public static void main(String[] args) {

    MyPoint a = new MyPoint(); // Create a default point(0, 0)
    MyPoint b = new MyPoint(10, 30.5); // Create a point with coordinates(10, 30.5)
    System.out.print("The distance between a and b is " + b.distance(a)); // Display the distance

  }

}

class MyPoint {

  // The data fields x and y that represent the coordinates with get methods.
  private double x;
  private double y;

  // A no-arg constructor that creates a point(0,0).
  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }
  
  // A constructor that constructs a point with specified coordinates.
  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /** A getter method fetches and returns the x-coordinate of MyPoint
   * @return the x-coordinate of MyPoint
   */
  public double getX() {
    return x;
  }

  /** A getter method fetches and returns the y-coordinate of MyPoint
   * @return the y-coordinate of MyPoint
   */
  public double getY() {
    return y;
  }

  /** A method named distance that calculates the distance from this point to another point of the MyPoint type
   * @param P a test point of the MyPoint type
   * @return the value of the distance
   */
  public double distance(MyPoint P) {
    return Math.sqrt(((x - P.getX()) * (x - P.getX())) + ((y - P.getY()) * (y - P.getY())));
  }

  /** A method named distance that calculates the distance from this point to another point with specified x and y coordinates
   * @param x1 x coordinate of the specified point
   * @param y1 y coordinate of the specified point
   * @return the value of the distance
   */
  public double distance(double x1, double y1) {
    return Math.sqrt(((x - x1) * (x - x1)) + ((y - y1) * (y - y1)));
  }

}