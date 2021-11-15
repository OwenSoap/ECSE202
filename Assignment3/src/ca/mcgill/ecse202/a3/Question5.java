package ca.mcgill.ecse202.a3;
import java.util.Scanner;

public class Question5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 3 numbers: ");//Prompt the user to enter 3 numbers
    double num1 = input.nextDouble();//Receive the first number
    double num2 = input.nextDouble();//Receive the second number
    double num3 = input.nextDouble();//Receive the third number
    displaySortedNumbers(num1,num2,num3);

  }
 
  /**
   * @param compare the value of num1 num2 and num3, then make it in increasing order
   */
  public static void displaySortedNumbers(double num1, double num2, double num3) {
      double temp; 
      
      if (num2 < num1 && num2 < num3){
          temp = num1;
          num1 = num2;
          num2 = temp;
      }else if (num3 < num1 && num3 < num2) {
          temp = num1; 
          num1 = num3;
          num3 = temp;
      }if (num3 < num2){
          temp = num2;
          num2 = num3;
          num3 = temp;
      }
      System.out.println("Numbers in increasing order is " + num1 + " " + num2 + " " + num3);
  }

}
