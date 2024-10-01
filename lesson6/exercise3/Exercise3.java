package lesson6.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);

        int[] bangDiem = new int[3];
        
        System.out.println("Nhap diem cua hoc sinh: ");
        for(int i = 0; i < bangDiem.length; i++) {
            bangDiem[i] = banPhim.nextInt();
        }

        System.out.println("Diem cua hoc sinh vua nhap la: ");
        for(int i = 0; i < bangDiem.length; i++) {
            System.out.println(bangDiem[i]);
        }
        banPhim.close();
    }
}
