package lesson3.exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner phuongtrinh = new Scanner(System.in);

        System.out.println("Nhap vao 3 so nguyen");
        double a = phuongtrinh.nextInt();
        double b = phuongtrinh.nextInt();
        double c = phuongtrinh.nextInt();

        if (a==0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = (c - b) / a;
            System.out.println("Phuong trinh co nghiem la: " + x);
        }

        phuongtrinh.close();
    }
}
