package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Triangle;

public class Main{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int option = 1;

            try{
                while (option == 1) {
                    System.out.println("*********** Welcome ***********");
                    System.out.println("Enter value first side:");
                    float side1 = sc.nextFloat();
                    System.out.println("Enter value second side:");
                    float side2 = sc.nextFloat();
                    System.out.println("Enter value third side:");
                    float side3 = sc.nextFloat();

                    Triangle triangle = new Triangle(side1, side2, side3);
                    triangle.typeOfTriangle();			
                    System.out.println("**********************");
                    System.out.println("Continue? 1 - yes, 2 - no");
                    System.out.println("Choice the option:");
                    option = sc.nextInt();
                }

                System.out.println("Bye");
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input");
            }

        
    } 
}
