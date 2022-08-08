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

        char vertical = checkVerticalWin(board);

        if (vertical != '.')
            return vertical;

        char horizontal = checkHorizontalWin(board);

        if (horizontal != '.')
            return horizontal;

        return '.';
    }

    public static char checkHorizontalWin(char[][] board) {
        int redCount = 0;
        int yellowCount = 0;

        for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[0].length; j++) {
            if (board[i][j] == 'R') {
              redCount++;
              yellowCount = 0;
              if (redCount >= 4) {
                return 'R';
              }
            } else if (board[i][j] == 'Y') {
              yellowCount++;
              redCount = 0;
              if (yellowCount >= 4) {
                return 'Y';
              }
            }
          }
          redCount = 0;
          yellowCount = 0;
        }
        return '.';
    }

    public static char checkVerticalWin(char[][] board) {
        int redCount = 0;
        int yellowCount = 0;

        for (int i = 0; i < board[0].length; i++) {
          for (int j = 0; j < board.length; j++) {
            if (board[j][i] == 'R') {
              redCount++;
              yellowCount = 0;
              if (redCount >= 4) {
                return 'R';
              }
            } else if (board[j][i] == 'Y') {
              yellowCount++;
              redCount = 0;
              if (yellowCount >= 4) {
                return 'Y';
              }
            }
          }
          redCount = 0;
          yellowCount = 0;
    
        }
        return '.';
    }
}
