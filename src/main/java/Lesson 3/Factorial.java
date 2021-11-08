public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactorialResult(5));
    }

    public static int FactorialResult(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * FactorialResult(f - 1);
        }
    }
}
