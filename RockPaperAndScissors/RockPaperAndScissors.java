package com.example.rockpaperandscisors;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class RockPaperAndScissors {
    public static void main(String[] args) {

        System.out.println("This code will show us a number of Rock Paper And Scissors matches do you want and show us which player has the most wins ");

        String[] movementOfPlayer = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Please enter the number of matches you want to play:");
        int numMatches = scanner.nextInt();

        int player1Wins = 0;
        int player2Wins = 0;
        int ties = 0;

        for (int i = 0; i < numMatches; i++) {

            System.out.println();
            System.out.println("MATCH NUMBER "+(i+1));

            int randomElementForPlayer1 = random.nextInt(movementOfPlayer.length);
            String player1 = movementOfPlayer[randomElementForPlayer1];
            System.out.println("The player 1 has choose: " + player1);

            int randomElementForPlayer2 = random.nextInt(movementOfPlayer.length);
            String player2 = movementOfPlayer[randomElementForPlayer2];
            System.out.println("The player 2 has choose: " + player2);

            if (player1.equals(player2)) {
                System.out.println("→ It's a tie");
                ties++;
            }
            else if ((player1.equals("Scissors") && player2.equals("Rock")) ||
                    (player1.equals("Paper") && player2.equals("Scissors")) ||
                    (player1.equals("Rock") && player2.equals("Paper"))) {
                System.out.println("→ The player 2 had won");
                player2Wins++;
            }
            else {
                System.out.println("→ The player 1 had won");
                player1Wins++;
            }
        }

        System.out.println();
        System.out.println("THE FINAL RESULT IS:");

        if (player1Wins > player2Wins) {
            System.out.println("→ The player 1 has won more matches and he is the winner");
        } else if (player2Wins > player1Wins) {
            System.out.println("→ The player 2 has won more matches and he is the winner");
        } else {
            System.out.println("It's a Tie between player 1 and player 2");
        }
        System.out.println();
        System.out.println("Thanks for using :)");
    }
}