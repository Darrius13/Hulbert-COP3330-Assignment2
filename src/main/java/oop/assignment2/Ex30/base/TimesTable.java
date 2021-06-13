package oop.assignment2.Ex30.base;


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


