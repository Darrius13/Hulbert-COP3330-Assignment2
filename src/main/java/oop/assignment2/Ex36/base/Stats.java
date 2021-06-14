package oop.assignment2.Ex36.base;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();//create an array list of integers
        String entry = null;
        //start a do-while loop
        do {
            System.out.println("Enter a number: ");
            entry = input.next();//get the entry

            if(!entry.equals("done")) {//if entry is not done
                try {//try to parse it into integer
                    int num = Integer.parseInt(entry);
                    numbers.add(num);//add if parseable
                }catch(NumberFormatException nfe) {
                    //do not add number into the list
                }
            }
        }while(!entry.equals("done"));//as long as user does not entry "done"

        //print the numbers
        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        //print avg
        System.out.println("The average is "+average(numbers));
        //print min
        System.out.println("The minimum is "+min(numbers));
        //print max
        System.out.println("The maximum is "+max(numbers));
        //print standard deviation
        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));


    }

    /**
     * calculate average
     * @param numbers
     * @return
     */
    public static double average(ArrayList<Integer> numbers) {
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        double avg = (double)(total)/numbers.size();
        return avg;
    }


    /**
     * calculate maximum
     * @param numbers
     * @return
     */
    public static int max(ArrayList<Integer> numbers) {
        int max= numbers.get(0);

        for(int num: numbers) {
            if(num > max)
                max = num;
        }

        return max;
    }

    /**
     * calculate minimum
     * @param numbers
     * @return
     */
    public static int min(ArrayList<Integer> numbers) {
        int min= numbers.get(0);

        for(int num: numbers) {
            if(num < min)
                min = num;
        }

        return min;
    }

    /**
     * calculates standard deviation
     * @param numbers
     * @return
     */
    public static double std(ArrayList<Integer> numbers) {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers) {
            sum = sum + Math.pow((num-mean), 2);
        }
        double stdDev = Math.sqrt(sum/numbers.size());

        return stdDev;
    }

}



