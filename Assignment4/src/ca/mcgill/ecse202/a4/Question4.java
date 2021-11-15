package ca.mcgill.ecse202.a4;

public class Question4 {

  public static void main(String[] args) {
    
    MyInteger int1 = new MyInteger(23); // Create new integer int1 is 23
    MyInteger int2 = new MyInteger(56); // Create new integer int2 is 56
    MyInteger int3 = new MyInteger(2); // Create new integer int3 is 2
    MyInteger int4 = new MyInteger(29); // Create new integer int4 is 29
    MyInteger int5 = new MyInteger(29); // Create new integer int5 is 29

    System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime()); // Check and display whether int1 is a prime number
    System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime()); // Check and display whether int2 is a prime number
    System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven()); // Check and display whether int1 is even 
    System.out.printf("%d is even? %s%n", int2.getValue(), int2.isEven()); // Check and display whether int2 is even
    System.out.printf("%d is odd? %s%n", int3.getValue(), int3.isOdd()); // Check and display whether int3 is odd
    System.out.printf("%d is odd? %s%n", int4.getValue(), int4.isOdd()); // Check and display whether int4 is odd

    System.out.printf("93 is odd? %s%n", MyInteger.isOdd(93)); // Check and display whether 93 is odd
    System.out.printf("22 is odd? %s%n", MyInteger.isOdd(22)); // Check and display whether 22 is odd
    System.out.printf("94 is even? %s%n", MyInteger.isEven(94)); // Check and display whether 94 is even
    System.out.printf("3 is even? %s%n", MyInteger.isEven(3)); // Check and display whether 3 is even
    System.out.printf("2 is a prime numebr? %s%n", MyInteger.isPrime(2)); // Check and display whether 2 is a prime number
    System.out.printf("21 is a prime numebr? %s%n", MyInteger.isPrime(21)); // Check and display whether 21 is a prime number
    
    System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4)); // Check and display whether int1 is equal to int4
    System.out.printf("%d equals %d? %s%n", int4.getValue(), int5.getValue(), int4.equals(int5)); // Check and display whether int4 is equal to int4
    System.out.printf("%d equals 93 ? %s%n", int5.getValue(), int5.equals(93)); // Check and display whether int5 is equal to a specified number in the object
    
    System.out.printf("%d%n", MyInteger.parseInt(new char[] {'1', '5', '6'})); // Display the result after converting the array to an int
    System.out.printf("%d%n", MyInteger.parseInt("454")); // Display the result after converting the string to an int
  
  }

}

class MyInteger {

  // An int data field named value that stores value represented by this object.
  private int value;

  // A constructor that creates a MyInteger object for the specified int value.
  public MyInteger(int newValue) {
    value = newValue;
  }
  
  /** A getter method
   * @return the int value
   */
  public int getValue() {
    return value;
  }

  /** A boolean method isEven
   * @return whether the number is even
   */
  public boolean isEven() {

    // Check whether the number is an even number
    return (value % 2) == 0;

  }

  /** A boolean method isOdd
   * @return whether the number is odd
   */
  public boolean isOdd() {

    // Check whether the number is an odd number
    return (value % 2) == 1;

  }

  /** A boolean method isPrime
   * @return whether the number is a prime number
   */
  public boolean isPrime() {

    // Check whether the number is a prime number
    if (value == 1 || value == 2) {
      return true;
    } else {
      for (int i = 2; i < value; i++) {
        if (value % i == 0) {
          return false;
        }
      }
    }
    
    return true;

  }

  /** Check whether the value in the object is even
   * @param testInt a test int value
   * @return whether the value in the object is even
   */
  public static boolean isEven(int testInt) {

    // Check whether the number is an even number
    return (testInt % 2) == 0;

  }

  /** Check whether the value the object is odd
   * @param testInt a test int value
   * @return whether the value in the object is odd
   */
  public static boolean isOdd(int testInt) {

    // Check whether the number is an odd number
    return (testInt % 2) == 1;

  }

  /** Check whether the value in the object is a prime number
   * @param testInt a test int value
   * @return whether the value in the object is a prime number
   */
  public static boolean isPrime(int testInt) {

    // Check whether the number is a prime number
    if (testInt == 1 || testInt == 2) {
      return true;
    } else {
      for (int i = 2; i < testInt; i++) {
        if (testInt % i == 0) {
          return false;
        }
      }
    }
    
    return true;

  }

  /** Check whether the value in this object is even
   * @param myInt a specific int value in the object
   * @return whether the the value in the object is even
   */
  public static boolean isEven(MyInteger myInt) {
    return myInt.isEven();
  }

  /** Check whether the value in this object is odd
   * @param myInt a specific int value in the object
   * @return whether the value in the object is odd
   */
  public static boolean isOdd(MyInteger myInt) {
    return myInt.isOdd();
  }

  /** Check whether the value in this object is a prime number 
   * @param myInt a specific int value in the object
   * @return whether the value in the object is a prime number
   */
  public static boolean isPrime(MyInteger myInt) {
    return myInt.isPrime();
  }


  /** Check whether the value in this object is equal to the specified value
   * @param testInt a test int value
   * @return whether the value in this object is equal to the specified value
   */
  public boolean equals(int testInt) {
    if (testInt == value) {
      return true;
    }
    return false;
  }
  
  /** Check whether the value in this object is equal to the specified value
   * @param myInt a specific int value in the object
   * @return whether the value in this object is equal to the specified value
   */
  public boolean equals(MyInteger myInt) {
    if (myInt.value == this.value) {
      return true;
    }
    return false;
  }

  /** Convert an array of numericcharacters to an int value
   * @param values a test array of numericcharacters
   * @return the int value of the array
   */
  public static int parseInt(char[] values) {
    return parseInt(new String(values));
  }

  /** Convert a string value to an int value
   * @param value a test string
   * @return the int value of the string
   */
  public static int parseInt(String value) {
    return Integer.parseInt(value);
  }

}
