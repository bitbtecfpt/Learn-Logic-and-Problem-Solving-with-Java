package lesson8.exercise5;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] mang1 = nhapMang();
        int[] mang2 = nhapMang();

        double trungBinhCong1 = trungBinh(mang1);
        double trungBinhCong2 = trungBinh(mang2);

        System.out.println("Trung binh cong cua mang1 la: " + trungBinhCong1);
        System.out.println("Trung binh cong cua mang2 la: " + trungBinhCong2);
    }

    public static int[] nhapMang() {

        Scanner banPhim = new Scanner(System.in);
        int[] mang = new int[5];
        
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = banPhim.nextInt();
        }
        return mang;
    }

    public static double trungBinh(int[] mang) {
        double tong = 0;
        for (int i = 0; i < mang.length; i++) {
            tong = tong + mang[i];
        }
        double trungBinhCong = tong / mang.length;

        return trungBinhCong;
    }
}
