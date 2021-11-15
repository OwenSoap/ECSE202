package ca.mcgill.ecse202.a3;
import java.util.Scanner;

public class Question2 {
  
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a String:");//Prompt the user to enter a string
       String sample = input.nextLine();//Receive the string
       conv(sample);//Invoke the method 
    }
  
  /**
   * @param convert the first letter of each word in myString to uppercase letter
   */
  public static void conv(String myString){
    
    //Check each character of the string
    for(int i=0;i<myString.length();i++){
      //Convert the first letter of the string to uppercase letter and put it back to the string
      String s1 = "" + myString.charAt(0);
      s1 = s1.toUpperCase();
      myString = s1 + myString.substring(1);
      
      //Convert the first letter of each world to uppercase letter and put it back to the string
      if(myString.charAt(i)==' '){
        String s2 = "" + myString.charAt(i+1);
        s2 = s2.toUpperCase();
        myString = myString.substring(0,i+1) + s2 + myString.substring(i+2,myString.length());
      }
    }
    //Display the result
    System.out.println("The new String is: " + myString);
  }

}

