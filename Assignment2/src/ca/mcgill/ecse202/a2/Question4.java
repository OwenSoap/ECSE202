package ca.mcgill.ecse202.a2;
import java.util.Scanner;

public class Question4 {

  public static void main(String[] args) {
  
    //Prompt the user to enter a string
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string in next line: ");
    String s = input.nextLine();

    int upper = 0;//Define an integer means the number of uppercasse letters
    
    //Calculate the number of uppercase letters
    for (int i = 0; i < s.length(); i++) {
        char thisChar = s.charAt(i);
        if (thisChar >= 65 && thisChar <= 90) {
            ++upper;
        }
    }
    
    System.out.println("The length of the string is " + s.length());//Display the length of string
    System.out.println("The first character is " + s.charAt(0));//Display the first character
    System.out.println("The last character is " + s.charAt(s.length()-1));//Display the last character
    System.out.println("The number of letters in uppercase is " + upper);//Display the number of uppercase letters

  }

}
