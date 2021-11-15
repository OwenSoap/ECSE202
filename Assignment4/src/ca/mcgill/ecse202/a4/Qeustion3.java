package ca.mcgill.ecse202.a4;
import java.util.Scanner;


public class Qeustion3 {

  public static void main(String[] args) { 
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns of the array: "); // Prompt the user to enter the rows and columns of an array
    int numberOfRows = input.nextInt(); // Receive the number of rows
    int numberOfColumns = input.nextInt(); // Receive the number of columns
    double[][] a = new double[numberOfRows][numberOfColumns]; // Create a double type array
    System.out.println("Enter the array: "); // Prompt the user to enter the contains of the array

    // Create the array
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = input.nextDouble();
      }
    }

    // Use locationLargest method in Location class to locate the largest value
    Location location = locateLargest(a);
    System.out.println("The location of the largest element is " + location.maxValue + " at ("
        + location.row + ", " + location.column + ")");

  }

  /** Get the location of the largest number in the array
   * @param a an array of input numbers
   * @return the largest number and the location of the largest number in the array
   */
  public static Location locateLargest(double[][] a) {

    Location loc = new Location(); // Make the instance
    loc.row = 0;
    loc.column = 0;
    loc.maxValue = a[0][0];

    // Locating the largest number
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > loc.maxValue) {
          loc.row = i;
          loc.column = j;
          loc.maxValue = a[i][j];
        }
      }
    }

    return loc; //  Return the instance

  }

}

class Location {

  // The data fields row, column, and maxValue that store the maximal value and its indices in two-dimensional array
  public int row, column;
  public double maxValue;

}


  


