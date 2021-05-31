package Наследование;

class Cat extends Animal {
    public Cat(int run, int swim) {
        if (run <200 && run > 0){
            this.run = run;
        }
        if(swim == 0){
            this.swim = swim;
        }
    }
    public void catInfo(int run, int swim) {
        System.out.printf("run =%d, swim = %d", run, swim);
    }
}
class Dog extends Animal {
    public Dog(int run, int swim) {
        if (run <500 && run >0){
            this.run = run;
        }
        if(swim <10 && swim >0){
            this.swim = swim;
        }
    }
    public void dogInfo(int run, int swim) {
        System.out.printf("run =%d, swim = %d", run, swim);
    }
}
