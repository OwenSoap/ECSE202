package ca.mcgill.ecse202.a1;
import java.util.Scanner;

public class Question4 {
  
  public static void main(String[] args) {
  
    //Creat a Scanner object
    Scanner input = new Scanner(System.in); 
    
    //Prompt the user to enter the coordinates of two points
    System.out.print("Enter the coordinates for two points: ");
    
    double x1 = input.nextDouble(); //Got x1
    double y1 = input.nextDouble(); //Got y1
    double x2 = input.nextDouble(); //Got x2
    double y2 = input.nextDouble(); //Got y2
    
    double slope = (y2 - y1) / (x2 - x1 ); //Compute the slope
    double b = y1 - slope * x1; //Compute b
    
    
    if (x1 == x2 && y1 == y2){
      System.out.println("It is a point (" + x1 + ", " + y1 + ")"  );//Display the equation when x1 = x2 and y1 = y2
    }else if (x1 == x2){
      System.out.println("The line equation for two points (" + x1 + ", " + y1 
          + ") and (" + x2 + ", " + y2 + ") is x = " + x1 ); //Display the equation when x1 = x2 but y1 does not equal to y2
    }else if (slope == 1 && b ==0){
      System.out.println("The line equation for two points (" + x1 + ", " + y1 
          + ") and (" + x2 + ", " + y2 + ") is y = x");//Display the equation when slope = 1 and b = 0
    }else if (slope == 1){
      System.out.println("The line equation for two points (" + x1 + ", " + y1 
          + ") and (" + x2 + ", " + y2 + ") is  y = x + " + b);//Display the equation when slope = 1 but b does not equal to 0
    }else if (slope == 0){
      System.out.println("The line equation for two points (" + x1 + ", " + y1 
          + ") and (" + x2 + ", " + y2 + ") is y = " + b );//Display the equation when slope = 0
    }else if (b == 0){
      System.out.println("The line equation for two points (" + x1 + ", " + y1 
          + ") and (" + x2 + ", " + y2 + ") is y = " + slope + "x");//Display the equation when b = 0 but slope does not equal to 1 or 0
    }else{ 
      System.out.println("The line equation for two points (" + x1 + ", " + y1 
          + ") and (" + x2 + ", " + y2 + ") is " + "y = " + slope + "x" + " + "
          + b);//Display the equation when slope exits but does equal to 0 or 1 and b does not equal to 0 
    }
  
  } 

}
