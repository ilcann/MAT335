import java.util.Scanner;

public class TicTacToe {
    private Cell[][] board;
    private Cell currentPlayer;

    public TicTacToe() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
        currentPlayer = Cell.X;
    }
    
    public void printBoard() {
        System.out.println("------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5s", (board[i][j]).getSymbol() + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
    public void setCell(int row, int col, Cell cell) {
        board[row][col] = cell;
    }
    public boolean isEmpty(int row, int col) {
        if (board[row][col] == Cell.EMPTY)
            return true;
        return false;
    }
    private boolean isGameWon() {
        for (int i = 0; i < 3; i++) {
            // check vertical & horizontal
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true; 
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true; 
            }
            // check diagonal
            }
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true; 
            }
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true; 
            }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    return false; 
                }
            }
        }
        return true; 
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isEmpty(row, col)) {
                board[row][col] = currentPlayer;
                if (isGameWon()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                currentPlayer = (currentPlayer == Cell.X) ? Cell.O : Cell.X;
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
        scanner.close();
    }
}
