package lesson7.exercise3;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        
        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap chuoi thu nhat: ");
        String chuoiThuNhat = banPhim.nextLine();

        System.out.print("Nhap chuoi thu hai: ");
        String chuoiThuHai = banPhim.nextLine();

        if (chuoiThuNhat.contains(chuoiThuHai)) {
            System.out.println("Chuoi thu nhat chua chuoi thu hai");
        } else {
            System.out.println("Chuoi thu nhat khong chua chuoi thu hai");
        }

        banPhim.close();
    }
}
