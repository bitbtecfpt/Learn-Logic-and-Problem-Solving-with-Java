package lesson5.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner banphim = new Scanner(System.in);

        while (true) {
            System.out.println("---Menu---");
            System.out.println("1. Tinh tong 2 so");
            System.out.println("2. Tinh hieu 2 so");
            System.out.println("3. Tinh tich 2 so");
            System.out.println("4. Tinh thuong 2 so");
            System.out.println("5. Thoat");

            System.out.println("Nhap lua chon cua ban: ");
            int luaChon = banphim.nextInt();

            while (luaChon < 1 || luaChon > 5) {
                System.out.print("Nhap lua chon cua ban: ");
                luaChon = banphim.nextInt();
            }

            if (luaChon == 5) {
                banphim.close();
                break;
            }

            System.out.println("Nhap so thu nhat: ");
            double a = banphim.nextDouble();

            System.out.println("Nhap so thu hai: ");
            double b = banphim.nextDouble();

            switch (luaChon) {
                case 1:
                    System.out.println("Tong 2 so la: " + (a + b));
                    break;
                case 2:
                    System.out.println("Hieu 2 so la: " + (a - b));
                    break;
                case 3:
                    System.out.println("Tich 2 so la: " + (a * b));
                    break;
                case 4:
                    while (b == 0) {
                        System.out.println("So thu hai phai khac 0. Nhap lai: ");
                        b = banphim.nextDouble();
                    }
                    System.out.println("Thuong 2 so la: " + (a / b));
                    break;
            }
        }
    }
}
