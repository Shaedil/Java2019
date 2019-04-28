import java.util.Scanner;

public class tictactoe {
    // Creates a 2d array 'coordinate like board'
    private static char[][] board;
    private static char currentPlayerMark;
    private static int row;
    private static int col;
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
    public static char changePlayer() {
        if (currentPlayerMark == 'X') {
            currentPlayerMark = 'O';
            return 'X';
        }
        else {
            currentPlayerMark = 'X';
            return 'O';
        }
    }
    // Force player to make a move
    public static boolean placeMark(int rows, int cols) {
        if ((row >= 0) && (col < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == ' ') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isBoardFull() {
        boolean isFull = true;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }
    public static boolean checkForWin() {
        return (checkRows() || checkCols() || checkDiags());
    }
    // Check wins
    public static boolean checkRows() {
        for(int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkCols() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;    
            }
        }
        return false;
    }
    public static boolean checkDiags() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }
    public static boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != ' ') && (c1 == c2) && (c2 == c3));    
    }
    public static void printInfo() {
        System.out.println("+==================+TicTacToe+==================+");
        System.out.println("     The board is ordered like a coordinate" + "\n");
        System.out.println("               system. See this:           " + "\n");
        System.out.println("                 |0,0|1,0|2,0|             " + "\n");
        System.out.println("                 |0,1|1,1|2,1|             " + "\n");
        System.out.println("                 |0,2|1,2|2,2|             " + "\n");
        System.out.println("          +_________________________+" + "\n");
    }
    public static void runner() {
        Scanner reader = new Scanner(System.in);
        while (checkForWin() == false) {
            if (changePlayer() == 'X') {
                System.out.println("Type in the X coordinate: ");
                int x = reader.nextInt();
                System.out.println("Type in the Y coordinate: ");
                int y = reader.nextInt();
                placeMark(x,y);
                printBoard();
            }
            else {
                System.out.println("Type in the X coordinate: ");
                int x = reader.nextInt();
                System.out.println("Type in the Y coordinate: ");
                int y = reader.nextInt();
                placeMark(x,y);
                printBoard();
            }
        }
    }
    public static void main(String[] args) {
        printInfo();
        TicTacToe();
        printBoard();
        runner();        
    }
}
