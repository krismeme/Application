package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a srecond number: ");
        int num2 = in.nextInt();
        int operSum = num1 + num2;
        int operMin = num1-num2;
        int operUmn = num1*num2;
        double operDel = num1/num2;
        int operOst = num1%num2;
        int operSt=num1 ;
        for(int i = 1; i<num2; i++){
            operSt =operSt*num1;
        }
        System.out.println(operSum);
        System.out.println(operMin);
        System.out.println(operUmn);
        System.out.println(operDel);
        System.out.println(operOst);
        System.out.println(operSt);

    }
}