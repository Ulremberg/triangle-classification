package entities;

public class Triangle {

    private Float side1;
    private Float side2;
    private Float side3;

    public Triangle(){

    }

    public Triangle(float side1, float side2, float side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Float getSide1() {
		return side1;
	}

	public void setSide1(Float side1) {
		this.side1 = side1;
    }
    
    public Float getSide2() {
		return side2;
	}

	public void setSide2(Float side2) {
		this.side2 = side2;
    }
    
    public Float getSide3() {
		return side3;
	}

	public void setSide3(Float side3) {
		this.side3 = side3;
	}
    
    public void typeOfTriangle(){
        if (side1 <= side2 + side3 && side2 <= side1 + side3 && side3 <= side1 + side2) {

            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                System.out.println("Invalid value");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles triangle");
            } else if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 != side2 && side2 != side3 && side3 != side1) {
                System.out.println("Scalene triangle");
            } else if (side1 + side2 == side3 || side2 + side3 == side1) {
                System.out.println("Degenerate triangle");
            }

        }
        else {
            System.out.println("The values entered do not form a triangle");
        }
            
    }

}
