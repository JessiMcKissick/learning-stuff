import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;

      // Java switch/case statement
      switch (monthString) {
         case "January":
            monthInt = 1;
            break;
         case "February":
            monthInt = 2;
            break;
         case "March":
            monthInt = 3;
            break;
         case "April":
            monthInt = 4;
            break;
         case "May":
            monthInt = 5;
            break;
         case "June":
            monthInt = 6;
            break;
         case "July":
            monthInt = 7;
            break;
         case "August":
            monthInt = 8;
            break;
         case "September":
            monthInt = 9;
            break;
         case "October":
            monthInt = 10;
            break;
         case "November":
            monthInt = 11;
            break;
         case "December":
            monthInt = 12;
            break;
         default:
            monthInt = 0;
      }

      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      while (true) {
         String userInput = scnr.nextLine();
         if(userInput == "-1"){
            break;
         } else if (userInput.contains(", ")) {
            int index1 = userInput.indexOf(" ");
            int index2 = userInput.indexOf(", ");
            int month = getMonthAsInt(userInput.substring(0, index1));
            if(month != 0){
               System.out.println(month + "/" + userInput.substring(index1 + 1, index2) + "/" + userInput.subSequence(index2 + 2, userInput.length()));
            } else {
               System.out.println("Invalid month.");
            }

         } else {
         }
      }
      scnr.close();
      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m/d/yyyy format
     
   }
}
