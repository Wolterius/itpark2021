public class Calculate {

    public static void main(String[] args) {

        System.out.println(calculateplus(3, 5));
        System.out.println(calculateminus(7, 2));
        System.out.println(calculatemultiply(15, 5));
        System.out.println(calculatedivide(20, 4));
    }

    public static int calculateplus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int calculateminus(int a, int b) {
        int result1 = a - b;
        return result1;
    }
    public static int calculatemultiply(int a, int b) {
        int result2 = a * b;
        return result2;
    }
    public static int calculatedivide(int a, int b) {
        int result3 = a * b;
        return result3;
    }
}