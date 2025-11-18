import java.util.Scanner;

public class P3_24FTT1804 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //3.1 ComputeArea
        double base = 4.0;
        double height = 6.0;
        final double pi = 3.14;
        double radius = 8.0;

        double areaOfSquare = base * base;
        double areaOfTriangle = 0.5 * base * height;
        double areaOfCircle = pi * radius * radius;

        System.out.print("The area of square is " + areaOfSquare + "\n" + "The area of triangle is " + areaOfTriangle + 
        "\n" + "The area of circle is " + areaOfCircle);

        // //3.2 ConvertBytesIntoBits
        // System.out.print("Enter the number of byte(s) to be converted: ");
        // int bytes = input.nextInt();
        // int bits = bytes * 8;
        // System.out.println(bytes + " bytes(s) is " + bits + " bits.");

        // //3.3 CharacterToUnicode
        // System.out.print("Enter a character: ");
        // char ch = input.next().charAt(0);
        
        // int unicode = ch;
        // System.out.println( "The Unicode for character " + ch + " is " + unicode);

        // //3.4 NumberOfDurians
        // double Price = 15.75;

        // System.out.println("Each durian cost $15.75");
        // System.out.print("How much money do you have? $");
        // double mon = input.nextDouble();

        // int numDurians = (int)(mon/Price);
        // System.out.println("The number of durian(s) you can buy is " + numDurians);

        // //3.5 Savings
        // System.out.print("What is your target amount? $");
        // double tar = input.nextDouble();

        // System.out.print("How many month(s) to reach your goal? ");
        // int month = input.nextInt();

        // double perDay = tar/(month*30);
        // System.out.printf("The amount you need to save per day is $%.2f" , perDay);

    }
}
