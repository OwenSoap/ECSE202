package ca.mcgill.ecse202.a3;
import java.util.Scanner;

public class Question4 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");//Prompt the user to enter a positive integer
    int myNumber = input.nextInt();//Receive the integer
    
    //Use isPalindrome method to decide whether the number is palindrome and display the result
    if (isPalindrome(myNumber)==true){
      System.out.println(myNumber + " is a palindrome");
    }else{
      System.out.println(myNumber + " is not a palindrome");
    }
  }
  
  /**
   * @param decide whether myNumber is a palindrome
   * @return true for is and false for is not
   */
  public static Boolean isPalindrome(int myNumber){
    //Decide whether the number is a palindrome return true if it is return false if it is not
    if (reverse(myNumber) == myNumber){
      return true;
    }else{
      return false;
    }
  }
  
  /**
   * @param creverse myNumber
   * @return the value of reversed number
   */
  public static int reverse(int myNumber){
    //Decide whether the number is a palindrome step by step
    String reverse = "";    
    String n = myNumber + "";
    for (int i = n.length() - 1; i >= 0; i--) {
        reverse += n.charAt(i);
    }
    return Integer.parseInt(reverse);
  }

}
