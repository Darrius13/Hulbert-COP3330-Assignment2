package oop.assignment2.Ex25.base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Darrius Hulbert
 */



public class password {
    public static void main(String[] args) {
        // we created a frame f.
        JFrame f= new JFrame("PASSWORD VALIDATOR");
        // JLabel contains the read only text.
        // we created two, one display a text to enter a
        // password and other stores the result.
        JLabel l,answer;
        // JTextField is used to take the input.
        // it is input field.
        JTextField t;
        // we created two buttons.
        // one for checking the result and other for resetting
        // all the content on screen.
        JButton check,reset;
        // now we instantiate each of them.
        // first both the labels.
        l=new JLabel("Enter a Password");
        answer=new JLabel("Result will be shown here");
        // now the text field
        t=new JTextField(20);
        // now both the buttons.
        check=new JButton("Check Password");
        reset=new JButton("Reset");
        // at last we assign all the components created
        // above to the frame with the help of add() method.
        f.add(l);
        f.add(t);
        f.add(check);
        f.add(reset);
        f.add(answer);

        // now we define the action listener to add the
        // action on check button.
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // using getText() method we fetch content
                // entered on the textfield.
                String password=t.getText();
                // now we call the passwordValidator() method
                // which is defined below.
                String result=passwordValidator(password);
                // the result fetched, will be displayed on the screen
                // on the answer label.
                // with the help of setText() method we set that result
                // we fetched.
                answer.setText(result);
                // we change the color of the resultant on the screen
                // using setForeground() method.
                answer.setForeground(Color.red);
            }
        });
        // now we define the action listener to add the
        // action on reset button.
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // thsi button sets the content on the screen as it
                // was earlier.
                t.setText("");
                answer.setText("Result will be shown here");
                answer.setForeground(Color.black);
            }
        });
        f.setSize(700,100);
        f.setLayout(new FlowLayout());
        //f.pack();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // passwordValidator() method
    // this method validates the given password and returns
    // results accordingly.
    public static String passwordValidator(String password){
        // we have three things in a password
        // digits, symbols and letters.
        // so below variables store the count of each
        // of them.
        int digits=0;
        int symbols=0;
        int letters=0;
        // result string store the final result in the given
        // format in the question.
        String result="The password '"+password+"' is a ";
        // now we traverse the password string and store the
        // count each character in there respective type.
        // we have used Character class methods to check
        // if a character is a digit or is a letter,
        // according to that we increment each counter.
        for(int i=0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                digits++;
            }
            else if(Character.isLetter(password.charAt(i))){
                letters++;
            }
            else{
                symbols++;
            }
        }
        // now as the conditions metioned in the question
        // we finalize the result.
        // if the password length is less than 8 than it
        // automatically falls in week password section.
        // and if the password length is greater than or equal to 8
        // than it falls in strong password section.
        if(password.length()<8){
            // if count of digits is equal to password length
            // than the password contains only digits.
            // and if count of letters is equal to password length
            // than the password contains only letters.
            if(digits==password.length()){
                result+="very weak password";
            }
            else if(letters==password.length()){
                result+="weak password";
            }
        }
        else{
            // if counter of each variable is greater than 0,
            // that means the password is the strongest.
            if(letters!=0 && digits!=0 && symbols!=0){
                result+="very strong password";
            }
            else if(letters!=0 && digits!=0){
                result+="strong password";
            }

        }
        return result;
    }
}


