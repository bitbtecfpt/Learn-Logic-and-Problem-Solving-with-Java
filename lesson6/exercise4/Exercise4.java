package lesson6.exercise4;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner banphim = new Scanner(System.in);
        int mang[] = new int[5];
        int total =0;
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu: ");
            mang[i] = banphim.nextInt();
            total += mang[i];
        }
        System.out.println("Tong cua mang la: " + total);

        banphim.close();
    }
}
