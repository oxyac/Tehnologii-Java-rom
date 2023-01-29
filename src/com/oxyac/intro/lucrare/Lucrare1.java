package com.oxyac.intro.lucrare;

public class Lucrare1 implements Lucrare{


    public void run() {
        int[][] myNumbers = {
                {1, 2, 3},
                {5, 6, 7},
                {5, 6, 7} };
        System.out.println(arraySum(myNumbers));
    }
    private int arraySum(int[][] array){
        int total = 0;
        for (int row = 0; row < array.length; row++)
        {
            total += array[row][row] + array[row][array.length - row-1];
        }
        return total;
    }
}
