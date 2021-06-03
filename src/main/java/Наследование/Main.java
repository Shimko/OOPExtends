package Наследование;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пушок",350);
        cat1.catInfo();
        System.out.println();
        Dog dog1 = new Dog("Шарик",400,150);
        dog1.dogInfo();
        System.out.println();
        Animal.chekcAnimal();
    }
}
