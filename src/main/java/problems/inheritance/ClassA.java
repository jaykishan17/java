package problems.inheritance;

public class ClassA {
    public static void main(String[] args){
        ClassB obj = new ClassB();
        int a = obj.add(5,7);
        int b = obj.sub(6,3);
        int c = obj.mul(2,9);
        int d = obj.div(9,3);

        System.out.println(a + " " + b + " " + c + " "+ d);
    }
}
