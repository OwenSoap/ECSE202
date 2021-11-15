package ca.mcgill.ecse202.a3;

public class Question6 {

  public static void main(String[] args) {
    
    int sum = 0;
    
    //Pass the value by args and add those values
    for (int i=0; i<args.length; i++){
      sum += Integer.parseInt(args[i]);
    }
    
    //Displya the result
    System.out.println("The total is " + sum);

  }

}
