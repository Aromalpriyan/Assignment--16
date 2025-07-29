# 16 Inheritance
## Let's Practice: Word Guessing Game
## Objective
### <p>Create a **Word Guessing Game** in Java that follows Object-Oriented Programming (OOP) principles, specifically focusing on inheritance and method overriding.<p>
## Key Features
### <p>1. **Randomly selects a word** from a predefined pool.<p>
### <p>2. Provides **hints** by revealing letters one by one **after incorrect attempts**.<p>
### <p>3. **Tracks attempts** and the revealed letters.<p>
### <p>4. Uses **inheritance** (single-level and multilevel) to organize the code.<p>
### <P>5. Implements **method overriding** for different hinting strategies.<p>
### <p>6. Handles **user input** with Scanner.<P>
### <p>7. Utilizes **random number generation** (Random) to choose words and reveal hints.<p>
## Step-by-Step Instructions
### <p>1️⃣ **Create a Base Class (Game)**<p>
### <p>This class holds the core game logic:<p>
#### <p>• The word to be guessed<p>
#### <p>• Number of attempts<p>
#### <p>• Handling letter reveal functionality<p>
### <p>2️⃣ **Extend Game into InputGame (Single-Level Inheritance)**<p>
#### <p>• Adds **user input handling**.<p>
#### <p>• **Overrides** the playGame() method to allow players to enter guesses.<p>
### <p>3️⃣ **Extend InputGame into AdvancedGame (Multilevel Inheritance)**<p>
#### <p>• Improves hints by **revealing random letters** after incorrect attempts.<p>
#### <p>• **Overrides** displayHint() for more advanced hint functionality.<p>
## Suggested Class Structure
### 1. Game (Base Class)
### 2. │
### 3. ├──> InputGame (Extends Game, adds user input handling)
### 4. │
### 5. └──> AdvancedGame (Extends InputGame, adds advanced hints)
## Output
```
// Step 1 : Base class - handles core game logic
public class Game {
    protected String wordToGuess;
    protected int attempts;
    protected char[] revealesLetters;

public Game(String wordToGuess){
    this.wordToGuess = wordToGuess;
    this.attempts = 0;
    this.revealesLetters = new char [wordToGuess.length()];
    for(int i = 0; i < revealesLetters.length; i++){
        revealesLetters[i] = '-';
    }
}
public void playGame(){
    System.out.println("Welcome to the Word Guessing Game!");
    System.out.println("Try to guess the word!");
}   

public void displayHint(){
    System.out.println("Hint: The word has " + wordToGuess.length() + " letters.");

}

public String getRevealedWord(){
    return new String(revealesLetters);
}
}

import java.util.Scanner;

// Step 2 : Single-level inheritance - Adds user input handling
public class InputGame extends Game {
    protected Scanner sc;

    public InputGame(String wordToGuess){
        super(wordToGuess);
        this.sc = new Scanner(System.in);
    
    } 
    
@Override
public void playGame(){
    super.playGame();
    String userGuess = "";
    while (!userGuess.equalsIgnoreCase(wordToGuess)){
        displayHint();
        System.out.println("Enter your guess: ");
        userGuess = sc.nextLine();
        attempts++;

        if (userGuess.equalsIgnoreCase(wordToGuess)) {
            System.out.println("Congratulations! You've guessed the word in " + attempts + " attempts."); 
        }else{
            System.out.println("Incorrect guess.Try again!");
            System.out.println("Revealed so far: " + getRevealedWord());
        }
    }
  }
}

import java.util.Random;

// Step 3: Multilevel inheritance - Enhances hints by revealing letters
public class AdvancedGame extends InputGame {
    private Random random;

    public AdvancedGame (String wordToGuess){
        super(wordToGuess);
        this.random = new Random();
    }
@Override
    public void displayHint(){
        super.displayHint();
        if (attempts > 0){
            revealRandomLetter();
            System.out.println("Revealed so far: " + getRevealedWord());
        }
    }
    private void revealRandomLetter() {
        int index;
        do {
            index = random.nextInt(wordToGuess.length());
        }while (revealesLetters[index] != '-');
        revealesLetters[index] = wordToGuess.charAt(index);

    }   
}

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
```
[githublink](https://github.com/Aromalpriyan/Assignment--16)
