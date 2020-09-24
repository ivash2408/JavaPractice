package Epam.Algorithmization;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/


import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int [] arr = new int[size];
        int negative = 0, zero = 0, positive = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random()*20 - 10);
            if(arr[i] > 0)
                positive++;
            else if(arr[i] == 0)
                zero++;
            else
                negative++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Positive: " + positive + "\nZero: " + zero + "\nNegative: " + negative);


    }
}
