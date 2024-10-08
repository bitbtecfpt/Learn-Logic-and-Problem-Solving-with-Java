import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Write your code here
        Scanner banPhim = new Scanner(System.in);

        System.out.print("Nhap chuoi thu nhat: ");
        String chuoiThuNhat = banPhim.nextLine();

        System.out.print("Nhap chuoi thu hai: ");
        String chuoiThuHai = banPhim.nextLine();

        if (chuoiThuNhat.equals(chuoiThuHai)) {
            System.out.println("Hai chuoi nay giong nhau");
        } else {
            System.out.println("Hai chuoi nay khac nhau");
        }

        banPhim.close();
    }
}