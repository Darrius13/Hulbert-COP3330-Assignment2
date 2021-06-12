package oop.assignment2.Ex28.base;

import java.util.*;
import java.lang.*;
import java.io.*;

public class addingNumbers {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int element;
        while(count <6){
            System.out.print("Enter the value: ");
            element =sc.nextInt();
            System.out.println(element);
            sum +=element;
            count++;
        }
        System.out.println("The total is " + sum);
    }
}




