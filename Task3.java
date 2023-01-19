public class Task3 {
    public static void main(String[] args) {

        // Найти максимальное из натуральных чисел, не превышающих 5000, которое нацелоделится на 39.
        // Используйте цикл с пост- или предусловием

        int i = 0;
        int max = 0;

        do {
            if ((i % 39 == 0) && (i > max) ) {
                max = i;
            }
            i++;
        } while (i <= 5000);

        System.out.println (max);

    }
}
