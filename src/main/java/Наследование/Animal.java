package Наследование;

public class Animal {
    public  int run;
    public  int swim;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public Animal() {
    }

    public void info(String[] args) {
        System.out.printf("run =%d, swim = %d", run, swim);
    }

}

