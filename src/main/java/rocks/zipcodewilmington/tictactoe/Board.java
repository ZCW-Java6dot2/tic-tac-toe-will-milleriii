package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return ((board[0][0].equals('X') && board[1][0].equals('X') && board[2][0].equals('X'))|| //top row
                (board[0][1].equals('X') && board[1][1].equals('X') && board[2][1].equals('X'))|| // middle row
                (board[0][2].equals('X') && board[1][2].equals('X') && board[2][2].equals('X'))|| //bottom row
                (board[0][0].equals('X') && board[0][1].equals('X') && board[0][2].equals('X'))|| //left column
                (board[1][0].equals('X') && board[1][1].equals('X') && board[1][2].equals('X'))|| //middle column
                (board[2][0].equals('X') && board[2][1].equals('X') && board[2][2].equals('X'))|| //right column
                (board[0][2].equals('X') && board[1][1].equals('X') && board[2][0].equals('X'))|| //diag bot left->top right
                (board[0][0].equals('X') && board[1][1].equals('X') && board[2][2].equals('X'))); //diag bot right ->top left
    }

    public Boolean isInFavorOfO() {
        return ((board[0][0].equals('O') && board[1][0].equals('O') && board[2][0].equals('O'))|| //top row
                (board[0][1].equals('O') && board[1][1].equals('O') && board[2][1].equals('O'))|| // middle row
                (board[0][2].equals('O') && board[1][2].equals('O') && board[2][2].equals('O'))|| //bottom row
                (board[0][0].equals('O') && board[0][1].equals('O') && board[0][2].equals('O'))|| //left column
                (board[1][0].equals('O') && board[1][1].equals('O') && board[1][2].equals('O'))|| //middle column
                (board[2][0].equals('O') && board[2][1].equals('O') && board[2][2].equals('O'))|| //right column
                (board[0][2].equals('O') && board[1][1].equals('O') && board[2][0].equals('O'))|| //diag bot left->top right
                (board[0][0].equals('O') && board[1][1].equals('O') && board[2][2].equals('O'))); //diag bot right->top left
    }

    public Boolean isTie() {
        return this.isInFavorOfX() == this.isInFavorOfO();
    }

    public String getWinner() {
        if (this.isInFavorOfX()) {
            return "X";
        } else if (this.isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }

}
