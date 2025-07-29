import java.util.Random;

// Step 4 : Main class to run the game 
public class WordGuessingGame {
    public static void main(String[] args) {
        String[] wordPool = {"inhertance","polymorphism","encapsulation","abstraction","interface"};
        String wordToGuess = wordPool[new Random().nextInt(wordPool.length)];

        AdvancedGame game = new AdvancedGame(wordToGuess);
        game.playGame();
    }  
}
