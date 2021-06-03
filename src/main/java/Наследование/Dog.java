package Наследование;

public class Dog extends Animal {
    protected int swim;
    public Dog( String name, int run, int swim) {
        super( name,run);
        this.swim = swim;


    }
    public  void dogInfo() {
        if (run < 500 && run > 0) {
            this.run = run;
            System.out.print(" Пёс " +" пробежал - " + run +" метров " );
        } else {
            System.out.println(" Пёс "+ name +" не может пробежать больше 500 метров");
        }
        if (swim < 10 && swim > 0) {
            System.out.print(" Пёс "+ name  +" проплыл: " + swim +" метров " );
        } else {
            System.out.println(" Пёс "+ name +" не может проплыть больше 10 метров");
        }
    }
}
