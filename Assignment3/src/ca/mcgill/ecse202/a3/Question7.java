package ca.mcgill.ecse202.a3;
import java.util.Scanner;

public class Question7 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the order of the polynomial n: ");//Prompt the user to enter an integer
    int p = input.nextInt();//Receive the integer
    System.out.print("Enter the coefficients: ");//Prompt the user to enter the coefficients and invoke the array
    double [] a = new double[p+1];//Create an array and collect the numbers into an array
    for(int i = 0; i<p+1; i++){
      a [i] = input.nextDouble();
    }
    System.out.print("Enter x: ");//Prompt the user to enter x
    double x = input.nextDouble();//Receive x
    double result =evaluatePolynomial(a,x);//Invoke the add up method
    System.out.print("The polynomial expression is: " + result);//Display the result
    
  }
  
  /**Use Horner's approach to calculate a polynomial
   * @param the numbers in a to be coefficients
   * @param x to be the value of unknown value
   * @return the value of sum
   */
  public static double evaluatePolynomial(double [] a, double x){
    
    double sum = 0;
    int orderOfPolynomial = a.length-1;
    
    //Add up the polynomial
    while(orderOfPolynomial>=0){
      for(int r=0;r<=a.length-1;r++){
      sum += a[r]*Math.pow(x, orderOfPolynomial);
      orderOfPolynomial--;
      }
    }
    return sum;
  }

}
