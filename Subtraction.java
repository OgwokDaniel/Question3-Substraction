
package com.mycompany.practice_subtraction;
import java.util.Random;
import java.util.Scanner;

public class Subtraction {
     public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1 = random.nextInt(10); // Random number between 0 and 9
        int number2 = random.nextInt(10); // Random number between 0 and 9
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int studentAnswer = scanner.nextInt();
        int correctAnswer = number1 - number2;
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer);
        }

        scanner.close();
    }
}
