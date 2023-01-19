import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходевыполнения программы.
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

    }
}
