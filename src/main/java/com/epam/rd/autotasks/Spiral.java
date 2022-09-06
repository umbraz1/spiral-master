package com.epam.rd.autotasks;



class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int s = 1;
        int c = 1;
        int d = 1;

            for (int y = 0; y < columns; y++) {
                if(result[0][y] == 0) {
                    result[0][y] = s;
                    s++;
                }
            }
            for (int x = 1; x < rows; x++) {
                if (result[x][columns - 1] == 0) {
                    result[x][columns - 1] = s;
                    s++;
                }
            }
            for (int y = columns - 2; y >= 0; y--) {
                if (result[rows - 1][y] == 0) {
                    result[rows - 1][y] = s;
                    s++;
                }
            }
            for (int x = rows - 2; x > 0; x--) {
                result[x][0] = s;
                s++;
            }
            while (s < rows * columns) {


                while (result[c][d + 1] == 0) {
                    result[c][d] = s;
                    s++;
                    d++;
                }


                while (result[c + 1][d] == 0) {
                    result[c][d] = s;
                    s++;
                    c++;
                }


                while (result[c][d - 1] == 0) {
                    result[c][d] = s;
                    s++;
                    d--;
                }


                while (result[c - 1][d] == 0) {
                    result[c][d] = s;
                    s++;
                    c--;
                }
            }


            for (int x = 0; x < rows; x++) {
                for (int y = 0; y < columns; y++) {
                    if (result[x][y] == 0) {
                        result[x][y] = s;
                    }
                }
            }

            return result;
        }

    public static void main(String[] args){
        int[][] spiral = Spiral.spiral(2, 1);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }

    }

}

