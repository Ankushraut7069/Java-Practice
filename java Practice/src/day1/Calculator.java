package day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the First no");
        int no1 = sc.nextInt();
        System.out.println("enter the Second no");
        int no2 = sc.nextInt();
        System.out.println("Enter the Symbol(+,-,%,*)");
        String sym= sc.next();
        int res;
        switch (sym) {
            case "+" -> {
                res = no1 + no2;
                System.out.println("Addition is " + res);
            }
            case "-" -> {
                res = no1 - no2;
                System.out.println("Substraction is " + res);
            }
            case "%" -> {
                res = no1 % no2;
                System.out.println("Division  is " + res);
            }
            case "*" -> {
                res = no1 * no2;
                System.out.println("Multiplication is " + res);
            }
            default -> System.out.println("Invalid No");
        }

    }
}
