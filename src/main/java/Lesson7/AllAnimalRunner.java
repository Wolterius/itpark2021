package Lesson7;

public class AllAnimalRunner {
    public static void main(String[] args) {

        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.running = 200;
        murzik.floats = false;

        Dog bobik = new Dog();
        bobik.name = "Бобик";
        bobik.running = 500;
        bobik.floats = 10;

        Tiger kuzya = new Tiger();
        kuzya.name = "Рекс";
        kuzya.running = 1000;
        kuzya.floats = 20;

        murzik.loat();
        System.out.println("Умеет ли " + murzik.name + " плавать: " + murzik.getFloats());
        murzik.run();
        System.out.println(murzik.name + " пробежал " + murzik.running + "м");
        bobik.setFloats(5);
        System.out.println(bobik.name + " проплыл " + bobik.getFloats() + "м");
        bobik.run();
        System.out.println(bobik.name + " пробежал " + bobik.running + "м");
        kuzya.loat();
        System.out.println(kuzya.name + " проплыл " + kuzya.floats + "м");
        kuzya.run();
        System.out.println(kuzya.name + " пробежал " + kuzya.running + "м");
    }
}
