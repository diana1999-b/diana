package Homework_2.task_5;

import java.util.Arrays;

public class task5 {

    public static void main (String [] args)
    {
        /*Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]*/
        int [] array = {0, 1, 2, 3, 4};//исходный массив
        int [] arrayNew = new int[array.length];//вспомогательный массив для записи обратного массива
        int count=0;//счетчик
        for (int j=array.length-1; j>=0; j--)
        {
            arrayNew[count] = array[j];//запись элементов в обратном порядке в новый массив
            count++;
        }
        for (int j =0;j<array.length;j++)
        {
            array[j] = arrayNew[j];
        }
        System.out.println("New array: " + Arrays.toString(array));
    }
}