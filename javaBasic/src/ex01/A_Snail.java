package ex01;

import java.util.Scanner;

public class A_Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // 변수 초기화
        int size = 3; 

        // 입력값 받기
        try {
            size = scanner.nextInt();
        } catch (Exception exception) {
            return;
        }

        // 3미만의 경우 팅겨내기
        if (size < 3) return;

        // snailArray 배열에 createSnail 메소드로 접근
        int[][] snailArray = createSnail(size);
        //                                 3
      // foreach
        for (int[] row : snailArray) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }

    public static int[][] createSnail(int size) {
        int[][] array = new int[size][size];
        int number = 1;

        int row = (size - 1) / 2;
        int col = (size - 1) / 2;
        // int row = 0;
        // int col = 0;

        int direction = 0; // 0: down, 1: right, 2: up, 3: left

        int steps = 1;
        // int steps = size - 1;

        int stepCount = 0;

        while (number <= size * size) {
            array[row][col] = number++;
            stepCount++;

            if (direction == 0) row++;
            if (direction == 1) col++;
            if (direction == 2) row--;
            if (direction == 3) col--;

            if (stepCount == steps) {
                stepCount = 0;
                direction = direction == 3 ? 0 : direction + 1;
                if (direction == 2 || direction == 0) steps++;
                // boolean isFirst = steps == (size - 1) && direction == 1;
                // if (!isFirst && (direction == 1 || direction == 3)) steps--;
            }
        }

        return array;
    }
}