import java.util.Scanner;

public class P8_24FTT1804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //8.1 PrintingAlternatingAlphabet
        String[] letters = new String[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = String.valueOf((char) ('a' + i));
        }

        for (int i = 0, j = 25; i < 26; i++, j--) {
            System.out.print(letters[i]);
            System.out.print(" ");
            System.out.print(letters[j]);
            if (i != 25) System.out.print(" ");
        }

        
        // 8.2 ShiftingElementByInput
        

        // System.out.println("How many numbers are there?\n");
        // int n = input.nextInt();

        // int[] a = new int[n];
        // System.out.println("Enter the " + n + " numbers:\n");
        // for (int i = 0; i < n; i++) {
        //     a[i] = input.nextInt();
        // }

        // System.out.println("Enter number of left shift:\n");
        // int k = input.nextInt();
        // if (n > 0) {
        //     k = k % n;
        // }

        // for (int t = 0; t < k; t++) {
        //     int first = a[0];
        //     for (int i = 0; i < n - 1; i++) {
        //         a[i] = a[i + 1];
        //     }
        //     a[n - 1] = first;
        // }

        // System.out.println("\nThe shifted arrangement is:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i]);
        //     if (i != n - 1) System.out.print(" ");
        // }
        

        
        // //8.3 NumberGuessing
        
        // int[] nums = new int[10];
        // for (int i = 0; i < 10; i++) nums[i] = i;

        // Random r = new Random();
        // for (int i = 9; i > 0; i--) {
        //     int j = r.nextInt(i + 1);
        //     int tmp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = tmp;
        // }

        // int chances = 10;
        // while (chances > 0) {
        //     System.out.println("Guess 4 numbers (no duplicates):\n");
        //     int g1 = input.nextInt();
        //     int g2 = input.nextInt();
        //     int g3 = input.nextInt();
        //     int g4 = input.nextInt();

        //     int score = 0;
        //     if (g1 == nums[0]) score++;
        //     if (g2 == nums[1]) score++;
        //     if (g3 == nums[2]) score++;
        //     if (g4 == nums[3]) score++;

        //     if (score == 4) {
        //         System.out.println("You Won! You got the actual number!");
        //         return;

        //     } else {
        //         chances--;

        //         if (chances == 0) break;
        //         System.out.println("You have scored " + score + " out of 4 numbers. You have " + chances + " chances left!");
        //     }
        // }

        // System.out.println();
        // System.out.println("The actual number is " + nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3] + ". You Lose!");
        

        
        // //8.4 AssigningGrade
        

        // System.out.println("Enter the number of students:\n");
        // int students = input.nextInt();

        // int[] scores = new int[students];
        // char[] grades = new char[students];

        // System.out.println("\nEnter the " + students + " scores\n");
        // int best = -1;
        // for (int i = 0; i < students; i++) {
        //     scores[i] = input.nextInt();
        //     if (scores[i] > best) best = scores[i];
        // }

        // for (int i = 0; i < students; i++) {
        //     if (scores[i] >= best - 10) grades[i] = 'A';
        //     else if (scores[i] >= best - 20) grades[i] = 'B';
        //     else if (scores[i] >= best - 30) grades[i] = 'C';
        //     else if (scores[i] >= best - 40) grades[i] = 'D';
        //     else grades[i] = 'F';
        // }

        // System.out.println();
        // for (int i = 0; i < students; i++) {
        //     System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        // }
        

    
        // //8.5 EliminateDuplicate
        
        // int[] a = new int[10];
        // System.out.print("Enter ten numbers: ");
        // for (int i = 0; i < 10; i++) {
        //     a[i] = input.nextInt();
        // }

        // for (int i = 0; i < 10; i++) {
        //     for (int j = i + 1; j < 10; j++) {
        //         if (a[i] == a[j]) {
        //             a[j] = 0;
        //         }
        //     }
        // }

        // for (int i = 0; i < 9; i++) {
        //     int minIdx = i;
        //     for (int j = i + 1; j < 10; j++) {
        //         if (a[j] < a[minIdx]) minIdx = j;
        //     }
        //     int tmp = a[i];
        //     a[i] = a[minIdx];
        //     a[minIdx] = tmp;
        // }

        // System.out.println();
        // System.out.print("The distinct numbers are: ");
        // boolean first = true;
        // for (int i = 0; i < 10; i++) {
        //     if (a[i] != 0) {
        //         if (!first) System.out.print(" ");
        //         System.out.print(a[i]);
        //         first = false;
        //     }
        // }
        
    }
}

