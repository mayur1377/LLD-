package TICTACTOE;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import TICTACTOE.Model.Board;
import TICTACTOE.Model.Player;
import TICTACTOE.Model.PlayingPieceO;
import TICTACTOE.Model.PlayingPieceX;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        //make 2 players here
        PlayingPieceX pieceX = new PlayingPieceX();
        PlayingPieceO pieceO = new PlayingPieceO();
        Player player1 = new Player("Player 1", pieceX);
        Player player2 = new Player("Player 2", pieceO);

        players = new LinkedList<>();

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String StartGame()
    {
        boolean gameWon = false;
        while(gameWon == false)
        {
            Player currentPlayer = players.removeFirst();

            gameBoard.printBoard();
            System.out.println(currentPlayer.name + "'s turn");
            
            if(gameBoard.checkFree()==false)
            {
                return "Draw";
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter x coordinate");
            int x = scanner.nextInt();
            System.out.println("Enter y coordinate");
            int y = scanner.nextInt();

            boolean pieceAdded = gameBoard.addPiece(x, y, currentPlayer.pieceType);
            
            if(pieceAdded == false)
            {
                System.out.println("Invalid move, try again");
            }
            else{
                gameWon = gameBoard.checkWin(currentPlayer.pieceType);
                if(gameWon == true)
                {
                    gameBoard.printBoard();
                    return currentPlayer.name + " wins!";
                }
            }
            players.addLast(currentPlayer);
        }
        return "Draw";

    }
}
