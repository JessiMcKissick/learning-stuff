import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileRefiller {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.nextLine();
        FileInputStream photoText = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(photoText));
        // BufferedWriter writer = new BufferedWriter("ParkPhotos.txt");

        String fileLine;
        while((fileLine = reader.readLine()) != null){
            String updateString = fileLine.replace("_photo.jpg", "_info.txt");
            System.out.println(updateString);
        }


// Whatever, good enough
        reader.close();
        scnr.close();
    }
}
