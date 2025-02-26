package csc223.mb;


import java.util.Scanner;
public class TicTacToe implements Game {
    char[][] board;
    char currPlayer;
    static final char EMPTY = ' ';
    static final int SIZE = 3;



    public TicTacToe(){
        this.board = new char[3][3];
        this.currPlayer = 'X';
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                
                this.board[i][j]= ' ';
            }
        }

    }
    @Override
    public void startGame(){
        System.out.println("Welcome to TicTacToe");
        printBoard();
    }
    
    
    @Override
    public void printBoard(){
        System.out.println("-----------");
        for(int i = 0; i< SIZE; i++){
            for(int j= 0; j< SIZE; j++){
                
                if(j<=1){
                    System.out.print("|_"+this.board[i][j] +"");
                }
                else{
                    System.out.print("|_"+this.board[i][j] +"|");

                }
            }
            
            System.out.println();
        }
        
    }
    
    
    @Override
    public void takeTurn(){
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while(true){
            System.out.println("Player "+this.currPlayer+"'s turn");
            System.out.print("Enter row (0-2): ");
            row = scanner.nextInt();
            System.out.print("Enter a column (0-2): ");
            col = scanner.nextInt();

           if (row >= 0 && row < SIZE && col >= 0 && row <SIZE && this.board[row][col] == EMPTY){
            break;
           } 
           System.out.println("Invalid row and column");
        }
        
        this.board[row][col] =this.currPlayer;
        this.currPlayer = (this.currPlayer == 'X') ? 'O' : 'X';
        printBoard();
       
        
    }
    
    @Override
    public boolean isGameOver(){
        for(int i = 0; i < SIZE; i++){
            if(this.board[i][0] != EMPTY && this.board[i][0] == this.board[i][1]&& this.board[i][1]== this.board[i][2]){
                return true;
            }
            if(this.board[0][i] != EMPTY && this.board[0][i] == this.board[1][i]&& this.board[1][i]== this.board[2][i]){
                return true;
            }
        }
        if (this.board[0][0] != EMPTY && this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) {
            return true; 
        }
        if (this.board[0][2] != EMPTY && this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0]) {
            return true; 
        }

       
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (this.board[i][j] == EMPTY) {
                    return false;
                }
            }
        }

        return true; 
    
    }

    @Override
    public void endGame(){
        if (isGameOver()) {
            if (this.currPlayer == 'X') {
                System.out.println("Player O wins!");
            } else if (this.currPlayer == 'O') {
                System.out.println("Player X wins!");
            } else {
                System.out.println("It's a draw!");
            }
        }
    }


    
    
    
    @Override
    public void playGame(){
        startGame();
        while(!isGameOver()){
            takeTurn();
        }
        endGame();
    }
    public static void main(String[] args){
        Game ticTacToe = new TicTacToe();
        ticTacToe.playGame();
    } 
}



