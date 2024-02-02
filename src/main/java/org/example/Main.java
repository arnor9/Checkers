package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int s = 8;
    static String[][] board = new String[s][s];
    Draw d = new Draw();

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
        int counter = 0;
        while (board.length > 7 /*þetta er bara eh bull*/){
            counter++;
            if(counter % 2 == 0) {
                System.out.println("Turn of player no. 1");
                System.out.println("Coordinate of piece to move");
            }else {
                System.out.println("Turn of player no. 2");
                System.out.println("Coordinate of piece to move");
            }
            Scanner scanner = new Scanner(System.in);


        }


    }
}