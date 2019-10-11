package Homework_1.task_4;

import java.util.Scanner;

// task4 -> Task_4
public class task4 {

        public static void main(String[] args) {
            // write your code here - удаляй этот комментарий
            System.out.print("Введите A: ");
            Scanner in = new Scanner(System.in);
                // a - плохое название переменной
            int a = in.nextInt();
            System.out.print("Введите B: ");
            int b = in.nextInt();
            int c = 0;
            for (int i = 0; i < b; i++) {
                c = c + a;
            }
            System.out.println("A*B = " + c);
        }
    }

