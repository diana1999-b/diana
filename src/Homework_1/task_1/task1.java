package Homework_1.task_1;

/* package Homework_1.task_1; 
Homework_1 -> с маленькой буквы и это homework_2
*/

// имена классов с большой буквы, task1 -> Task_1
public class task1 {

    public static void main(String[] args) {
// t - плохое название переменной, измени
        double t = 10; //1-ый день task 1
        double sum = 0;
        for (int i=1; i<=7; i++) {
            t = (t + t * 0.1);
            sum = sum + t;
        }
        System.out.println("Суммарный путь за 7 дней: " + sum +"км");
    }
}
