import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class P5_24FTT1804 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // //5.1 WordComparison
        // System.out.print("Enter the first word: ");
        // String word1 = input.nextLine();
        // System.out.print("Enter the second word: ");
        // String word2 = input.nextLine();

        // System.out.print("Are the both words the same?: ");
        // if (word1.equalsIgnoreCase(word2)){
        //     System.out.print("true");
        // } else {
        //     System.out.print("false");
        // }


        // //5.2 Reverse5Letters
        // System.out.print("Enter the 5 letters word: ");
        // String word = input.nextLine();
        // String revWord;

        // if (word.length() != 5) {
        //     System.out.println("Error! please enter exactly 5 word!");

        // } else {
        //     revWord = "";

        //     revWord = revWord + word.charAt(4);
        //     revWord = revWord + word.charAt(3);
        //     revWord = revWord + word.charAt(2);
        //     revWord = revWord + word.charAt(1);
        //     revWord = revWord + word.charAt(0);

        //     System.out.println("The reversed word of " +word+ " is " +revWord);
        // }


        // //5.3 ReplaceSubString
        // System.out.println("Enter your message: ");
        // String message = input.nextLine();

        // System.out.print("\nEnter the substring to replace: ");
        // String replace = input.nextLine();

        // System.out.print("\nEnter the replacement substring: ");
        // String replacement = input.nextLine();

        // String updatedMessage  = message.replace(replace, replacement);

        // System.out.println("\nThe updated message is: \n" +updatedMessage);


        // //5.4 ModuludQuestion
        // File folder = new File("C:\Users\LITE14\Desktop\24ftt1804");
        // if (!folder.exists()) {
        //     folder.mkdir();
        // }

        // File file = new File(folder, "Modulus Questions.txt ");
        // FileWriter writer = new FileWriter(file, true);

        // Random random = new Random();
        // int num1 = random.nextInt(100); 
        // int num2 = random.nextInt(99) +1;

        
        // String question = num1+ " % " +num2+ " = ?\r\n";
        // writer.write(question);
        // writer.close();
        // System.out.println("A new question added.");
        

        //5.5 QueueReceipt
        System.out.print("Enter name: ");
        String name = input.nextLine().toUpperCase();

        File folder = new File("C:\\Users\\LITE14\\Desktop\\24ftt1804");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "QReceipt.txt");
        FileWriter writer = new FileWriter(file);

      
        Random rand = new Random();
        int queueNo = rand.nextInt(900) + 100; // 100 - 999

       
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        
        writer.write("Date & Time: " + dtf.format(now) + "\r\n");
        writer.write("WELCOME " + name + "\r\n");
        writer.write("Your Queue Number: " + queueNo + "\r\n");

        writer.close();

        
        System.out.println("Receipt generated. Thank you.");
        input.close();
    }
}
