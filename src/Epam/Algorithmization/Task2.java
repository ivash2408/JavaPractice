package Epam.Algorithmization;

import java.util.Arrays;
import java.util.Scanner;

/*Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter z: ");
        int z = in.nextInt();
        int count = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 10);
            if(arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of replacements: " + count);
    }
}
