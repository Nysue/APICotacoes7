
package com.company.boostcamp;

import java.util.Scanner;

public class Q10830_matrixPower {
    int size;
    int[][] matrix;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();
        int power = scanner.nextInt();

        matrix = new int[size][size];
        setMatrix(scanner);

        matrix = powerMatrix(matrix, power);

        printMatrix();
    }

    public void setMatrix(Scanner scanner) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) matrix[i][j] = scanner.nextInt();
        }
    }

    public void printMatrix(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(String.format("%d ", matrix[i][j]));
            }
            System.out.println(" ");
        }
    }

    public int multiply(int[][] A, int[][] B, int row, int column) {
        int sum = 0;

        for (int i = 0; i < size; i++) {
            int tmp = A[row][i] * B[i][column];
            sum += tmp;
        }

        return sum % 1000;
    }

    public int[][] multiplyMatrix(int[][] A, int[][] B) {
        int[][] tmp = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tmp[i][j] = multiply(A, B, i, j);
            }
        }

        return tmp;
    }

    public int[][] powerMatrix(int[][] matrix, int power) {
        int[][] tmp = matrix.clone();

        for(int i=0; i<power-1; i++){
            tmp = multiplyMatrix(tmp, matrix);
        }

        return tmp;
    }
}