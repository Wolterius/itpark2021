public class FormulaAutomation {
    /*Формула для рассчета средней кинетической энергии молекул E = (3/2)*K*T,
    где k - Постоянная Больцмана равная 1.38 * 10 в -23 степени
    T - температура газа
    */

    public static void main(String[] args) {

        System.out.println(keenetikmolecul(150));
        System.out.println(keenetikmolecul(600));
        System.out.println(keenetikmolecul(1400));
    }

    public static double keenetikmolecul(double T) {
        double k = 1.38 * 0.000000000000000000000001; //Постоянная Больцмана
        double e = (3/2) * k * T;
        return e;

    }
}

