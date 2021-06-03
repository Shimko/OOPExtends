package Наследование;

public class Cat extends Animal  {

    public Cat( String name, int run) {
            super( name, run);


    }

    public  void catInfo() {
        if (run <200 && run > 0){
            this.run = run;
            System.out.print(" Кот " + name +" пробежал -" + run +" метров ");
        }
        else{
            System.out.print(" Кот "+ name + " не может пробежать больше 200 метров");
        }

        System.out.print(" Кот" + name + " не умеет плавать");

    }

}
