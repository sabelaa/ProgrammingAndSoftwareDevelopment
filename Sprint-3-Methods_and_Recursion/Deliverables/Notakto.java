/**
 * NOTAKTO
 *
 * Notakto is like tic-tac-toe but uses only X's. The first player who completes a line of X's is the LOSER.
 *
 * @author CMS 121
 *
 */

import java.util.Scanner;

public class Notakto {

	/**
	 * Print the board
	 * 
	 * @param  board  the 3x3 Notakto board
	 */
	public static void print(boolean[][] board) {

	}

	/**
	 * Read a move
	 *
	 * @param  s  the input Scanner
	 *
	 * @return an integer representing the user's choice
	 */
	public static int readMove(Scanner s) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nPick an open number");
		int playerChoice = scan.nextInt();

		return playerChoice;

	}
	
	/**
	 * Check for three X's in any row
	 * 
	 * @param  board  the 3x3 boolean game board
	 * 
	 * @return true if the board contains three X's in any row, false otherwise
	 */
	public static boolean checkRows(boolean[][] board) {
		
		
	}
	
	//*** Add more methods to check columns and diagonals ***//	
	
	/**
	 * Main -- run the main game loop
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 3x3 grid of booleans
		boolean[][] board = new boolean[3][3];
		
		// Create one Scanner to use for all input
		Scanner input = new Scanner(System.in);

		// Use a variable to keep track of the current player
		int player = 1;
		
		// Main game loop
		boolean playing = true;
		
		while (playing) {
			
			// Print the game board
			print(board);
			
			// Use the readMove method to get the current player's move
			
			
			// Update the board
			
			
			// Check for three X's in any row, column, or diagonal
			boolean rowTest = checkRows(board);
			
			
			// If any test returns true, the current player just
			// made a losing move -- print a message and end the game loop
			
		}	
		
		// Close the input Scanner at the end of the program
		input.close();
	}
	
}
