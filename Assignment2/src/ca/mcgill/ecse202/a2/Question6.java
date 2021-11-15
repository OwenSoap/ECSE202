package ca.mcgill.ecse202.a2;
import java.util.Scanner;

public class Question6 {

  public static void main(String[] args) {
      
      //Prompt the user to enter a string genome
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a genome string: ");
      String genome = input.nextLine();
      
      boolean found = false;//Let initial boolean value found to be false
      int start = -1;//Define the initial start is equal to -1
      
      for(int i = 0; i < genome.length() - 2; i++) {
        
        String triplet = genome.substring(i, i + 3);//Define the triplet is equal to 3 characters
        
        //Matching the correct start triplet and end triplet and make sure the length of the genome is multiples of three
        if(triplet.equals("ATG")) {
          start = i + 3;
        }else if(((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1)){
          String gene = genome.substring(start, i);
          if (gene.length() % 3 == 0){
            found = true;
            System.out.println(gene);//Display the result when found it
          }
        }
      
      }
     
      if(found != true)
      System.out.println("no gene is found");//Display the result when did not find the correct answer
   
  }

}

