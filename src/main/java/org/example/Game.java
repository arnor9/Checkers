package org.example;

import java.util.Scanner;

public class Game {
    public static void who(int counter, String whosmmove) {
        Scanner s = new Scanner(System.in);
        counter++;
        if (whosmmove.equals("1")) {
            System.out.println("Turn of player no. 1");
            System.out.println("Coordinate of piece to move");
            String userX = s.nextLine();
            System.out.println(userX);
            /*System.out.println("Coordinate of piece to move");
            Scanner x11scanner = new Scanner(System.in);
            Scanner y11scanner = new Scanner(System.in);
            System.out.println("Coordinate of new position");
            Scanner x12scanner = new Scanner(System.in);
            Scanner y12scanner = new Scanner(System.in);*/
        } else {
            System.out.println("Turn of player no. 2");
            System.out.println("Coordinate of piece to move");
            String userX = s.nextLine();
            System.out.println(userX);
            /*System.out.println("Coordinate of piece to move");
            Scanner x21scanner = new Scanner(System.in);
            Scanner y21scanner = new Scanner(System.in);
            System.out.println("Coordinate of new position");
            Scanner x22scanner = new Scanner(System.in);
            Scanner y22scanner = new Scanner(System.in);*/
        }
        if(whosmmove.equals("1")) {
            whosmmove = "2";
        }else {
            whosmmove = "1";
        }


    }
}
