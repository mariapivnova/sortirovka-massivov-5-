package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк- ");
        int str = in.nextInt();
        System.out.print("Введите кол-во столбцов- ");
        int stolb = in.nextInt();
        int[][] mass = new int[str][stolb];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print("Введите элементы массива- ");
                int a = in.nextInt();
                mass[i][j] = a;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            Arrays.sort(mass[i]);
            for (int y = 0; y < mass[i].length; y++) {
                System.out.print(mass[i][y] + "\t");
            }
            System.out.println();
        }
    }
}







