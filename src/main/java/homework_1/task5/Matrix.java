
package main.java.homework_1.task5;
import java.util.Scanner;

public class Matrix {
        public static void main(String[] args) {
            int[][] A = new int[100][100];
            System.out.print("Введите размерность матрицы до 100 элементов: ");
            Scanner scan = new Scanner(System.in);
            int e = scan.nextInt();
            int m=e;
            int n=e;
            for (int i = 0; i < m; i++) {
                System.out.println("");
                for (int j = 0; j < n; j++) {
                    if ((i == j) || (i == (n - j -1))) {
                        A[i][j] = 1;
                    } else {
                        A[i][j] = 0;
                    }
                    System.out.print(A[i][j] + " ");
                }

            }
        }
    }


