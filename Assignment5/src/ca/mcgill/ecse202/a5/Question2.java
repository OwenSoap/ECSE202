package ca.mcgill.ecse202.a5;
import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides: ");// Prompt the user to enter three sides of the triangle
    double side1 = input.nextDouble();// Receive side1
    double side2 = input.nextDouble();// Receive side2
    double side3 = input.nextDouble();// Receive side3

    System.out.println("Enter the color: ");// Prompt the user to enter the color of the triangle
    String color = input.next();// Receive the color

    System.out.println("Enter a boolean value for filled: ");// Prompt the user to enter whether the triangle is filled
    boolean filled = input.nextBoolean();// Receive whether it is filled

    Triangle triangle = new Triangle(side1, side2, side3);// Create a new triangle with sides user entered
    triangle.setColor(color);// Set the color user entered to the triangle
    triangle.setFilled(filled);// Set whether it is filled user entered to the triangle
    System.out.println("The area is " + triangle.getArea());// Display the area of the triangle
    System.out.println("The perimeter is " + triangle.getPerimeter());// Display the perimeter of the triangle
    System.out.println("The triangle is " + triangle.isFilled());// Display whether the triangle if filled
    System.out.println("The color of the triangle is " + triangle.getColor());// Display the color of the triangle
    System.out.println(triangle.toString());// Display string description for the triangle
  
  }
}

class Triangle extends GeometricObject {

  // Double data fields side1 side2 and side3 that store the default sides of the triangle
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;

  //A constructor that creates a triangle has default sides
  public Triangle() {
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }
  
  //A constructor that creates a triangle has specified sides
  public Triangle(double side1, double side2, double side3) {
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

  /** A setter method
   * @param side represents the side1 of the triangle
   */
  public void setSide1(double side) {
    this.side1 = side;
  }

  /** A getter method
   * @return the side2 of the triangle
   */
  public double getSide2() {
    return side2;
  }
  
  /** A setter method
   * @param side represents the side2 of the triangle
   */
  public void setSide2(double side) {
    this.side2 = side;
  }

  /** A getter method
   * @return the side3 of the triangle
   */
  public double getSide3() {
    return side3;
  }

  /** A setter method
   * @param side represents the side3 of the triangle
   */
  public void setSide3(double side) {
    this.side3 = side;
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
    return "Triangle: " + "side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
  }

}
