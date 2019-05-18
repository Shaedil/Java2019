import java.util.Scanner;

public class connectfour {
    
    private char[][] board;
    private char currentPlayerMark;
    
    public connectfour() {
        // define the object
        board = new char[7][6];
        currentPlayerMark = '⭕'
        initializeBoard();
    }
    public void initializeBoard() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public void printBoard() {
        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
        for (int i = 0; i < 7; i++) {
            System.out.print("| ");
            for (int j = 0; j <3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
        }
    }
    public boolean isBoardFull(){
        boolean isFull = true;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (board[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }
    
    public static void main(String[] args) {

    }
}
