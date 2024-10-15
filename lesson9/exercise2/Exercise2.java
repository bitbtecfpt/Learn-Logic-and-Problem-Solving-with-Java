package lesson9.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xA: ");
        float xA = scanner.nextFloat();
        System.out.println("Nhap yA: ");
        float yA = scanner.nextFloat();
        System.out.println("Nhap xB: ");
        float xB = scanner.nextFloat();
        System.out.println("Nhap yB: ");
        float yB = scanner.nextFloat();

        float[] AB = vecTo(xA, yA, xB, yB);

        float z = AB[0];
        float f = AB[1];

        float x = doDai(z, f);

        System.out.println(x);
    }

    public static float[] vecTo(float xA, float yA, float xB, float yB) {
        //tinh vecto AB
        float z = xB - xA;
        float f = yB - yA;

        float[] AB = { z, f };
        
        return AB;
    }

    public static float doDai(float z, float f) {
        //tinh do dai vecto AB
        float doDai = (float) Math.sqrt(z * z + f * f);

        return doDai;
    }

}
