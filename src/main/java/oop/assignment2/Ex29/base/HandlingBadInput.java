package oop.assignment2.Ex29.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Darrius Hulbert
 */


import java.util.*;
import java.lang.*;
import java.io.*;
public class HandlingBadInput {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int value;
        while(true){
            System.out.print("What is the rate of return? ");
            value = sc.nextInt();
            System.out.println(value);
            if(value>=1 && value<=72){
                System.out.println("it will take "+(72/value)+" year to double your initial investment");
                break;
            }
            else
            {
                System.out.println("Sorry this is not a valid input");
            }
        }
    }
}


