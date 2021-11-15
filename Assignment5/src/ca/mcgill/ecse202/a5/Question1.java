package ca.mcgill.ecse202.a5;

public class Question1 {
  public static void main(String[] args) {

    MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);// Create a new rectangle r1
    System.out.println("Area is: " + r1.getArea());// Display the area of r1
    System.out.println("Perimeter is: " + r1.getPerimeter());// Display the perimeter of r1
    System.out.println("rect.contains(3, 3): " + r1.contains(3, 3));// Display whether r1 contains (3,3)
    System.out.println("rect.contains(new MyRectangle2D(4, 5, 10.5, 3.2)): "
        + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));// Display whether r1 contains another rectangle
    System.out.println("rect.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): "
        + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));// Display whether r1 overlaps another rectangle
  
  }

}

class MyRectangle2D {

  // Double data fields named x, y, width and height that store the coordinates of center and width and height of the rectangle
  private double x;
  private double y;
  private double width;
  private double height;

  /** A getter method
   * @return the x coordinate of the rectangle
   */
  public double getX() {
    return x;
  }

  /** A setter method
   * @param x represents the x coordinate of the center of the rectangle
   */
  public void setX(double x) {
    this.x = x;
  }

  /** A getter method
   * @return the y coordinate of the rectangle
   */
  public double getY() {
    return y;
  }
  
  /** A setter method
   * @param y represents the y coordinate of the center of the rectangle
   */
  public void setY(double y) {
    this.y = y;
  }

  /** A getter method
   * @return the width of the rectangle
   */
  public double getWidth() {
    return width;
  }

  /** A setter method
   * @param width represents the width of the rectangle
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /** A getter method
   * @return the height of the rectangle
   */
  public double getHeight() {
    return height;
  }
  
  /** A setter method
   * @param width represents the width of the rectangle
   */
  public void setHight(double height) {
    this.height = height;
  }

  // A constructor that creates a MyRectangle2D object has default center, width and height
  public MyRectangle2D() {
    x = 0;
    y = 0;
    width = 1;
    height = 1;
  }

  // A constructor that creates MyRectangle2D object has specified center coordinates, width and height
  public MyRectangle2D(double x, double y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
 
  /** A getter method
   * @return the area of the rectangle
   */
  public double getArea() {
    return width * height;
  }
  
  /** A getter method
   * @return the perimeter of the rectangle
   */
  public double getPerimeter() {
    return 2 * (width + height);
  }

  /** A boolean method contains(double x, double y)
   * @param x the x coordinate of a point
   * @param y the y coordinate of a point
   * @return whether a specified point (x, y) is inside the rectangle
   */
  public boolean contains(double x, double y) {
    return Math.abs(x - this.x) < width / 2 && Math.abs(y - this.y) < height / 2;
  }

  /** A boolean method contains(MyRectangle2D r)
   * @param r a rectangle with specified width and height
   * @return whether the specified rectangle is inside the rectangle
   */
  public boolean contains(MyRectangle2D r) {
    return contains(r.x - r.width / 2, r.y + r.height / 2)
        && contains(r.x - r.width / 2, r.y - r.height / 2)
        && contains(r.x + r.width / 2, r.y + r.height / 2)
        && contains(r.x + r.width / 2, r.y - r.height / 2);
  }

  /** A boolean method overlaps(MyRectangle2D r)
   * @param r a rectangle with specified width and height
   * @return whether the specified rectangle overlaps with this rectangle
   */
  public boolean overlaps(MyRectangle2D r) {
    return (Math.abs(r.x - x) <= (r.width + width) / 2
        && Math.abs(r.y - y) <= (r.height + height) / 2);
  }

}

