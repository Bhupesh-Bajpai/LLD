package interviewQuestions.Tic_Tac_Toe.Model;

import interviewQuestions.Tic_Tac_Toe.Constants.PieceType;

public class Player {

    public String Name;

    public Player(String name, PlayingPiece playingPiece) {
        Name = name;
        this.playingPiece = playingPiece;
    }

    public PlayingPiece playingPiece;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
