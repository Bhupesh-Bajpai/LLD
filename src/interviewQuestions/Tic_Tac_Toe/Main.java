package interviewQuestions.Tic_Tac_Toe;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.initializeGame();
        System.out.println("game winner is: " + game.StartGame());

    }
}
