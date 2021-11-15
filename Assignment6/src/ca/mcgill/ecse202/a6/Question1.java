package ca.mcgill.ecse202.a6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) throws FileNotFoundException {

    // Create a new file named Question1
    File file = new File("Question1.txt");

    // Check whether the file is already existed
    if (file.exists()) {
      System.out.println(file + " already exists");
    }

    // Write 100 random integers into the file
    PrintWriter output = new PrintWriter(file);

    for (int i = 0; i < 100; i++) {
      Random r = new Random();
      output.print(r.nextInt() + " ");
    }

    output.close();

    // Read integers back to program
    Scanner input = new Scanner(new File("Question1.txt"));

    // Create an array to store the integers
    int[] ints = new int[100];

    for (int i = 0; i < 100; i++) {
      ints[i] = input.nextInt();
    }

    input.close();

    // Sort the array
    java.util.Arrays.sort(ints);

    // Print the array
    for (int i = 0; i < 100; i++) {
      System.out.print(ints[i] + " ");
    }

  }
}
