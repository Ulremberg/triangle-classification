package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main{ 

   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int option = 1;

            try{
                while (option == 1) {
                    System.out.println("*********** Welcome ***********");
                    System.out.print("Enter value first side: ");
                    float side1 = sc.nextFloat();
                    System.out.print("Enter value second side: ");
                    float side2 = sc.nextFloat();
                    System.out.print("Enter value third side: ");
                    float side3 = sc.nextFloat();

                    Triangle triangle = new Triangle(side1, side2, side3);
                    triangle.typeOfTriangle();			
                    System.out.println("**********************");
                    System.out.println("Continue? 1 - yes, 2 - no");
                    System.out.print("Choice the option: ");
                    option = sc.nextInt();
                }

                System.out.println("Bye");
                sc.close();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input");
            }

        
    } 
}
