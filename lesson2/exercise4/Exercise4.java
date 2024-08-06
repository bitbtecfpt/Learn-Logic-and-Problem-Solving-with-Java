package lesson2.exercise4;

public class Exercise4 {
    static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Truoc khi dao gia tri");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // The first way
        int temp = a;
        a = b;
        b = temp;

        // The second way
        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println("Sau khi dao gia tri");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
