public class Calculate {

    public static void main(String[] args) {

        System.out.println(calculatePlus(3, 5));
        System.out.println(calculateMinus(7, 2));
        System.out.println(calculateMultiply(15, 5));
        System.out.println(calculateDivide(20, 4));
    }

    public static int calculatePlus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int calculateMinus(int a, int b) {
        int result1 = a - b;
        return result1;
    }
    public static int calculateMultiply(int a, int b) {
        int result2 = a * b;
        return result2;
    }
    public static int calculateDivide(int a, int b) {
        int result3 = a / b;
        return result3;
    }
}
