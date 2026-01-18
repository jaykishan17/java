package problems.Polymorphism;

public class Animal {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.eat();
        obj.eat(3);

        Cat obj1 = new Cat();
        //here eat() method is used 2nd time, i.e. overridding
        obj1.eat();
    }
}
