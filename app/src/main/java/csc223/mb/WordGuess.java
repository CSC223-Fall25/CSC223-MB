package csc223.mb;
import java.util.Scanner;

public class WordGuess implements Game {
    String GuessWord;
    char[] GuessedWord;
    int GuessesLeft;
    static final int MAX_TURNS = 6;

    public WordGuess( String GuessWord){
        this.GuessWord = GuessWord;
        this.GuessedWord = new char[this.GuessWord.length()];
        

    }

    @Override
    public void startGame(){
        for (int i = 0; i< this.GuessWord.length(); i++ ){
            this.GuessedWord[i] = '_';

        }
        this.GuessesLeft = MAX_TURNS;

        System.out.println("Welcome to Word Guess!!");
        System.out.println("You have" + MAX_TURNS + " to guess the word");

    }

    @Override
    public void printBoard(){
        for(char c : this.GuessedWord){
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("You have" + this.GuessesLeft + "remaining");

    }

    @Override
    public void takeTurn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a letter or whole word: ");
        char guess = scanner.next().charAt(0);

        boolean guessedRight = false;
        for(int i = 0; i< this.GuessWord.length(); i++){
            if(this.GuessWord.charAt(i) == guess && this.GuessedWord[i] == '_' ){
                this.GuessedWord[i] = guess;
                guessedRight = true;
            }
        }
        if(!guessedRight){
            System.out.println(""+guess+ " is not in the word");
            this.GuessesLeft --;

        }
        printBoard();




    }
    
    @Override
    public boolean isGameOver(){
        if(this.GuessesLeft <= 0){
            
            return true;
        }
        for (char c : this.GuessedWord){
            if (c == '_')
            {
                return false;
            }

        }
        
        return true;
    }

    
    public void endGame(){
        if (this.GuessesLeft > 0){
            System.out.println("Congrats your guess was correct the word was" +this.GuessWord+"");
        }
        else{
            System.out.println("Sorry your guesses were wrong the word was" +this.GuessWord+"");
        }
    }

    @Override
    public void playGame(){
        char stayLeave = 'y';

        while(stayLeave == 'y'){
            
            Scanner scanner = new Scanner (System.in);
            System.out.println("Do you Wanna Play(y/n):");
            stayLeave = scanner.next().charAt(0);
            if( stayLeave == 'n')
            {
                break;
            }

            startGame();
            while( ! isGameOver()){
                takeTurn();
            }
            endGame();
        }
    }

       
    public static void main(String[] args){
        String word = "pride";
        Game wordGame = new WordGuess(word);
        wordGame.playGame();
    } 
    
}
