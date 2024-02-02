package org.example;

public class Board {
    private final static int size = 8;
    public static char[][] board;
    int one;
    int two;
    char whomoves;

    public Board(){
        one = 12;
        two = 12;
        board = new char[size][size];
        whomoves = '1';


        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
        for(int i = 0; i < size; i += 2){
            board[i][1] = '1';
            board[i][5] = '2';
            board[i][7] = '2';
        }
        for (int i = 1; i < size; i += 2){
            board[i][0] = '1';
            board[i][2] = '1';
            board[i][6] = '2';
        }
    }
    public static void print() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                System.out.print(board[column][row]);
            }
            System.out.println();
        }
    }
}
