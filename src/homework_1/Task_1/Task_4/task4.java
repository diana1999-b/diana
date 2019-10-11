package homework_1.Task_1.Task_4;

import java.util.Scanner;

public class task4 {

        public static void main(String[] args) {
            // write your code here
            System.out.print("Введите A: ");
            Scanner in = new Scanner(System.in);
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

