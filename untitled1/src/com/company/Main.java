package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("Where are your from?");
    String place = scanner.nextLine();

    System.out.println("So you are " + name + " and you are from " + place);

    System.out.println("How old are you?");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("What is your GPA? ");
    double gpa = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Which school?");
    String school = scanner.nextLine();
    scanner.nextLine();

    System.out.println("You are  this age " + age + " also got " + gpa +  " from school " + school);
    }
}
