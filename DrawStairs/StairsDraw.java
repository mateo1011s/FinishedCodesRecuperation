package com.example.drawstairs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public abstract class StairsDraw extends Application {
    public static void main(String[] args) {

        System.out.println("****** Stairs Drawer ******");
        System.out.println("Please enter how many stairs do you want to graph");
        System.out.println("If the number is positive the staircase will be ascending, if it is negative it will be descending and if it is 0 then will draw '__'");

        Scanner NumberStairs = new Scanner(System.in);
        int numberOfStair= NumberStairs.nextInt();

        if (numberOfStair>0){
            for (int i = numberOfStair; i >= 0; i--) {
                for (int j = 0; j < i ; j++) {
                    System.out.print("  ");
                }
                if (i==numberOfStair) {
                    System.out.println("_");
                }else System.out.println("_|");
            }
        }

        else if (numberOfStair<0){
            for (int i = 0; i >= numberOfStair; i--) {
                for (int j = -1; j >= i ; j--) {
                    System.out.print("  ");
                }
                if (i==0) {
                    System.out.println(" _");
                }   else System.out.println("|_");
            }
        }

        else {
            System.out.println("__");
          }

        System.out.println();
        System.out.println("Thanks for using :)");
    }
}




