package constructor;

public class MainClass {
    public static void main(String[] args){
        ClassA obj = new ClassA();
        System.out.println(obj.name+" "+obj.balance);

        ClassA obj2 = new ClassA("Kishan",30);
        System.out.println(obj2.name + " "+ obj2.balance);
    }
}
