package org.example;

import java.util.Scanner;

public class Game {
    public static void move(String whoesmove) {
        boolean moved = false;
        Scanner s = new Scanner(System.in);
        while(!moved){
            if (whoesmove.equals("1")) {
                System.out.println("Turn of player no. 1");
            }else {
                System.out.println("Turn of player no. 2");
            }

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

            updateArray(moveFromX,moveFromY,moveToX,moveToY,whoesmove);

            if(validMove(moveFromX, moveFromY,moveToX,moveToY)){
                moved = true;
            }else {
                System.out.println("Not a valid move, try again");
            }

        }
    }
    public static void updateArray(int moveFromX, int moveFromY, int moveToX, int moveToY, String whoesmove){
        Checker.board[moveFromX][moveFromY] = " ";
        Checker.board[moveToX][moveToY] = whoesmove;
        System.out.println("Piece moved!");
    }

    public static String who(String whoesmove){
        return whoesmove.equals("1") ? "2" : "1";
    }

    public static boolean validMove(int moveFromX, int moveFromY, int moveToX, int moveToY){
        return true;
    }
}





