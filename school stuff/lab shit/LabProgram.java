import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.nextLine();
        FileInputStream studentInfo = new FileInputStream(fileName);
        FileOutputStream outputFile = new FileOutputStream("report.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(studentInfo));
        double averageMidterm1 = 0;
        double averageMidterm2 = 0;
        double averageFinal = 0;
        int n = 0;
        String fileLine;


        while ((fileLine = reader.readLine()) != null) {
            // Collect student name in an admittedly hacky way. I will be studying better ways to do this.
            String name = fileLine.substring(0, fileLine.indexOf("  ")).trim();
            fileLine = fileLine.substring(fileLine.indexOf(" ")).trim();
            name = name + "    " + fileLine.substring(0, fileLine.indexOf("  ")).trim();
            fileLine = fileLine.substring(fileLine.indexOf(" ")).trim();
            // System.out.println(fileLine);

            // Collect and calculate grades
            int grade1;
            int grade2;
            int grade3;
            String gradeLetter;
            String finalString;

            grade1 = Integer.parseInt(fileLine.substring(0, fileLine.indexOf(" ")).trim());
            fileLine = fileLine.substring(fileLine.indexOf(" ")).trim();
            grade2 = Integer.parseInt(fileLine.substring(0, fileLine.indexOf(" ")).trim());
            fileLine = fileLine.substring(fileLine.indexOf(" ")).trim();
            grade3 = Integer.parseInt(fileLine.substring(0).trim());
            int average = (grade1 + grade2 + grade3) / 3;
            if(average >= 90){
                gradeLetter = "A";
            } else if (average < 90 && average >= 80){
                gradeLetter = "B";
            } else if (average < 80 && average >= 70){
                gradeLetter = "C";
            } else if (average < 70 && average >= 60){
                gradeLetter = "D";
            } else {
                gradeLetter = "F";
            }
            finalString = name + "    " + grade1 +"  "+ grade2 +"  "+ grade3 + "  " + gradeLetter;
            System.out.println(finalString);
            averageMidterm1 = (averageMidterm1 + grade1);
            averageMidterm2 = (averageMidterm2 + grade2);
            averageFinal = (averageFinal + grade3);

            n += 1;
            System.out.println();
            
            
            // String updateString = fileLine.replace("_photo.jpg", "_info.txt");
            // System.out.println(updateString);
        }
        averageMidterm1 = averageMidterm1 / n;
        averageMidterm2 = averageMidterm2 / n;
        averageFinal = averageFinal / n;
        System.out.println("Averages: Midterm1 " + averageMidterm1 + ", Midterm2 " + averageMidterm2 + ", Final " + averageFinal);

        
        /*
         * TODO: Compute student grades and exam averages, then output results to a text
         * file here.
         */

        outputFile.close();
        studentInfo.close();
        scnr.close();
    }
}