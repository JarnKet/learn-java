package org.example.lesson05;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("ຕົວທຳອິດ: " + numbers[0]);
        numbers[1] = 99;
        System.out.println("ຕົວທີ 2 ຫຼັງແກ້: " + numbers[1]);
        System.out.println("ຂະໜາດ array: " + numbers.length);

        System.out.println("-- for ປົກກະຕິ --");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index " + i + " = " + numbers[i]);
        }

        System.out.println("-- for-each --");
        for (int n : numbers) {
            System.out.println(n);
        }

        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("-- 2D array --");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
