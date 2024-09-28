package lesson3.exercise1;

// Sử dụng thư viện Scanner để lấy đầu vào từ bàn phím
import java.util.Scanner;

public class Exercise1 {

    public static void main(String args[]) {

        // Khởi tạo đối tượng Scanner, đặt tên là scn
        Scanner scn = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        int a = scn.nextInt();

        if (a > 0 && a < 10) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scn.close();
    }
}