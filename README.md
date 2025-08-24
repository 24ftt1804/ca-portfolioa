# ca-portfolioa[Task.java](https://github.com/user-attachments/files/21957704/Task.java)

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name");
        String name = input.nextLine();

        System.out.println("Enter price for item 1");
        double item1 = input.nextDouble();
        System.out.println("Enter quantity for item 1");
        int quantity1 = input.nextInt();

        System.out.println("Enter price for item 2");
        double item2 = input.nextDouble();
        System.out.println("Enter quantity for item 2");
        int quantity2 = input.nextInt();

        System.out.println("Enter price for item 3");
        double item3 = input.nextDouble();
        System.out.println("Enter quantity for item 3");
        int quantity3 = input.nextInt();

        input.nextLine();
        System.out.println("Do you have member? ");
        String member = input.nextLine();

        double subtotal = (quantity1*item1) + (quantity2*item2) + (quantity3*item3);

        if(member.equalsIgnoreCase("y")){
            System.out.println("You entitled 10% discount ");
            double discountAmount = subtotal*0.10;
            double finalTotal = subtotal-discountAmount;
            System.out.println("You entitled 10% discount ");
        } else {
            double finalTotal = subtotal;
            
        }
        if(name.equalsIgnoreCase("binti")){
            System.out.println("Dayang "+name);
        }
        else if(name.equalsIgnoreCase("bin")){
            System.out.println("Awang "+name);
        }

        System.out.println("Sub total: "+ subtotal);
        String finalTotal = null;
        System.out.println("Final total: "+ finalTotal);
        System.out.println("Thank you shopping with us Awang/Dayang "+name);

        


    
    }
}
