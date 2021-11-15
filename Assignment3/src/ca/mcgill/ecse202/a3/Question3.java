package ca.mcgill.ecse202.a3;
import java.util.Scanner;

public class Question3 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");//Prompt the user to enter an integer
    int myInteger = input.nextInt();//Receive the integer
    System.out.println("The binary value is " + dec2Bin(myInteger));//Invoke the method and display the result
  
  }

  /**
   * @param convert myInteger to its corresponding binary number
   * @return the value of binary number
   */
  public static String dec2Bin(int myInteger) {
    
    //Check whether the integer is equal to zero and then convert it into its corresponding binary number
    if (myInteger == 0) {
      return "0";
    }
    String binary = "";
    while (myInteger > 0) {
      int rem = myInteger % 2;
      binary = rem + binary;
      myInteger = myInteger / 2;
    }
    return binary;
  
  }

}


  


