/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandy
 */
public class Board {
    private static String[][] board;
    public static void initBoard(int n){
        board = new String[n][n];
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = String.valueOf(idx);
                idx++;
            }
        }
    }
    public static void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public static void setValue(int idx, String val){
        int row = idx/board.length;
        int col = idx%board.length;
        board[row][col] = val;
    }
    public static boolean checkWinX(){
        
    }
}
