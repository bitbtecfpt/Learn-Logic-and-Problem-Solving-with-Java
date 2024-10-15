package lesson9.exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        int[] abc = nhapABC();

        int a = abc[0];
        int b = abc[1];
        int c = abc[2];

        if (a == 0) {
            System.out.println(" nghiem cua phuong trinh la x = " + (-c / b));
        } else {
            int delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1
                        + "x2 = " + x2);
            } else if (delta == 0) {
                double xkep = -b / 2 * a;
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + xkep);
            } else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
    }

    public static int[] nhapABC() {
        Scanner banPhim = new Scanner(System.in);

        int[] abc = new int[3];

        // Code here
        System.out.println("Nhap a: ");
        int a = banPhim.nextInt();
        abc[0] = a;
        System.out.println("Nhap b: ");
        int b = banPhim.nextInt();
        abc[1] = b;
        System.out.println("Nhap c: ");
        int c = banPhim.nextInt();
        abc[2] = c;

        return abc;
    }

}
