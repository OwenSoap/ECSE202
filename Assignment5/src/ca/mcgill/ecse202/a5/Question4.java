package ca.mcgill.ecse202.a5;

public class Question4 {
  public static void main(String[] args) {
   
    // Create and try two triangles with different sides to check whether they are legal triangles
    try {
      TriangleWithException t1 = new TriangleWithException(1.5, 2, 3);
      System.out.println("Perimeter for t1: " + t1.getPerimeter());
      System.out.println("Area for t1: " + t1.getArea());
      TriangleWithException t2 = new TriangleWithException(1, 2, 3);
      System.out.println("Perimeter for t2: " + t2.getPerimeter());
      System.out.println("Area for t2: " + t2.getArea());
    } catch (IllegalTriangleException ex) {
      System.out.println("Illegal triangle");
      System.out.println("Side1: " + ex.getSide1());
      System.out.println("Side2: " + ex.getSide2());
      System.out.println("Side3: " + ex.getSide3());
    }
  
  }
}

class IllegalTriangleException extends Exception {
  
  // Double data fields side1 side2 and side3 that store the sides of the triangle
  private double side1;
  private double side2;
  private double side3;

  //A constructor that creates a triangle has specified sides
  public IllegalTriangleException(double side1, double side2, double side3) {

    super("Not a real triangle:" + " side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;

  }
  
  /** A getter method
   * @return the the side1 of the triangle
   */
  public double getSide1() {
    return side1;
  }
  
  /** A getter method
   * @return the side2 of the triangle
   */
  public double getSide2() {
    return side2;
  }

  /** A getter method
   * @return the side3 of the triangle
   */
  public double getSide3() {
    return side3;
  }
}

class TriangleWithException extends GeometricObject {
  
  // Double data fields side1 side2 and side3 that store the sides of the triangle
  private double side1;
  private double side2;
  private double side3;

  // A constructor that creates a triangle has default sides
  public TriangleWithException() {
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }
  
  // A constructor that creates a triangle has specified sides and exception
  public TriangleWithException(double side1, double side2, double side3)
      throws IllegalTriangleException {
    if ((side1 >= 0) && (side2 >= 0) && (side3 >= 0) && isTriangle(side1, side2, side3)) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      throw new IllegalTriangleException(side1, side2, side3);
    }
  }

  /** A getter method
   * @return the side1 of the triangle
   */
  public double getSide1() {
    return side1;
  }

  /** A getter method
   * @return the side2 of the triangle
   */
  public double getSide2() {
    return side2;
  }

  /** A getter method
   * @return the side3 of the triangle
   */
  public double getSide3() {
    return side3;
  }
  
  /** A boolean method checks whether the triangle is valid
   * @param side1 represents the side1 of the triangle
   * @param side2 represents the side2 of the triangle
   * @param side3 represents the side3 of the triangle
   * @return whether the triangle is valid
   */
  public boolean isTriangle(double side1, double side2, double side3) {
    return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
  }
  
  @Override
  public double getArea() {
    double s = (side1 + side2 + side3) / 2.0;
    return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
  }

  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public String toString() {
    return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
  }

}

