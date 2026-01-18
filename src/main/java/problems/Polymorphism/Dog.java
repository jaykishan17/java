package problems.Polymorphism;

public class Dog {

    public void eat(){
        System.out.println("nom nom");
    }

    //example of overloading: eat() and eat(int numberoftimes)

    public void eat(int numberoftimes){
        for (int i=1;i<=numberoftimes;i++) {
            System.out.println("nom nom nom");
        }
    }
}
