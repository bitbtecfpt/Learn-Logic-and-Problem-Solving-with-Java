package lesson7.exercise4;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Write your code here
        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = banPhim.nextLine();

        System.out.print("Nhap chuoi start: ");
        String start = banPhim.nextLine();

        System.out.print("Nhap chuoi end: ");
        String end = banPhim.nextLine();

        int lenStart = start.length();
        int lenEnd = end.length();

        boolean ok = true;

        for(int i = 0; i < lenStart; i++) {
            if (chuoi.charAt(i) != start.charAt(i)) {
                ok = false;
                break;
            }
        }

        int khoangCach = chuoi.length() - lenEnd;

        for (int j = 0; j < lenEnd; j++) {
            if (end.charAt(j) != chuoi.charAt(khoangCach + j)) {
                ok = false;
                break;
            }
        }

        if (ok) {
            System.out.println("Dap ung dieu kien");
        } else {
            System.out.println("Khong dap ung dieu kien");
        }

        banPhim.close();
    }
}
