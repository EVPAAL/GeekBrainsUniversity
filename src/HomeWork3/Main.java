package HomeWork3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array1 = new int []{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
        }


        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }


        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6){
                array3 [i] *= 2;
            }
        }


        int x = 5;
        int[][] array4 = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
            }
        }


        arrayWithArguments(8, 10);

    }

    public static int [] arrayWithArguments(int len, int initialValue) {
        int[] array5 = new int[len];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;
        }
        return array5;
    }

}