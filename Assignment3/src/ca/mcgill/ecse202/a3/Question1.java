package ca.mcgill.ecse202.a3;
import java.util.Scanner;
import java.util.Random;

public class Question1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Display the main menu every time and prompt the user to select an option
    while (true) {
      System.out.println("Main menu ");
      System.out.println("1: Addition");
      System.out.println("2: Subtraction");
      System.out.println("3: Multiplication");
      System.out.println("4: Division");
      System.out.println("5: Exit");
      System.out.print("Enter a choice: ");
      
      //Receive the option and generate two random numbers
      int n = input.nextInt();
      int x = (int)(Math.random() * 10);
      int y = (int)(Math.random() * 10);
     
      //Start a switch statement
      switch (n) {
        
        //Adding two random numbers and prompt the user to enter the answer
        case 1: {
          int add = x + y;
          System.out.print(" What is " + x + " + " + y + "? ");
          int z = input.nextInt();
          
          //Decide whether the answer is correct, display the result
          if(z == add){
            System.out.println("Correct" + "\n");
          }else{
            System.out.println("Your answer is wrong. The correct answer is " + add + "\n");
          }
          break;
        }
        
        //Subtracting two random numbers and prompt the user to enter the answer
        case 2: {
          while (x < y){
            y = (int)(Math.random() * 10);
          }
          System.out.print("What is " + x + " - " + y + "? ");  
          int sub = x - y;
          int z = input.nextInt();
          
          //Decide whether the answer is correct, display the result
          if(z == sub){
            System.out.println("Correct" + "\n");
          }else{
            System.out.println("Your answer is wrong. The correct answer is " + sub + "\n");
          }
          break;
        }
      
        //Multiplying two random numbers and prompt the user to enter the answer
        case 3: {
          int mul = x * y;
          System.out.print("What is " + x + " * " + y + "? " );
          int z=input.nextInt();
        
          //Decide whether the answer is correct, display the result
          if(z == mul){
            System.out.println("Correct" + "\n");
          }else{
            System.out.println("Your answer is wrong. The correct answer is " + mul + "\n");
          }
          break;
        }
        
        //Dividing one random number by another and prompt the user to enter the answer
        case 4: {
          while(y == 0){
            y = (int)(Math.random() * 10);
          }
          int div =  x / y;
          System.out.print("What is " + x + " / " + y + "? " );
          int z=input.nextInt();
        
          //Decide whether the answer is correct, display the result
          if(z == div){
            System.out.println("Correct" + "\n");
          }else{
            System.out.println("Your answer is wrong. The correct answer is " + div + "\n");
          }
          break;
        }
        //Exit the switch statement 
        case 5:{
          System.exit(0);
        }

      }

    }

  }

}
