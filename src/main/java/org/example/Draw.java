package org.example;

public class Draw {
    public static void print(String[][] fylki) {
        System.out.println("   0 1 2 3 4 5 6 7    <- X-axis");
        System.out.println("  +- - - - - - - -+");
        for (int row = 0; row < fylki.length; row++) {
            System.out.print(row + " |");
            for (int column = 0; column < fylki.length; column++) {
                System.out.print(fylki[column][row] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("  +- - - - - - - -+");
        System.out.println("   0 1 2 3 4 5 6 7");
    }

}
