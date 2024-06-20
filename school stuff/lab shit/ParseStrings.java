import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      while (true) {
         String word1;
         String word2;
         System.out.print("Enter input string: ");
         String userInput = scnr.nextLine();
         System.out.println();
         if(userInput.equalsIgnoreCase("q")){
            break;
         }
         try {
            String[] words = userInput.split(",");
            word1 = words[0].trim();
            word2 = words[1].trim();
            System.out.println("First word: " + word1);
            System.out.println("Second word: " + word2 + "\n\n");
         } catch (Exception e) {
            System.out.println("Error: No comma in string");     
         }


      };
      
      
      return;
   }
}