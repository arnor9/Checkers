package org.example;

import java.util.Scanner;

public class Game {
    public static void who(String whoesmove) {
        if (whoesmove.equals("1")) {
            System.out.println("Turn of player no. 1");
            boolean moved = false;
            while(!moved){
                Scanner s = new Scanner(System.in);
                System.out.println("Coordinate of piece to move");
                System.out.print("X: ");
                int moveFromX = s.nextInt();
                System.out.print("Y: ");
                int moveFromY = s.nextInt();
                System.out.println("Coordinate of new position");
                System.out.print("X: ");
                int moveToX = s.nextInt();
                System.out.print("Y: ");
                int moveToY = s.nextInt();
                Checker.board[moveFromX][moveFromY] = " ";
                Checker.board[moveToX][moveToY] = whoesmove;
                System.out.println("Piece moved!");
                moved = true;
                whoesmove = "2";
            }
        }else {
            System.out.println("Turn of player no. 2");
            boolean moved = false;
            while(!moved){
                Scanner s = new Scanner(System.in);
                System.out.println("Coordinate of piece to move");
                System.out.print("X: ");
                int moveFromX = s.nextInt();
                System.out.print("Y: ");
                int moveFromY = s.nextInt();
                System.out.println("Coordinate of new position");
                System.out.print("X: ");
                int moveToX = s.nextInt();
                System.out.print("Y: ");
                int moveToY = s.nextInt();
                Checker.board[moveFromX][moveFromY] = " ";
                Checker.board[moveToX][moveToY] = whoesmove;
                System.out.println("Piece moved!");
                moved = true;
                whoesmove = "1";
            }
        }

    }



    /*public static void updateArray(int moveFromX, int moveFromY){

    }*/
}
