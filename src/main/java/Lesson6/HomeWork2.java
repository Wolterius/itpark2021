package Lesson6;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(fibArray(100));

    }
    //Решил через массив Фибоначчи, немного подглядел на JavaRush=)
    private static long fibArray(int n) {
        long [] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i<= n; i++)
            arr[i] = arr[i - 1] + arr[i-2];

        return arr[n];
    }
}