public class FormulaAutomation {
    
    public static void main(String[] args) {

        System.out.println(keenetikMolecul(150));
        System.out.println(keenetikMolecul(600));
        System.out.println(keenetikMolecul(1400));
    }
    
    public static double keenetikMolecul(double T) {
        double k = 1.38 * 0.000000000000000000000001; 
    /*Формула для рассчета средней кинетической энергии молекул E = (3/2)*K*T,
    где k - Постоянная Больцмана равная 1.38 * 10 в -23 степени
    T - температура газа */
        double e = (3/2) * k * T;
        return e;
    }
}

