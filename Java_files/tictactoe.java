// A program that prints an ascii tictactoe board and allows you to play with another person. AI not supported.
// TODO: Figure out a way to 

public class tictactoe {
    // Creates a 2d array 'coordinate like board'
    private static char[][] board; 
    private static char currentPlayerMark;

    public static void TicTacToe() {
        // Defines the board to be 3x3 in size
        board = new char[3][3];
        // Set the current player to X by default
        currentPlayerMark = 'X';
        resetBoard();
    }
    // Empty the boxes and set the boxes to ' '
    public static void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    // Prints an ascii board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    // Switch player turns
    public static void playerTurn() {
        if (currentPlayerMark == 'X') {
            currentPlayerMark = 'O';    
        }
        else {
            currentPlayerMark = 'X';
        }
    }
    // Force player to make a move
    public static void playerMove() {
            
    }
    public static void main(String[] args) {
         TicTacToe();
         printBoard();
        
    }
}
