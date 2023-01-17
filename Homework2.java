import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //task 1
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (Math.abs(a) > Math.abs(b)) {
            System.out.println(a / 2);
        }

        // task 2

        for (double i = 10; i < 26; i++) {
          //  double j = i + 0,4;
            System.out.print(i);
            System.out.print("  ");
            System.out.print(i + 0.4);
            System.out.println("");
        }

        // task 3



        // task 4
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

    }
}
