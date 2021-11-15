package ca.mcgill.ecse202.a1;
import java.util.Scanner;

public class Question3 {
  
  public static void main(String[] args) {
 
    //Creat a Scanner object
    Scanner input = new Scanner(System.in); 
    
    //Prompt the user to enter the coordinates of two points
    System.out.print("Enter the coordinates for two points: ");
    
    double x1 = input.nextDouble(); //Got x1
    double y1 = input.nextDouble(); //Got y1
    double x2 = input.nextDouble(); //Got x2
    double y2 = input.nextDouble(); //Got y2
    
    double slope = (y2 - y1) / (x2 - x1 ); //Compute slope 
    
    if (x1 == x2){
      System.out.print("The slope for the line does not exist"); //Dispaly slope when x1 = x2
    }else{ 
      System.out.print("The slope for the line that connects two points (" + 
    x1 + ", " + y2 + ") and (" + x2 + ", " + y2 + ") is " + slope);  //Dispaly slope
    }
  
  }

}
