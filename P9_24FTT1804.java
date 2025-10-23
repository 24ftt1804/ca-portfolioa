import java.util.Scanner;

public class P9_24FTT1804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        // //9.1 Product Rating
        // int[][] ratings = {
        //     {4, 5, 4},
        //     {3, 5, 3},
        //     {4, 5, 3},
        //     {1, 2, 1}
        // };

        // double[] avgCriteria = new double[3];
        // for (int col = 0; col < 3; col++) {
        //     int sum = 0;
        //     for (int row = 0; row < 4; row++) {
        //         sum += ratings[row][col];
        //     }
        //     avgCriteria[col] = sum / 4.0;
        // }

        // System.out.println("Rating\tProduct\tPackaging\tDelivery");
        // System.out.printf("Average\t%.2f\t%.2f\t%.2f\n\n", avgCriteria[0], avgCriteria[1], avgCriteria[2]);

        // for (int i = 0; i < 4; i++) {
        //     double avg = (ratings[i][0] + ratings[i][1] + ratings[i][2]) / 3.0;
        //     System.out.printf("Customer %d provide the average rating %.2f\n", i + 1, avg);
        // }
        

        // //9.2 Grade MCQ
        

        // char[][] answers = {
        //     {'A', 'B', 'A', 'C', 'C', 'D'},
        //     {'D', 'B', 'A', 'B', 'C', 'A'},
        //     {'E', 'D', 'D', 'A', 'B', 'A'},
        //     {'C', 'B', 'A', 'E', 'D', 'C'}
        // };

        // System.out.println("Enter the key to the MCQ:");
        // char[] key = new char[6];
        // for (int i = 0; i < key.length; i++) {
        //     key[i] = input.next().charAt(0);
        // }

        // for (int i = 0; i < answers.length; i++) {
        //     int correct = 0;
        //     for (int j = 0; j < answers[i].length; j++) {
        //         if (answers[i][j] == key[j]) {
        //             correct++;
        //         }
        //     }

        //     if (correct >= 3)
        //         System.out.println("Student " + i + "'s correct count is " + correct + ". Therefore, he/she passed the test.");
        //     else
        //         System.out.println("Student " + i + "'s correct count is " + correct + ". Therefore, he/she failed the test.");
        // }
        

        
        //9.3 TicTacToe
        

        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        char cpu = 'O';
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player's turn");
            System.out.print("Enter a row (0,1 or 2): ");
            int row = input.nextInt();
            System.out.print("Enter a column (0,1 or 2): ");
            int col = input.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = player;
            } else {
                System.out.println("That spot is already taken!");
                continue;
            }

            if (checkWin(board, player)) {
                printBoard(board);
                System.out.println("Game ended, Player Win");
                break;
            }

            int cpuRow, cpuCol;
            do {
                cpuRow = (int)(Math.random() * 3);
                cpuCol = (int)(Math.random() * 3);
            } while (board[cpuRow][cpuCol] != ' ');

            board[cpuRow][cpuCol] = cpu;

            if (checkWin(board, cpu)) {
                printBoard(board);
                System.out.println("Game ended, CPU Win");
                break;
            }
        }
    }

    
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c\n", board[i][0], board[i][1], board[i][2]);
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }

    
    public static boolean checkWin(char[][] b, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == symbol && b[i][1] == symbol && b[i][2] == symbol) return true;
            if (b[0][i] == symbol && b[1][i] == symbol && b[2][i] == symbol) return true;
        }
        if (b[0][0] == symbol && b[1][1] == symbol && b[2][2] == symbol) return true;
        if (b[0][2] == symbol && b[1][1] == symbol && b[2][0] == symbol) return true;
        return false;
    }
}

