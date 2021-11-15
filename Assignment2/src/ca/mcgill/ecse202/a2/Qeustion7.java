package ca.mcgill.ecse202.a2;

public class Qeustion7 {

  public static void main(String[] args) {
    
    int numberOfHits = 0;//Define the number of hits
    
    for(int n = 0; n<1000000; n++){
      double x = (double)(-1 + Math.random() * 2);//Generate the random number for x coordinate
      double y = (double)(-1 + Math.random() * 2);//Generate the random number for y coordinate
      double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));//Calculate the radius
     
      //When the point is in the circle number of hits will increase one
      if(r <= 1){
      ++numberOfHits;
      }
     
    }
    
    double pi = 4.0 * numberOfHits/1000000;//Calculate the value of pi
    System.out.println("PI = " + pi);//Display the result
  
  }

}
