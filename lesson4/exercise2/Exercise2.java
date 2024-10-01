package lesson4.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        
        int sum = 0;

        // int i = 1;
        // while(i <= n)
        // {
        //     sum = sum + i;
        //     i++;
        // }

        for(int i = 1; i <= n ; i++)
        {
            sum = sum + i;
        }

        System.out.println("Tong: " + sum);

        scanner.close();
    }
}
