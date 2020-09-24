package Epam.Algorithmization;

/* В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter k: ");
        int k = in.nextInt();
        int result = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 10);
            if(arr[i] % k == 0)
                result+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }
}
