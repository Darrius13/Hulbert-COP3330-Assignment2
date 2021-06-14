package oop.assignment2.Ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Darrius Hulbert
 */




import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        //storing possible responses in array
        String[] responses = {"Yes","No","Maybe","Ask again later"};
        //Create random object
        Random random = new Random();

        //create Scanner instance to read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = sc.nextLine();//get the question

        //It will choose any index >= 0 and less than responses.length
        int randomResponseIndex = random.nextInt(responses.length);
        //get the random index from the array
        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);//print the response
        System.out.println();
    }
}


