package game_challenge;

public class Main {
    public static void main(String[] args) {

        char[][] board = Game.createBoard();

        // vertical
        board[0][2] = 'R';
        board[1][2] = 'R';
        board[2][2] = 'R';
        board[3][2] = 'R';
        board[4][2] = 'Y';
        board[5][2] = 'R';

        // horizontal
        board[1][0] = '.';
        board[1][1] = 'R';
        // board[1][2] = 'Y';
        board[1][3] = 'Y';
        board[1][4] = 'R';
        board[1][5] = 'Y';
        board[1][6] = 'Y';

        System.out.print(Game.whoWon(board));
    
        

        // System.out.print(Game.validBoard(board));
        // System.out.print(Game.validMove(6, board));

        // System.out.print(Connect4.whoseMove(board));


    }
}
