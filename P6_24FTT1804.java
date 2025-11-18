import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P6_24FTT1804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // //6.1 RockPaperScissors
        // int comChoice = (int)(Math.random()*1000)%3;
        // System.out.println("Enter rock (0), paper (1), scissor (2): ");
        // int userChoice = input.nextInt();
        
        // String comWord = "";
        // if (comChoice == 0) comWord = "rock";
        // if (comChoice == 1) comWord = "paper";
        // if (comChoice == 2) comWord = "scissor";
        
        // String userWord = "";
        // if (userChoice== 0) userWord ="rock";
        // if (userChoice== 1) userWord ="paper";
        // if (userChoice== 2) userWord ="scissor";
        
        // System.out.print("The computer is " +comWord+ ". You are " +userWord+ ". ");
                        
        // if (comChoice== 0 && userChoice== 0) {
        //     System.out.println("It is a draw.");

        // } if (comChoice == 0 && userChoice == 1) {
        //     System.out.println("You win.");

        // } if (comChoice == 0 && userChoice == 2) {
        //     System.out.println("You lose.");

        // } if (comChoice == 1 && userChoice == 0) {
        //     System.out.println("You lose.");

        // } if (comChoice == 1 && userChoice == 1) {
        //     System.out.println("It is a draw.");

        // } if (comChoice == 1 && userChoice == 2) {
        //     System.out.println("You win.");

        // } if (comChoice == 2 && userChoice == 0) {
        //     System.out.println("You win.");

        // } if (comChoice == 2 && userChoice == 1) {
        //     System.out.println("You lose.");

        // } if (comChoice == 2 && userChoice == 2) {
        //     System.out.println("It is a draw.");
        // }


        // //6.2 AddFourNumber
        // int num1 = (int)(Math.random() *100);
        // int num2 = (int)(Math.random() *100);
        // int num3 = (int)(Math.random() *100);
        // int num4 = (int)(Math.random() *100);
        // int totalSum = num1+num2+num3+num4;

        // System.out.println("What is " +num1+ " + " +num2+ " + " +num3+ " + " +num4+ " ? ");
        // int answer = input.nextInt();

        // if(totalSum==answer){
        //     System.out.println("Well done, you are correct!");

        // } else {
        //     System.out.println("Nice try, the sum should be " + totalSum);
        // }


        // //6.3 SimpleLoginValidation
        // String username = "Ahmad Ali";
        // String password = "12345";

        // LocalTime now = LocalTime.now();

        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        // String time = now.format(dtf); 

        // System.out.println("Please enter your username: ");
        // String userInput = input.nextLine();
        // System.out.println("Please enter the password: ");
        // String passInput = input.nextLine();

        // if(!userInput.equals(username))  {
        //     System.out.println("Error: Invalid Username.");

        // } if (!password.equals(passInput)) {
        //     System.out.println("Error: Password does not match.");

        // } else if (userInput.equals(username) && password.equals(passInput)) {
        //     System.out.println("Welcome, " +userInput+ ". "+"The time is now " +time);
        // }


        // //6.4 GuessBirthMonth

        // int monthSet = 0;
        
        // //Binary digit 1
        // System.out.println("Is your birth month in Set 1?");
        // System.out.println("1 3 5 7 9 11");
        // System.out.print("Enter 0 for No and 1 for Yes: ");
        // int ans1 = input.nextInt();
        // if (ans1 ==1) {
        //     monthSet += 1;
        // }
        
        // //Binary digit 2
        // System.out.println("Is your birth month in Set 2?");
        // System.out.println("2 3 6 7 10 11");
        // System.out.print("Enter 0 for No and 1 for Yes: ");
        // int ans2 = input.nextInt();
        // if (ans2 ==1) {
        //     monthSet +=2;
        // }
        
        // //Binary digit 4 
        // System.out.println("Is your birth month in Set 3?");
        // System.out.println("4 5 6 7 12");
        // System.out.print("Enter 0 for No and 1 for Yes: ");
        // int ans3 = input.nextInt();
        // if (ans3 == 1) {
        //     monthSet +=4;
        // }
        
        // //Binary digit 8 
        // System.out.println("Is your birth month in Set 4?");
        // System.out.println("8 9 10 11 12");
        // System.out.print("Enter 0 for No and 1 for Yes: ");
        // int ans4 = input.nextInt();
        // if (ans4 ==1) {
        //     monthSet +=8; 
        // }
        
        // //Determine month
        // String monthName = "";
        // switch (monthSet) {
        //     case 1: monthName = "January"; 
        //         break;
        //     case 2: monthName = "February"; 
        //         break;
        //     case 3: monthName = "March"; 
        //     break;
        //     case 4: monthName = "April"; 
        //         break;
        //     case 5: monthName = "May"; 
        //         break;
        //     case 6: monthName = "June"; 
        //         break;
        //     case 7: monthName = "July"; 
        //         break;
        //     case 8: monthName = "August"; 
        //         break;
        //     case 9: monthName = "September"; 
        //         break;
        //     case 10: monthName = "October"; 
        //         break;
        //     case 11: monthName = "November"; 
        //         break;
        //     case 12: monthName = "December"; 
        //         break;
        //     default: monthName = "unknown";
        //         break;
        // }

        // System.out.println("You are born in " +monthName);


        //6.5 SimpleCalculatorUsingSwitch
        System.out.print("Enter an arithmetic expression: ");
        int num1 = input.nextInt();
        String operator = input.next();
        int num2 = input.nextInt();
        
        switch (operator) {
            case "+":
                System.out.println("The sum is "+(num1 + num2));
                break;
            case "-":
              System.out.println("The subraction is "+(num1 - num2));
              break;
            case "*":
                System.out.println("The multiplication is "+(num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                   System.out.println("Math error: The divisor cannot be Zero");
                } else {
                    System.out.println("The division is "+((double)num1 / num2));

                }
                break;
            default:
            System.out.println("Invalid operator.");
        }
    }
}
