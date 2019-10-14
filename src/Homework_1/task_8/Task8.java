package Homework_1.task_8;

public class Task8 {

    public static void main(String[] args) {
        // write your code here
        int sumAll=0;
        int sumEven=0;
        int sumOdd=0;
        for (int i=0; i<=100; i++){
            if(i%2==0) // даже при 1 операторе ставь фигурные скобки 'if() {}'
                sumEven+=i;
            else // else {}
                sumOdd +=i;
            sumAll +=i; // общую сумму можно посчитать 1 раз сложив четные и нечетные за пределами цикла
        }
        System.out.println("Сумма четных чисел: " +sumEven+"Сумма нечетных чисел: " + sumOdd + "Сумма всех чисел: " +sumAll);
    }
}
