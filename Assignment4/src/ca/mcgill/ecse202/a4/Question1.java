package ca.mcgill.ecse202.a4;
import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
   
    String[][] board = getBoard(); // Create an empty board
    String[] tokens = {" X ", " O "}; // Create two players token
    int result; // Game status result

    // Repeat while the result is continue
    do {
      print(board);// Display board
      int[] cell = getCell(board, tokens[0]); // Get available cell to mark
      placeToken(board, cell, tokens[0]); // Mark available cell with player's token
      result = gameStatus(board, tokens[0]); // Determine game status

      // If status is continue make next player take turn
      if (result == 2) {
        swap(tokens);
      }

    } while (result == 2);

    print(board); // Display board

    // Display game results
    if (result == 0) {
      System.out.println(tokens[0] + "player won");
    } else {
      System.out.println("It is a draw");
    }

  }

  /** Get the game status
   * @param m the array of tokens
   * @param t the input token
   * @return the status of the game (0 win, 1 draw, or 2 continue)
   */
  public static int gameStatus(String[][] m, String t) {

    if (isWin(m, t)) {
      return 0; // Win
    } else if (isDraw(m)) {
      return 1; // Draw
    } else {
      return 2; // Continue
    } 

  }

  /** Check whether a player wins
   * @param m the array of tokens
   * @param t the input token
   * @return whether player has placed three tokens in a horizontal, vertical, or diagonal row on the grid
   */
  public static boolean isWin(String[][] m, String t) {

    // Check each winning requirements
    return (isHorizontalWin(m, t) || isVerticalWin(m, t) || isDiagonalWin(m, t));

  }

  /** Check whether each horizontal row is full
   * @param m the array of tokens
   * @param t the input token
   * @return whether the player has placed three tokens in a horizontal row
   */
  public static boolean isHorizontalWin(String[][] m, String t) {

    // Check each horizontal row
    for (int i = 0; i < m.length; i++) {
      int count = 0;
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] == t) {
          count++;
        }
      }
      if (count == 3) {
        return true;
      }
    }

    return false;

  }

  /** Check whether each vertical row is full
   * @param m the array of tokens
   * @param t the input token
   * @return whether the player has placed three tokens in a vertical row
   */
  public static boolean isVerticalWin(String[][] m, String t) {

    // Check each vertical row
    for (int i = 0; i < m.length; i++) {
      int count = 0;
      for (int j = 0; j < m[i].length; j++) {
        if (m[j][i] == t) {
          count++;
        }
      }
      if (count == 3) {
        return true;
      }
    }

    return false;

  }

  /** Check whether diagonal rows are full
   * @param m the array of tokens
   * @param t the input token
   * @return whether the player has placed three tokens in a diagonal row
   */
  public static boolean isDiagonalWin(String[][] m, String t) {

    // Check the left diagonal row
    int count = 0;
    for (int i = 0; i < m.length; i++) {
      if (m[i][i] == t) {
        count++;
      }
      if (count == 3) {
        return true;
      }
    }

    // Check the right diagonal row
    count = 0;
    for (int i = 0, j = m[i].length - 1; j >= 0; j--, i++) {
      if (m[i][j] == t) {
        count++;
      }
      if (count == 3) {
        return true;
      }
    }

    return false;

  }

  /** Check whether it is a draw 
   * @param m the array of tokens
   * @return whether all cells on the grid have been filled with tokens while neither player wins
   */
  public static boolean isDraw(String[][] m) {

    // Check whether each row and column is full and there is no winner
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] == "   ") {
          return false;
        }
      }
    }

    return true;

  }

  /** Swap the elements in the array
   * @param t the input token
   */
  public static void swap(String[] t) {

    // Swap the elements in the array
    String temp = t[0];
    t[0] = t[1];
    t[1] = temp;

  }

  /** Fill the matrix cell with the player's token
   * @param m the array of tokens
   * @param cell the array of cell position of the input token 
   * @param t the input token
   */
  public static void placeToken(String[][] m, int[] cell, String t) {

    // Fill the matrix cell with player's token
    m[cell[0]][cell[1]] = t;

  }

  /** Get a valid cell input by user
   * @param m the array of tokens
   * @param t the input token
   * @return a valid cell position input by user
   */
  public static int[] getCell(String[][] m, String t) {

    Scanner input = new Scanner(System.in); // Create a Scanner
    int[] cell = new int[2]; // Cell row and column

    // Prompt player to enter a token
    do {
      System.out.print("Enter a row for player " + t + ": ");
      cell[0] = input.nextInt();
      System.out.print("Enter a column for player " + t + ": ");
      cell[1] = input.nextInt();
    } while (!isValidCell(m, cell));

    return cell;

  }

  /** Check whether the position is valid
   * @param m the array of tokens
   * @param cell the array of cell position of the input token
   * @return whether the cell is available and is in the 3 x 3 array
   */
  public static boolean isValidCell(String[][] m, int[] cell) {

    // Check whether the position is valid
    for (int i = 0; i < cell.length; i++) {
      if (cell[i] < 0 || cell[i] >= 3) {
        System.out.println("Invalid cell");
        return false;
      }
    }

    // Check whether there is a token on current position
    if (m[cell[0]][cell[1]] != "   ") {
      System.out.println("\nRow " + cell[0] + " column " + cell[1] + " is filled, try another one");
      return false;
    }

    return true;

  }

  /** Get a 3 x 3 array filled with blank spaces
   * @return a 3 x 3 array filled with blank spaces
   */
  public static String[][] getBoard() {

    // Create a 3 x 3 array filled with blank spaces
    String[][] m = new String[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        m[i][j] = "   ";
      }
    }

    return m;

  }

  /** Display the board
   * @param m the array of tokens
   */
  public static void print(String[][] m) {

    // Print the board
    System.out.println("\n-------------");
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print("|" + m[i][j]);
      }
      System.out.println("|\n-------------");
    }

  }

}
