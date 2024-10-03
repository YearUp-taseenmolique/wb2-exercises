package com.pluralsight;
import java.util.*;

public class gameWinner {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){

        String usersInput = userInput("Please enter team names and game score: ");
        String[] lookingForColon = usersInput.split("[:|]");
        String winner = userWinner(lookingForColon);

        System.out.println(winner);

    }


    public static String userInput (String prompt){
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

    public static String userWinner (String[] input) {
        if (input.length > 4 || input.length < 4){
            return "Invalid input. Try again";
        }

        String firstTeam = input[0];
        String secondTeam = input[1];

        int scoreOne = Integer.parseInt(input[2]);
        int scoreTwo = Integer.parseInt(input[3]);

        if (scoreOne > scoreTwo){
            return "Winner: " + firstTeam;
        } else if (scoreOne < scoreTwo) {
            return "Winner: " + secondTeam;
        } else {
            return "It is a tie.";
        }

    }

}
