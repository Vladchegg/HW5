package ru.skypro;

public class Main {

    public static void main(String[] args) {

    // Задача 1
        int [] height = new int [3];
        height[0] = 1;
        height[1] = 2;
        height[2] = 3;

       double [] width = {1.57, 7.654, 9.986};

       int [] square = new int [4];
       square [0] = 10;
       square [1] = 15;
       square [2] = 20;
       square [3] = 25;

    // Задача 2
        System.out.println(height[0] + ", " + height[1] + ", " + height[2]);

        for (int i = 0; i < width.length; i++) {
            if (i == width.length -1)
                System.out.println(width[i]);
            else
            System.out.print(width[i] + ", ");
        }

        for (int i = 0; i < square.length; i++) {
            if (i == square.length - 1)
            System.out.println(square[i]);
            else
                System.out.print(square[i] + ", ");
        }

    // Задача 3
        System.out.println(height[2] + ", " + height[1] + ", " + height[0]);

       for (int i = width.length - 1; i >= 0; i--) {
           if (i == 0)
               System.out.println(width[i]);
           else
               System.out.print(width[i] + ", ");
       }

       for (int a = square.length - 1; a >=0; a--) {
           if (a == 0)
               System.out.println(square[a]);
           else
               System.out.print(square[a] + ", ");
       }

    // Задача 4
        for (int x = 0; x < height.length ; x++) {
            if (height[x] % 2 != 0) {
                height[x] = height[x] + 1;
            } else if (height[x] % 2 == 0) {
            }
                System.out.println(height[x]);
        }

    }
}