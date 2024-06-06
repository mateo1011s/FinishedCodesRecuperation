package com.example.fizzbuzznumbers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.math.*;
import java.io.IOException;

public abstract class FizzBuzzNumbers extends Application {
    public static void main(String[] args) {

        System.out.println("These code will print the numbers from 1 to 100 with these conditions: ");
        System.out.println("→ Multiples of 3 will be replaced with the word 'Fizz' ");
        System.out.println("→ Multiples of 5 will be replaced with the word 'Buzz' ");
        System.out.println("→ Multiples of 3 and 5 will be replaced with the word 'FizzBuzz' ");
        System.out.println();
        System.out.println("The numbers are: ");

        int number=0;

        for (number=0;number<=100;number++) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("FizzBuzz");
            }

            else if(number % 3 == 0){
                System.out.println("Fizz");
            }

            else if (number % 5 == 0 ){
                System.out.println("Buzz");                
            }

            else {
                System.out.println(number);
            }
        }
        System.out.println("Thanks for using :)");
    }
}