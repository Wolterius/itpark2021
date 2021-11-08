public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactorialResult(5));
    }

    public static int FactorialResult(int a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * FactorialResult(a - 1);
        }
    }
}
