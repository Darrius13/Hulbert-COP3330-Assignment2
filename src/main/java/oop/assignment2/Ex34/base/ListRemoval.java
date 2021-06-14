package oop.assignment2.Ex34.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Darrius Hulbert
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListRemoval {
    public static void main(String[] args) {
        //Create an arrayList of employees
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printEmployees(employees);//print the employees

        Scanner sc = new Scanner(System.in);//create scanner instance to read user input

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = sc.nextLine();//get emp name to remove

        employees.remove(nameToRemove);//remove the employee from the array list

        System.out.println();
        printEmployees(employees);//print employees
    }


    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}



