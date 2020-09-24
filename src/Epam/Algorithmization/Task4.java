package Epam.Algorithmization;

import java.util.Arrays;
import java.util.Scanner;

/*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = (int)(Math.random()*10);
        arr = swapMinMax(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] swapMinMax(int arr[]) {
        Arrays.sort(arr);
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }
}
