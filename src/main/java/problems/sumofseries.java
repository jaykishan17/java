package problems;

import java.util.Scanner;

class sumClass(){
    static int sumMethod(){

        return 0;
    }
}

public class sumofseries {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        a = sc.nextInt();
        if(a>0){
            int c=0;
            int b=0;
            for(int y=a;y>=0;y--){
                for(int i=0;i<=y;i++){
                    b=i+b;
                }
           }
            c = c +b;
            System.out.println("Sum of sum-series of natural number is: "+c);
            //Example: for 1,2,3,4,5 > 1 + 3 + 6 + 10 + 15 = 35
        } else {
            System.out.println("Please enter valid number");
        }
    }
}
