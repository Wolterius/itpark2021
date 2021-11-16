import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n для получения значения последовательности Фибоначчи");
        int n = in.nextInt();
        System.out.println("Член n последовательности Фибоначчи равен " + fibSequence(n));
    }

    public static int fibSequence(int n) {
        int a = 0;
        int b = 1;
        int fibs = 0;
        if (n == 0) {
            return a;
        } else {
            if (n == 1) {
                return b;
            } else {
                for (int fseq = 2; fseq <= n; fseq++) {
                    fibs = a + b;
                    a = b;
                    b = fibs;
                }
                return fibs;
            }
        }
    }
}