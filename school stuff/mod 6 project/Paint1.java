import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // Not an error but closed at the end to close leak
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do{
            System.out.print("Enter wall height (feet): ");
            try {
                wallHeight = scnr.nextDouble();
                // Ensures wallHeight is greater than 0 (no negatives or 0s)
                if(wallHeight < 0.0001){
                    System.out.println("Error: Input must be greater than 0.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Incorrect input received.");
            }
            scnr.nextLine(); // Consume any invalid inputs. Will not be reached if input is valid.
        }
        while(true);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do{
            System.out.print("Enter wall width (feet): ");
            try {
                wallWidth = scnr.nextDouble();
                // Ensures wallWidth is greater than 0 (no negatives or 0s)
                if (wallWidth < 0.0001) {
                    System.out.println("Error: Input must be greater than 0.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Incorrect input received.");
            }
            scnr.nextLine(); // Consume any invalid inputs. Will not be reached if input is valid.
        }
        while(true);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea +  " square feet"); 

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");


        scnr.close();
    }

}
