package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {

        int up,down,left,right;
        up = -1;
        down = rows;
        left = -1;
        right = columns;

        int [][] arr = new int[rows][columns];
        int x,y;
        x = y = 0;
        int value = 1;

        while(value <= (rows*columns))
        {
            while(y < right && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                y++;
            }
            y--;
            right--;

            while(x < down && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                x++;
            }
            x--;
            down--;

            while(y > left && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                y--;
            }
            y++;
            left++;

            while(x > up && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                x--;
            }
            x++;
            up++;
        }

        return arr;
    }
}
