package triangle;

import java.util.Scanner;

public class TypesOfTriangles {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option = 1;

		while (option == 1) {
			System.out.println("*********** Welcome ***********");
			System.out.println("Enter value first side:");
			float side1 = sc.nextFloat();
			System.out.println("Enter value second side:");
			float side2 = sc.nextFloat();
			System.out.println("Enter value third side:");
			float side3 = sc.nextFloat();

			if (side1 <= side2 + side3 && side2 <= side1 + side3 && side3 <= side1 + side2) {

				if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
					System.out.println("Invalid value");
				} else if (side1 == side2 && side2 == side3) {
					System.out.println("Equilateral triangle");
				} else if (side1 != side2 && side2 != side3 && side3 != side1) {
					System.out.println("Scalene triangle");
				} else if (side1 + side2 == side3 || side2 + side3 == side1) {
					System.out.println("Degenerate triangle");
				} else if (side1 == side2 || side1 == side3 || side2 == side3) {
					System.out.println("Isosceles triangle");
				}

			} else {
				System.out.println("The values entered do not form a triangle");
			}
			
			System.out.println("**********************");
			System.out.println("Continue? 1 - yes, 2 - no");
			System.out.println("Choice the option:");
			option = sc.nextInt();
		}

		System.out.println("Bye");

	}

}
