package lesson7.exercise2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Write your code here
        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = banPhim.nextLine();

        if (chuoi.isEmpty()) {
            System.out.println("Chuoi rong");
        } else {
            System.out.println("Chuoi khong rong");
        }

        banPhim.close();
    }
}
