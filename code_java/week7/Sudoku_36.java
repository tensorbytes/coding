package week7;

public class Sudoku_36 {

    static class Solution {
        public boolean isValidSudoku(char[][] board) {

            if (board == null) {
                return false;
            }

            int rows = board.length;
            int cols = board[0].length;

            int[] rowBits = new int[rows];
            int[] colBits = new int[cols];
            int[][] blockBits = new int[rows/3][cols/3];

            char tmp;
            int num;
            int pos;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    tmp = board[i][j];
                    if (tmp != '.') {
                        //Integer.p
                        num = Integer.parseInt(Character.toString(tmp));
                        pos = 1<<num;
                        if((rowBits[i]>>num & 1) == 0 && (colBits[j]>>num & 1) == 0 && (blockBits[i/3][j/3]>>num & 1) == 0 ){
                            rowBits[i] = rowBits[i] ^ pos;
                            colBits[j] = colBits[j] ^ pos;
                            blockBits[i/3][j/3] = blockBits[i/3][j/3] ^ pos;
                        }else{
                            return false;
                        }
                    }
                }

            }
            return true;
        }
    }


    public static void main(String[] args) {
        char x = '7';
        System.out.println();

        System.out.println(x << 1);
    }

}
