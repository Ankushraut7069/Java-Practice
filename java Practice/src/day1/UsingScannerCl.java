package day1;

import java.util.Scanner;

public class UsingScannerCl {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your name");
        String Name = s.next();
        System.out.println("Enter Gender");
        char gender = s.next().charAt(0);
        System.out.println("Enter Age");
        int Age =s.nextInt();
        System.out.println("Enter Your No ");
        long phoneNo=s.nextLong();
        System.out.println("Name"+Name);
        System.out.println("Gender"+gender);
        System.out.println("Age"+Age);
        System.out.println("Phone NO "+phoneNo);
    }
}
