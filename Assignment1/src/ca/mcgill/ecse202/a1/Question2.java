package ca.mcgill.ecse202.a1;
import java.util.Scanner; //Scanner is in the java.util package

public class Question2 {
 
  public static void main(String[] args) {
    
    //Creat a Scanner object
    Scanner input = new Scanner(System.in); 
    
    //Prompt the user to enter the width and height of a rectangle
    System.out.print("Enter the width and height of a rectangle: ");
    
    double width = input.nextDouble(); //Got width
    double height = input.nextDouble(); //Got height
    
    double perimeter = 2 * (width + height); //Compute perimeter
    double area = width * height; //Compute area
    double lengthOfTheDiagonal = Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2)); //Compute length of diagonal
    
    System.out.println("The perimeter is " + perimeter); //Display perimeter
    System.out.println("The area " + area); //Display area
    System.out.println("The length of the diagonal is " + lengthOfTheDiagonal); //Display length of the diagonal
  
  }

}
