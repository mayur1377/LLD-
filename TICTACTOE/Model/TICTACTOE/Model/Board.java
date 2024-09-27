package TICTACTOE.Model;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece piece) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            return false;
        }
        if (board[x][y] == null) {
            board[x][y] = piece;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j].pieceType);
                }
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("-");
                    if (j < size - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }

    public boolean checkFree() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkWin(PlayingPiece pieceType) {
        int boardSize = board.length;
        for (int i = 0; i < boardSize; i++) {
            boolean rowWin = true;
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] != pieceType) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) {
                return true;
            }
        }
        for (int i = 0; i < boardSize; i++) {
            boolean colWin = true;
            for (int j = 0; j < boardSize; j++) {
                if (board[j][i] != pieceType) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) {
                return true;
            }
        }
        boolean mainDiagonalWin = true;
        for (int i = 0; i < boardSize; i++) {
            if (board[i][i] != pieceType) {
                mainDiagonalWin = false;
                break;
            }
        }
        if (mainDiagonalWin) {
            return true;
        }
        boolean antiDiagonalWin = true;
        for (int i = 0; i < boardSize; i++) {
            if (board[i][boardSize - 1 - i] != pieceType) {
                antiDiagonalWin = false;
                break;
            }
        }
        if (antiDiagonalWin) {
            return true;
        }
    
        return false;
    }
}
