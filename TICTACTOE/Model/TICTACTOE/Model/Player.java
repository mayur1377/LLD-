package TICTACTOE.Model;

public class Player {
    public String name;
    public PlayingPiece pieceType;

    public Player(String name, PlayingPiece pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPieceType() {
        return pieceType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPieceType(PlayingPiece pieceType) {
        this.pieceType = pieceType;
    }
}