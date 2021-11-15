package ca.mcgill.ecse202.a2;

public class Question2 {

  public static void main(String[] args) {
   
    double x = (double)((-5) + Math.random() * 10);//Generate the x coordinate of a random point
    double y = (double)((-5) + Math.random() * 10);//Generate the y coordinate of a random point
    
    //When the point is outside the circle, regenerate y coordinate
    while (Math.pow(x,2)+Math.pow(y, 2) > 25){
      y = (double)((-5) + Math.random() * 10);
    }
    
    //Calculate the distance from the point to the center of the circle
    double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    
    //Dislplay the result
    System.out.println("The point is (" + x + ", " + y + 
        ") and its distance to the center is " + d);
    
  }

}
