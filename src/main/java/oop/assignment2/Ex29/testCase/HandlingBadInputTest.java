package oop.assignment2.Ex29.testCase;
import java.util.*;
import java.lang.*;
import java.io.*;

public class HandlingBadInputTest {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int value;
        try {
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
        catch(Exception e)
        {
            System.out.println("Something went wrong. Try with integer values.");
        }
    }

}


