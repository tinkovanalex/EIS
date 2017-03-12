package HW6_Matrix;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex on 01.03.2017.
 */
public class MatrixCalc {
    public static void main(String[] args) {
        arraySize();
        int m1[][] = makeMatrix();
        printMatrix(m1);
        int m2[][] = makeMatrix();
        printMatrix(m2);
        printMatrix(matrixMultiplication(m1, m2));
        testRez(arr1ForTest(), arr2ForTest());


    }

    public static int arrSize;

    public static int[][] makeMatrix() {
        //int arr2Size = 3;

        int[][] arr1 = new int[arrSize][arrSize];
        //int [] [] arr2 = new int [arr1Size] [arr2Size];

        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                arr1[i][j] = random();
            }
        }
        return arr1;
    }

    public static int[][] matrixMultiplication(int[][] m1, int[][] m2) {
        int r[][] = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                for (int z = 0; z < arrSize; z++) {
                    r[i][j] += m1[i][z] * m2[z][j];
                }
            }
        }
        return r;
    }

    public static int[][] printMatrix(int[][] arr) {
        for (int i = 0; i < arrSize; i++) {

            for (int j = 0; j < arrSize; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();
        return makeMatrix();
    }


    public static int arraySize() {
        Scanner scanner = new Scanner(System.in);
        //int size = 0;
        System.out.println("Enter the Matrix size");
        if (scanner.hasNextInt()) {
            arrSize = scanner.nextInt();
        }
        return arrSize;
    }


    public static int random() {
        int random = new Random().nextInt(10);
        return random;
    }

    public static int[][] arr1ForTest() {
        int arr1[][] = new int[3][3];
        arr1[0][0] = 5;
        arr1[0][1] = 6;
        arr1[0][2] = 4;
        arr1[1][0] = 0;
        arr1[1][1] = 0;
        arr1[1][2] = 1;
        arr1[2][0] = 8;
        arr1[2][1] = 2;
        arr1[2][2] = 3;
        return arr1;
    }

    public static int[][] arr2ForTest() {
        int arr2[][] = new int[3][3];
        arr2[0][0] = 6;
        arr2[0][1] = 2;
        arr2[0][2] = 4;
        arr2[1][0] = 1;
        arr2[1][1] = 1;
        arr2[1][2] = 1;
        arr2[2][0] = 7;
        arr2[2][1] = 8;
        arr2[2][2] = 5;
        return arr2;
    }

//if test work correctly you dont see any message, else - you see exception
    public static void testRez(int [] [] arr1, int [] [] arr2) {
        int rez [] [] = matrixMultiplication(arr1ForTest(), arr2ForTest());
        int[][] arrRez = new int[3][3];
        arrRez[0][0] = 64;
        arrRez[0][1] = 48;
        arrRez[0][2] = 46;
        arrRez[1][0] = 7;
        arrRez[1][1] = 8;
        arrRez[1][2] = 5;
        arrRez[2][0] = 71;
        arrRez[2][1] = 42;
        arrRez[2][2] = 49;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if (rez[i] [j] == arrRez[i] [j]) {
                    //System.out.println("Matrix Multiplication works correctly");
                } else throw new IllegalStateException();
            }
        }
            }

}
