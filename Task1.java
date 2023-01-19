import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Составить программу, которая уменьшает первое введенное число в два раза,
        // если онобольше второго введенного числа по абсолютной величине.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (Math.abs(a) > Math.abs(b)) {
            System.out.println(a / 2);
        }
        }

    }
