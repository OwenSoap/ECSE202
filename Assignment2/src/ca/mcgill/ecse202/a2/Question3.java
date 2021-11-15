package ca.mcgill.ecse202.a2;
import java.util.Scanner;

public class Question3 {

  public static void main(String[] args) {
    
    //Prompt the user to enter a numerator
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a numerator: ");
    int num = input.nextInt();
    
    System.out.print("Enter a denominator: ");
    int den = input.nextInt();//Prompt the user to enter a denominator
    
    //Display the result when the user entered a proper fraction
    if(num < den){
      System.out.println(num +" / " + den + " is a proper fraction");
   
    //Display the result when the user entered a fraction can be exactly reduced to a number
    }else if(num % den == 0){
      System.out.println(num + " / " + den + 
        " is an improper fraction and it can be redueced to " + num/den);
    
    //Display the result when the user entered an improper fraction and is mixed fraction
    }else{
      System.out.println(num + " / " + + den + 
      " is an improper fraction and its mixed fraction is " + num/den + " + " +
        (num - (num/den)*den) + " / " + den);
    }
    
  }

}
