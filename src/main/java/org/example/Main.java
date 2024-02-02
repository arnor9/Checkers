package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int s = 8;
    static String[][] board = new String[s][s];
    static int counter = 0;
    Draw d = new Draw();
    Game g = new Game();
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

    public static void main(String[] args) {
        startboard();
        Game.who(counter, whoesmove);
        counter++;



    }
}