package lesson3.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner banphim = new Scanner(System.in);
        
        System.out.println("Nhap 3 so nguyen: ");
        int a = banphim.nextInt();
        int b = banphim.nextInt();
        int c = banphim.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("La tam giac");
                if (a == b || b == c || c == a) {
                    if (a == b && b == c) {
                        System.out.println("Tam giac deu");
                    } else {
                        System.out.println("Tam giac can");
                    }
                } else {
                    if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                        System.out.println("Tam giac vuong");
                    }
                }
            } else {
                System.out.println("Khong phai tam giac");
            }
        } else {
            System.out.println("Khong phai tam giac");
        }
    }
}
