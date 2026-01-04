package org.example;

import javax.sound.midi.Soundbank;
import java.util.AbstractMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String system;

    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.print("Pick operation 1 = Add, 2 = Subtract, 3 = Multiply, 4 = Divide ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();
        int result = 0;
        switch(operator){
            case 1: result = n1+n2;
                break;
            case 2: result = n1-n2;
                break;
            case 3: result = n1*n2;
                break;
            case 4: result = n1/n2;
                break;
            case 5: System.out.println("Error");
                break;
        }
//        if(operator ==1){
//            result = n1+n2;
//        } else if (operator==2) {
//            result = n1-n2;
//        } else if (operator==3) {
//            result = n1*n2;
//        } else if (operator==4) {
//            result=n1/n2;
//        }else {
//            System.out.println("error");
//        }
        System.out.println("Result is: "+result);
    }
}