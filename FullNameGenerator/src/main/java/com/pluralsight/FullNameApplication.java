package com.pluralsight;
import java.util.*;

public class FullNameApplication {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String firstName = promptForName("What is your first name? ");
        String middleName = promptForName("What is your middle name? ");
        String lastName = promptForName("What is your last name? ");
        String suffix = promptForName("What is your suffix? ");

        String fullName;

        middleName = (middleName.isBlank()) ? " " : " " + middleName + " ";
        suffix = (suffix.isBlank()) ? "" : ", " + suffix;

        fullName = firstName + middleName + lastName + suffix;

        System.out.print("Hello " + fullName);

    }

    public static String promptForName (String prompt){
        System.out.print(prompt);
        return s.nextLine().trim();
    }


}
