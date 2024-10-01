package lesson5.exercise1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]) {

        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap so dien tieu thu: ");

        double n = banPhim.nextDouble();

        while (n <= 0) {
            System.out.print("So dien tieu thu phai lon hon 0. Nhap lai: ");
            n = banPhim.nextDouble();
        }

        double tienDien = 0;

        if (n > 0 && n <= 50) {
            tienDien = n * 1.678;
            System.out.println("So tien dien phai tra la: " + tienDien);
        } else if (n > 50 && n <= 100) {
            tienDien = 50 * 1.678 + (n - 50) * 1.734;
            System.out.println("So tien dien phai dong la : " + tienDien);
        } else if (n > 100 && n <= 200) {
            tienDien = 50 * 1.678 + (100 - 50) * 1.734 + (n - 100) * 2.014;
            System.out.println("So tien dien phai dong la : " + tienDien);
        } else if (n > 200 && n <= 300) {
            tienDien = 50 * 1.678 + (100 - 50) * 1.734 + (200 - 100) * 2.014 + (n - 200) * 2.536;
            System.out.println("So tien dien phai dong la : " + tienDien);
        } else if (n > 300 && n <= 400) {
            tienDien = (50 * 1.678) + (100 - 50) * 1.734 + (200 - 100) * 2.014
                    + (300 - 200) * 2.536 + (400 - n) * 2.834;
            System.out.println("So tien dien phai dong la : " + tienDien);
        } else if (n > 400) {
            tienDien = (50 * 1.678) + (100 - 50) * 1.734 + (200 - 100) * 2.014
                    + (300 - 200) * 2.536 + (400 - 300) * 2.834 + (n - 400) * 2.927;
            System.out.println("So tien dien phai dong la : " + tienDien);
        }

        banPhim.close();
    }
}
