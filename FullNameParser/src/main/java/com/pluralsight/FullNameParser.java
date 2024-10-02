package com.pluralsight;
import java.util.*;

public class FullNameParser {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){

        String fullName = promptForName("What is your full name? ");

        String[] nameParts = fullName.split(" ");

        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (nameParts.length == 2){
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];

        } else {
            System.out.println("Invalid name format, please enter 'first last or 'first middle last'. ");
        }


        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (middleName.isEmpty() ? "None" : middleName));
        System.out.println("Last name: " + lastName);

    }

    public static String promptForName (String prompt){
        System.out.print(prompt);
        return s.nextLine().trim();
    }



}
