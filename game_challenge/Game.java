package game_challenge;
import java.util.*;

public class Game {
    static final Scanner sc = new Scanner(System.in);
    static final int row = 6;
    static final int col = 7;

    static int redCounter = 0;
    static int yellowCounter = 0;

    public static char[][] createBoard() {
        char[][] board = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = '.';
            }
        }

        return board;
    }

    // 1.1
    public static boolean validBoardSqaure(char input) {
        return input == 'Y' || input == 'R';
    }

    // 1.2
    public static boolean validBoard(char[][] board) {
        int redCounter = 0;
        int yellowCounter = 0;
        boolean emptySquareBelow = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == 'R') {
                    redCounter++;
                }
                if (board[i][j] == 'Y') {
                    yellowCounter++;
                }

                if (i + 1 < 6) {
                    if (board[i][j] != '.' && board[i + 1][j] == '.') {
                        emptySquareBelow = true;
                    }
                }
            }
        }

        if (redCounter == 0 || yellowCounter == 0 || emptySquareBelow) {
            return false;
        }

        return true;
    }

    // 1.3
    public static boolean validMove(int column, char[][] board) {

        if (!(column >= 0 && column < 7)) {
            return false;
        }

        for (int i = 0; i < 6; i++) {
            if (board[i][column] == '.') {
                return true;
            }
        }
        return false;
    }

    // 1.4
    public static List<Integer> validMoves(char[][] board) {
        List<Integer> moves = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == '.') {
                moves.add(j);
                }
            }
        }

        return moves;
    }

    // 1.5
    public static char whoseMove(char[][] board){

        if(!validBoard(board)) return '.';

        if(redCounter > yellowCounter) return 'Y';

        return 'R';
        
    }

    // 1.6
    public static char whoWon(char[][] board) {
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) { // check every square
                char disc = board[i][j];

                if (disc != '.') {
                    if(checkVerticalWin(board,j,disc)){
                        return disc;
                    }
                    if(checkHorizontalWin(board,i,disc)){
                        return disc;
                    }
                }

            }
        }
        return 'D';
    }

    public static boolean checkHorizontalWin(char[][] board, int row, char square) {
        
        int count = 0;
    
        for (int col = 0; col < 7; col++) {
          if (board[row][col] == square) {
            count++;
          } else if (count == 4) {
            break;
          } else {
            count = 0;
          }
        }
    
        if (count >= 4) {
          return true;
        }
        return false;
    }
    
    public static boolean checkVerticalWin(char[][] board, int col, char square) {

        int count = 0;

        for (int row = 0; row < 6; row++) {
            if (board[row][col] == square) {
                count++;
            } else if (count == 4) {
                break;
            } else {
                count = 0;
            }
        }

        if (count >= 4) {
            return true;
        }
        return false;
    }
}
