public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialResult(5));
    }

    public static int factorialResult(int a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * factorialResult(a - 1);
        }
    }
}
