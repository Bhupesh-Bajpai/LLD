package interviewQuestions.Tic_Tac_Toe;

import interviewQuestions.Tic_Tac_Toe.Constants.PieceType;
import interviewQuestions.Tic_Tac_Toe.Model.*;

import java.util.*;

public class TicTacToe {

    Deque<Player> players;
    Board gameboard;

    public void initializeGame(){
        players = new LinkedList<>();

        PlayingPieceX playingPieceX = new PlayingPieceX();
        Player player1 = new Player("a",playingPieceX);

        PlayingPieceO playingPieceO = new PlayingPieceO();
        Player player2 = new Player("b",playingPieceO);

        players.add(player1);
        players.add(player2);

        gameboard = new Board(3);
    }

    public String StartGame(){
        boolean isWinner  = true;
        while(isWinner){
            Player playerTurn   = players.removeFirst();
            List<Pair<Integer,Integer>> freeSpaces = gameboard.getFreeCells();

            if(freeSpaces.isEmpty()){
                isWinner = false;
                continue;
            }
            System.out.print("Player:" + playerTurn.Name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean isPieceAdded = gameboard.addPiece(inputRow,inputColumn,playerTurn.playingPiece);
            if(!isPieceAdded) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("This Place Already filled, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.Name;
            }



        }


        return "Tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameboard.size;i++) {

            if(gameboard.board[row][i] == null || gameboard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameboard.size;i++) {

            if(gameboard.board[i][column] == null || gameboard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameboard.size;i++,j++) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameboard.size-1; i<gameboard.size;i++,j--) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
