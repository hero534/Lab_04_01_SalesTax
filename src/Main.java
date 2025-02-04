import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.00;
        double salesTax = 0.05;
        double totalPrice = 0.00;
            System.out.println("What is the price of your item?");
        itemPrice = in.nextDouble();
        totalPrice = itemPrice * salesTax;
            System.out.println("The sales tax of " + itemPrice + " is " + totalPrice);
    }
}