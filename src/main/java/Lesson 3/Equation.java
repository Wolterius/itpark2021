import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {
        double a, b, c;
        double d; //Дискриминант
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = b * b - 4 * a * c;  //Формула вычисления дискриминанта
        if (d > 0) {
            double x1, x2; // если дискриминант больше нуля, то вычисляем корни уравнения x1 и x2
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        }
        else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
