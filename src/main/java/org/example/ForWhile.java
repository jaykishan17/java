package org.example;

public class ForWhile {
    public static void main(String[] args){
        //for (statement 1; statement 2; statement 3) {}
        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.

        for(int i=1 ; i<=5; i++){
            System.out.println("i is: "+i);
        }
        int j=1;
        while(j<=5){
            System.out.println("j is: "+j);
            j++;
        }
    }
}
