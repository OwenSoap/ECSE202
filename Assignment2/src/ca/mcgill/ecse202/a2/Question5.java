package ca.mcgill.ecse202.a2;
import java.util.Scanner;

public class Question5 {

  public static void main(String[] args) {
   
    //Prompt the user to enter a four digit binary number
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a four digit binary string: ");
    String bin = input.next();
    
    int x = 0;//Define the initial value of decimal number
    int mul = 1;//Define the initial multiplier
    
    //Use formula to transfer the binary number into decimal number
    for(int i = 3; i>=0; i--){
      x += mul * (bin.charAt(i) == '1'?1:0);
      mul *= 2;
    }
  
    System.out.println("The decimal number for " + bin + " is " + x);//Display the result
  
  }

}
