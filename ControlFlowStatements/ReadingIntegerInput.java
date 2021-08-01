package com.company.ControlFlowStatements;

import java.util.Scanner;

public class ReadingIntegerInput {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Roll Number: ");
        int rollNumber=scan.nextInt();

        scan.nextLine();      // <------

        System.out.println("Enter Name: ");
        String name=scan.nextLine();

        System.out.println(rollNumber);
        System.out.println(name);;
    }
}
