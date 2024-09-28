package lesson4.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        
        int n = scanner.nextInt();
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                } else {
                    continue;
                }
            }
        } else {
            System.out.println("n phai lon hon 1");
        }

        scanner.close();
    }
}
