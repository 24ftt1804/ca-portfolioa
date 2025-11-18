import java.util.Scanner;

public class P7_24FTT1804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // //7.1 LoopsLoopsLoops
        // int nums1 = 1;
        // int nums2 = 50;
        
        // System.out.println("Below is generated using while loop:");
        // while (nums1 <= 20) {
        //     System.out.print(nums1 +" ");
        //     nums1++;
        // }
        // System.out.println("\n");

        // System.out.println("Below is generated using do-while loop:");
        // do {
        //     System.out.print(nums2 + " ");
        //     nums2--;
        // } while (nums2 >= 35);
        // System.out.println("\n");

        // System.out.println("Below is generated using for loop:");
        // for (char letter = 'a'; letter <= 'z'; letter++) {
        //     System.out.print(letter +" ");
        // }


        // //7.2 RockPaperScissorLoop
        // String playOrNot;
        // int rounds = 0;
        // int playerScore = 0;
        // int ComScore = 0;
        
        // do {
        //      int comChoice = (int)(Math.random() * 1000) % 3;
        
        // System.out.print("Enter rock (0), paper (1), scissor (2): ");
        // int userChoice = input.nextInt();
        
        // String comWord = "";
        // if (comChoice == 0) comWord = "rock";
        // if (comChoice == 1) comWord = "paper";
        // if (comChoice == 2) comWord = "scissor";
        
        // String userWord = "";
        // if (userChoice == 0) userWord = "rock";
        // if (userChoice == 1) userWord = "paper";
        // if (userChoice == 2) userWord = "scissor";
        
        // System.out.print("The computer is " + comWord + ". You are " + userWord + ". ");
                        
        // if (comChoice == 0 && userChoice == 0) {
        //     System.out.println("It is a draw.");

        // }if (comChoice == 0 && userChoice == 1) {
        //     System.out.println("You win.");
        //     playerScore++;

        // }if (comChoice == 0 && userChoice == 2) {
        //     System.out.println("You lose.");
        //     ComScore++;

        // }if (comChoice == 1 && userChoice == 0) {
        //     System.out.println("You lose.");
        //     ComScore++;

        // } if (comChoice == 1 && userChoice == 1) {
        //     System.out.println("It is a draw.");

        // }if (comChoice == 1 && userChoice == 2) {
        //     System.out.println("You win.");
        //     playerScore++;

        // }if (comChoice == 2 && userChoice == 0) {
        //     System.out.println("You win.");
        //     playerScore++;

        // }if (comChoice == 2 && userChoice == 1) {
        //     System.out.println("You lose.");
        //     ComScore++;

        // }
        // if (comChoice == 2 && userChoice == 2) {
        //     System.out.println("It is a draw.");

        // }
        // rounds++;

        // input.nextLine();
        // System.out.print("\nEnter y to play again: ");
        // playOrNot = input.nextLine();

        // } while(!playOrNot.equalsIgnoreCase("n"));

        // System.out.println("In the total of " +rounds+ " round(s), " + " You scored " +playerScore+ " , Computer Scored " +ComScore);


        // //7.3 CountingNumbers
        // int posCount = 0;
        // int negCount = 0;
        // int total = 0;
        // int numCount = 0;
        
        // System.out.println("Enter an integer, the input ends if it is 0:");
    
        // while (true) {
        //     int number = input.nextInt();
            
        //     if (number == 0) {
        //         break; 

        //     } if (number > 0) {
        //         posCount++;

        //     } else {
        //         negCount++;

        //     }
        //     total += number;
        //     numCount++;
        // }
        
        // if (numCount ==0) {
        //     System.out.println("No number is entered except for 0 to end the program.");

        // }else{
        //     double average = (double) total/numCount;
            
        //     System.out.println("The number of positive is " +posCount);
        //     System.out.println("The number of negatives is " +negCount);
        //     System.out.println("The total is " +total);

        //     System.out.printf("The average is %.2f\n", average);
        // }


        // //7.4 FibonacciNumber
        // System.out.print("Please enter the term : ");
        // int term = input.nextInt();
        
        // if (term<0) {
        //     System.out.println("Please enter a non-negative term.");

        // }else if(term ==0) {
        //     System.out.println("At term 0 the number is 0");

        // }else if (term ==1) {
        //     System.out.println("At term 1 the number is 1");

        // }else {
        //     int f0 = 0;
        //     int f1 = 1;
        //     int fCurrent = 0;
        //     for (int i =2; i<= term; i++){
        //         fCurrent = f0 + f1;
        //         f0 = f1;
        //         f1 = fCurrent;
        //     }
        //     System.out.println("At term " +term+ " the number is " + fCurrent);
            
        // }


        //7.5 OccurenceOfMaxNumbers
        System.out.println("Enter numbers, the input end with 0 entered: ");
        int largest = Integer.MIN_VALUE;

        int occCount = 0;
        int num;

        while(true) {
            num= input.nextInt();

            if(num == 0){
                break;

            } if(num>largest) {
                largest = num;
                occCount = 1;

            } else if (num == largest) {
                occCount++;
            }
        }

        if (largest != Integer.MIN_VALUE) {
            System.out.println("The largest number is " +largest);
            System.out.println("The occurence count of the largest number is  "+occCount);

        } else {
            System.out.println("No numbers were entered");
        }
    }
}
