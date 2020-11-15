package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("Hello! My name is Jenna.");
        System.out.print("What is your name? ");
        String name = hello.nextLine();
        System.out.println("Nice to meet you, "+name);
        Scanner response = new Scanner(System.in);
        System.out.println("How has your day been?");
        String day =response.nextLine();
        System.out.println("What made you feel like " +day+ "?");
        String reason = response.nextLine();
        System.out.println("It was nice speaking with you " + name + ". I hope you have a good day!");
        System.out.println(" Here are your responses for today:" +name+ ", " +day+ ", and " +reason);

    }
}
