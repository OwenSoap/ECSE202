package ca.mcgill.ecse202.a2;
import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
    
    int computer = (int)(Math.random() * 3);//Computer generates a random number between 0-2
    System.out.print("Enter a number 0, 1 or 2 which represents scissor(0), rock(1) or paper(2):");
    
    Scanner input = new Scanner(System.in);
    int user = input.nextInt();//Let user enter a random number
    
    //Display what gesture computer shows 
    if(computer == 0){
      System.out.print("The computer is scissor");
    }else if(computer == 1){
      System.out.print("The computer is a rock");
    }else{
      System.out.print("The computer is a paper");
    }
   
    //Display the situations when user won what the user showed
    if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
      
      if(user == 0) {
       System.out.print(" You are scissor. You won.");
      }else if(user == 1) {
       System.out.print(" You are rock. You won.");
      }else if(user == 2) {
       System.out.print(" You are paper. You won.");
      }
    
     //Display the situations when it is a draw what user showed
    }else if(user == computer) {
      if(user == 0) {
       System.out.print(" You are scissor too. It is a draw.");
      }else if(user == 1) {
       System.out.print(" You are rock too. It is a draw.");
      }else{
       System.out.print(" You are paper too. It is a draw.");
      }
     
     //Display the situations when user lose what user showed
    }else{
      if(user == 0) {
       System.out.print(" You are scissor. You lose.");
      }else if(user == 1) {
       System.out.print(" You are rock. You lose.");
      }else{
       System.out.print(" You are paper. You lose.");
      }
    
    }
  
  }

}
