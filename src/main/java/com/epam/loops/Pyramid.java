package com.epam.loops;

public class Pyramid {

    public void printPyramid(int height) {
        for (int row = 1; row <= height; row++) {
            // print spaces
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }

            // print decreasing numbers
            for (int num = row; num >= 1; num--) {
                System.out.print(num);
            }

            // print increasing numbers
            for (int num = 2; num <= row; num++) {
                System.out.print(num);
            }

            // print newline
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
