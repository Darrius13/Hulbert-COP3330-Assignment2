package oop.assignment2.Ex35.base;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class pickAWinner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();//ArrayList for storing names
        //start a do-while loop to take name
        do {
            System.out.println("Enter a name:");
            name= input.nextLine();//get the name
            //add the name to the array list only if it is non blank or non empty
            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        //Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());


        System.out.println("The winner is... "+nameList.get(randomIndex));

    }

}


