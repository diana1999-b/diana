package Homework_1.task_7;

public class Task7 {
// пустая строка не нужна
    public static void main(String[] args) {
        // write your code here - удаляй
        int sum=0;
        int i;
//     for (int i=1; i<=99;i++) {
        for (i=1; i<=99;i++) {
            if(i%2!=0)
                sum +=i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}
