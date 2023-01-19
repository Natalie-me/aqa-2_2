public class Task2 {
    public static void main(String[] args) {

        // Напечатать числа с помощью цикла for следующим образом:10 10.411 11.4...25 25.4

        for (double i = 10; i < 26; i++) {
            //  double j = i + 0,4;
            System.out.print(i);
            System.out.print("  ");
            System.out.print(i + 0.4);
            System.out.println();
        }

    }
}
