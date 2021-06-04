package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && ((checkX(board, i) || checkY(board, i)))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkX(int[][] board, int x) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[x][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkY(int[][] board, int y) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] != 1) {
                rsl = false;
                break;
            }
        }
        return  rsl;
    }
}
