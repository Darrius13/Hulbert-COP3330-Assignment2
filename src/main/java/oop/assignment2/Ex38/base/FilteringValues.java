package oop.assignment2.Ex38.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Darrius Hulbert
 */


import java.util.*;

public class FilteringValues {
    public static void main(String[] args) {

        // create an object for user input
        Scanner in = new Scanner(System.in);

        // prompt user to enter a string containing numbers separated by space
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        // split the input string by space to String array
        String list[] = data.split(" ");

        // make a function call that will return the Integer array of even numbers
        Integer evenList[] = filterEvenNumbers(list);

        // display the filtered even number as per the given format
        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    // this method takes array of string integers as input parameter
    // and then returns the Integer array of even numbers
    public static Integer[] filterEvenNumbers(String list[]) {

        // declare an empty array list of Integer
        ArrayList<Integer> newList = new ArrayList<>();

        // now, loop to iterate over input array
        for(int i=0; i<list.length; i++){

            // convert string number to integer number
            int num = Integer.parseInt(list[i]);

            // check if number is divisible by 2 (means it is even)
            if(num % 2 == 0){

                // add number to the list
                newList.add(num);
            }
        }

        // now, convert the array list to integer array
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        // return Integer array
        return arr;
    }
}




