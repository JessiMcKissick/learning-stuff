import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate wall area
        wallArea = wallHeight * wallWidth;

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output cans of paint, rounding up to the nearest whole can.
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " cans");



        scnr.close();
    }
}
