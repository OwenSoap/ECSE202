package ca.mcgill.ecse202.a6;

import java.util.Scanner;

public class Question2 {
  public static void main(String args[]) {
    
    Scanner in = new Scanner(System.in);
    int h; // int variable h represents hours
    int m; // int variable m represents minutes
    int s; // int variable s represents seconds
    long t; // long variable t represents elapsed time
    System.out.print("Enter time1 (hour minute second): "); // Prompt user to enter an exact time
    h = in.nextInt();
    m = in.nextInt();
    s = in.nextInt();
    Time t1 = new Time(h, m, s); // Create a Time object t1
    System.out.println(t1); // Display t1
    System.out.println("Elapsed seconds in time1: " + t1.getSeconds() + "\n"); // Display the elapsed time of t1
    System.out.print("Enter time2 (elapsed time): "); // Prompt user to enter an elapsed time
    t = in.nextLong();
    Time t2 = new Time(t); // Create a Time object t2
    System.out.println(t2); // Display t2
    System.out.println("Elapsed seconds in time2: " + t2.getSeconds() + "\n" ); // Display the second of t2
    System.out.println("time1.compareTo(time2)? " + t1.compareTo(t2)+ "\n" ); // Display the difference between t1 and t2
    Time t3 = t1.clone(); // Clone t1 to t3
    System.out.println(
        "time3 is created as a clone of time1 " + "\n" + "time1.compareTo(time3)? " + t1.compareTo(t3)); // Display whether t3 is cloned t1
  
  }
}

class Time implements Cloneable, Comparable<Time> {

  // A long data field stores the elapsed time since midnight 1 Jan, 1970
  private long t = System.currentTimeMillis();

  // A constructor that constructs a current time
  public Time() {
    Time t = new Time(System.currentTimeMillis() / 1000);
  }

  // A constructor with specified hour, minute and second to create a time
  public Time(int h, int m, int s) {
    this.t = (((h * 60) + m) * 60) + s;
  }

  // A constructor with specified elapsed time since midnight 1 Jan, 1970
  public Time(long t) {
    this.t = t;
  }
  
  /** A getHour method
   * @return the current hour in range 0-23 
   */
  public int getHour() {
    return (int) ((t / 3600) % 24);
  }

  /** A getMinute method
   * @return the current minute in range 0-59 
   */
  public int getMinute() {
    return (int) ((t / 60) % 60);
  }

  /** A getSecond method
   * @return the current second in range 0-59  
   */
  public int getSecond() {
    return (int) (t % 60);
  }

  /** A getSeconds method
   * @return the elapsed total seconds
   */
  public long getSeconds() {
    return t;
  }
  
  @Override
  public String toString() {
    String s = this.getHour() + ((this.getHour() == 1) ? " hour " : " hours ") + this.getMinute()
        + ((this.getMinute() == 1) ? " minute " : " minutes ") + this.getSecond()
        + ((this.getSecond() == 1) ? " second " : " seconds ");
    return s;

  }

  @Override
  public int compareTo(Time o) {
    return (int) (t - ((Time) o).t);
  }
  
  @Override
  public Time clone() {
    Time clone = new Time();
    clone.t = t;
    return clone;
  }

}

