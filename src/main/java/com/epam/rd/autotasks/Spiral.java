package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {

        int up,down,left,right;
        up = 0;
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
            x++;
            right--;

            while(x < down && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                x++;
            }
            x--;
            y--;
            down--;

            while(y > left && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                y--;
            }
            y++;
            x--;
            left++;

            while(x > up && value <= (rows*columns))
            {
                arr[x][y] = value;
                value++;
                x--;
            }
            x++;
            y++;
            up++;
        }

        return arr;
    }

//    public static void main(String[] args) {
//        int [][] ans = Spiral.spiral(3,4);
//
//        for(int i=0;i<ans.length;i++)
//        {
//            for(int j=0;j<ans[0].length;j++)
//            {
//                System.out.print(ans[i][j] +" ");
//            }
//            System.out.println();
//        }
//    }
}
