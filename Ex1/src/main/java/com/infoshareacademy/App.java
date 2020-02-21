package com.infoshareacademy;


import Zadanie1.ZadanieA.ExerciseA;
import Zadanie1.ZadanieB.ExerciseB;
import Zadanie1.ZadanieC.ExerciseC;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Game you would like to play with:");
        System.out.println("Press 1 to play word game");
        System.out.println("Press 2 to play calculator");
        System.out.println("Press 3 to play card game");
        int choice = sc.nextInt();


        switch (choice) {

            case 1:
                ExerciseA exerciseA = new ExerciseA();
                exerciseA.gameA();
                break;
            case 2:
                ExerciseB exerciseB = new ExerciseB();
                exerciseB.gameB();
                break;
            case 3:
                ExerciseC exerciseC = new ExerciseC();
                exerciseC.gameC();
                break;
            default:
                break;

        }
    }
}
