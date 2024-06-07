package com.example.robot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public abstract class RobotSteps extends Application {
    public static void main(String[] args) {

        System.out.println("This code will help us to known the coordinates of a Robot that will move a N number of steps  ");
        System.out.println("The conditions for the move of Robot are: ");
        System.out.println("→ The robot starts at coordinate (0, 0).");
        System.out.println("→ The first steps are taken on the '+y' axis)");
        System.out.println("→ The robot has a failure in its programming: every time it finishes a sequence of steps it turns 90 degrees to the left.");
        System.out.println();
        System.out.println("Now enter the steps you want (Each number must be separated by a comma)");

        Scanner scanner = new Scanner(System.in);
        String inputSteps = scanner.nextLine();
        String[] stepsString = inputSteps.split(",");
        int[] NumberOfSteps = new int[stepsString.length];

        for (int i = 0; i < stepsString.length; i++) {
            NumberOfSteps[i] = Integer.parseInt(stepsString[i]);
        }

        int x = 0;
        int y = 0;
        int directionOfRobot = 0;

        for (int i = 0; i < NumberOfSteps.length; i++) {
            switch (directionOfRobot) {
                case 0:
                    y += NumberOfSteps[i];
                    break;
                case 1:
                    x -= NumberOfSteps[i];
                    break;
                case 2:
                    y -= NumberOfSteps[i];
                    break;
                case 3:
                    x += NumberOfSteps[i];
                    break;
            }
            directionOfRobot = (directionOfRobot + 1) % 4;
        }

        System.out.println("The Robot is locate in this coordinates: (x: " + x + ", y: " + y + ")");
        System.out.println();
        System.out.println("Thanks for using :)");
    }
}