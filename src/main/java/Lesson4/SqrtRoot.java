public class SqrtRoot {
    public static void main(String[] args) {
        System.out.println("Квадратный корень числа a = " + squareRoot(625));
    }

    public static int squareRoot(int a) {
        int b = 1;
        while (b * b != a) {
            b++;
        }
        return b;
    }
}
