package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Checker {
    static int s = 8;
    static String[][] board = new String[s][s];
    Draw d = new Draw();
    Game g = new Game();
    static int one = 12;
    static int two = 12;
    static String whoesmove = "1";

    public static void startboard(){

        for(int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                board[i][j] = " ";
            }
        }
        for(int i = 0; i < s; i += 2){
            board[i][1] = "1";
            board[i][5] = "2";
            board[i][7] = "2";
        }
        for (int i = 1; i < s; i += 2){
            board[i][0] = "1";
            board[i][2] = "1";
            board[i][6] = "2";
        }
        Draw.print(board);
    }
    public static boolean gameOver() {
        return (one == 0 || two == 0);
    }

    public static String Winner(){
        if (one == 0){
            return "The winner is player number 1!";
        }else {
            return "The winner is player number 2!";
        }

    }

    public static void main(String[] args) {
        startboard();
        while(!gameOver()){
            Game.who(whoesmove);
            Draw.print(board);
        }
        System.out.println(Winner());



    }
}