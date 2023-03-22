import java.util.Scanner;

class RectangleArea {
    // Define private variables
    private double length, width, area;

    public void calculate(){
        getData();
        computeField();
        fieldDisplay();
    }

    // Use get and set methods to retrieve and modify private values
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(){
        this.width = width;
    }

    // Get inputs from the user
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        scanner.close();
    }

    // Compute area of a rectangle
    public void computeField(){
        area = length * width;
    }

    // Display area
    public void fieldDisplay(){
        System.out.println("\nLength entered: " + length);
        System.out.println("Width entered: " + width);
        System.out.println("Area calculated: " + area);
    }

}
