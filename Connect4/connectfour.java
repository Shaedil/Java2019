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
        for (int i = 0; i < 7; i++) {
            System.out.print("| ");
            for (int j = 0; j < 6; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
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
    public boolean checkWin() {
        for (int i = 0; i < 7; i++){
            for (int j=0; j<6; j++) {
                if ((board[i][j] != ' ')
                && (board[i][j+1])        )
            }
        }
    
    }
    public void changePlayer() {
        if (currentPlayerMark == '⭕') {
            currentPlayerMark = '⬤';
        }
        else {
            currentPlayerMark = '⭕';
        }
    }
    public boolean placeMark(int row) {
        if ((row >= 0) && (row < 7)) {
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayerMark;
                return true;
            }
        }
    public static void main(String[] args) {
       // tictactoe game = new tictactoe();
       // Scanner read = new Scanner(System.in);
       // game.printBoard();
       // System.out.println("The turn is now: ");
       // while (game.isBoardFull() == false) {
       //     System.out.println("enter in the x value");
       //     int y = read.nextInt();
       //     System.out.println("enter in the y value");
       //     int x = read.nextInt();
       //     game.placeMark(x,y);
       //     game.printBoard();
       //     if (game.checkWin()) {
       //         System.out.println("We have a winner! Congrats!");
       //         System.exit(0);
       //     }
       //     game.changePlayer();
       // }
       // System.out.println("Appears we have a draw!");
       // System.exit(0);
    }
}
