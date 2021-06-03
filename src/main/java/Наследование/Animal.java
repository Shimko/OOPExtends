package Наследование;

public class Animal {
    protected     int run;
    protected String name;

    public static int count;

    public Animal(String name, int run) {
        count++;
        this.run = run;
        this.name = name;

    }
    public static void chekcAnimal() {
        System.out.println(" Всего животных " + Animal.count);
    }
}

