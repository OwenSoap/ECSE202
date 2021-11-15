package ca.mcgill.ecse202.a4;
import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number of rows and columns of the array: "); // Prompt the user to enter the rows and columns of an array
    int row = input.nextInt(); // Receive the number of rows
    int column = input.nextInt(); // Receive the number of columns
    double[][] m = new double[row][column]; // Create a double type array for numbers
    System.out.print("Enter the array: "); // Prompt the user to enter the contains of the array
    
    // Create the array
    for (int i = 0; i < row; i++) {
      for (int k = 0; k < column; k++) {
        m[i][k] = input.nextDouble();
      }
    }

    // Use the locateLargest method to locate the largest value
    int[] location = locateLargest(m);
    System.out.printf("The location of the largest element is at (%d, %d)\n", location[0],
        location[1]);

  }

  /** Get the location of the largest number in the array
   * @param a an array of input numbers
   * @return the location of the largest number in the array
   */
  public static int[] locateLargest(double[][] a) {

    // Create a one-dimensional array for the location of the largest number in the array
    int[] location = new int[] {0, 0};
    double largest = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int k = 0; k < a[i].length; k++) {
        if (a[i][k] > largest) {
          location[0] = i; // Row
          location[1] = k; // Column
          largest = a[i][k];
        }
      }
    }

    return location;// Return the location

  }

}
