/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception.example;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExceptionExample  {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = user.nextInt();
        final int Maximumage = 100;
        try {
            if (age < Maximumage) {
                System.out.println("Hello!!!!!");
            } else {
                throw new AgeExeception("Age not allowed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
