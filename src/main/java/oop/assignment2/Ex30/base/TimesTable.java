package oop.assignment2.Ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Darrius Hulbert
 */



public class TimesTable {
    public static void main(String[] args)
    {
        for(int i = 1 ; i <= 12; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}


