package constructor;

public class ClassA {
    String name;
    int balance;

    ClassA(){
        name = "Jay";
        balance = 20;
    }

    ClassA(String name1, int balance1){
        System.out.println("constructor with parameter printed");
        name = name1;
        balance = balance1;
    }
}
