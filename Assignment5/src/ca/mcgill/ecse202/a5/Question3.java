package ca.mcgill.ecse202.a5;
import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {

    // Creating an array with 100 random integers
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 100);
    }

    // Prompt the user to enter the index of a number in the array
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index: ");

    // Try whether the user input a valid index or it is out of bonds
    try {
      int index = input.nextInt();
      System.out.println("array[" + index + "] = " + array[index]);
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Out of Bounds");
    }

  }
}
