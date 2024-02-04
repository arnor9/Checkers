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


            if(validMove(moveFromX, moveFromY,moveToX,moveToY, whoesmove)){
                updateArray(moveFromX,moveFromY,moveToX,moveToY,whoesmove);
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

    public static boolean validMove(int moveFromX, int moveFromY, int moveToX, int moveToY, String whosemove){
        if (moveFromX < 0 || moveFromX > 7 || moveFromY < 0 || moveFromY > 7 ||
                moveToX < 0 || moveToX > 7 || moveToY < 0 || moveToY > 7)
            return false;

        else if (Checker.board[moveFromX][moveFromY].equals(whosemove) && Checker.board[moveToX][moveToY].equals(" ")) {

            if (Math.abs(moveFromX-moveToX)==1) {
                if ((whosemove.equals("1")) && (moveToY - moveFromY == 1))
                    return true;
                else if ((whosemove.equals("2")) && (moveToY - moveFromY == -1))
                    return true;
            }

            // Checks case of a jump
            else if (Math.abs(moveFromX-moveToX)==2) {
                if (whosemove.equals("1") && (moveToY - moveFromY == 2) &&
                        Checker.board[(moveFromX+moveToX)/2][(moveFromY+moveToY)/2].equals("1"))
                    return true;
                else if (whosemove.equals("2") && (moveToY - moveFromY == -2) &&
                        Checker.board[(moveFromX+moveToX)/2][(moveFromY+moveToY)/2].equals("2"))
                    return true;
            }
        }
        return false;
    }
}






