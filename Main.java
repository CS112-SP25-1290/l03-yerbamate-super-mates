import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
  	{
        ArrayList<CaffeinatedBeverage> inventory = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
            System.out.println("Select an option.\n1. Add Tea\n2. Add Yerba Mate\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ounces: ");
                int ounces = scanner.nextInt();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter brew temperature: ");
                int brewTemp = scanner.nextInt();
                inventory.add(new Tea(name, ounces, price, brewTemp));
            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ounces: ");
                int ounces = scanner.nextInt();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter brew temp: ");
                int brewTemp = scanner.nextInt();
                inventory.add(new YerbaMate(name, ounces, price, brewTemp, 0));
            } else if (choice == 3) {
                for (CaffeinatedBeverage beverage : inventory) {
                    System.out.println(beverage);
                }
                System.out.println("Average price: $" + String.format("%.2f", findAveragePrice(inventory)));
                System.out.println("Most expensive Yerba Mate: " + findHighestPricedYerbaMate(inventory));
                break;

            }   }
        } finally {
            scanner.close();
        }
        
    } 
    
    public static double findAveragePrice(ArrayList<CaffeinatedBeverage> inventory) {
        if (inventory.isEmpty()) return 0;
        double total = 0;
        for (CaffeinatedBeverage beverage : inventory) {
            total += beverage.getPrice();
        }
        return total / inventory.size();
    }

    public static YerbaMate findHighestPricedYerbaMate(ArrayList<CaffeinatedBeverage> inventory) {
        YerbaMate highest = null;
        for (CaffeinatedBeverage beverage : inventory) {
            if (beverage instanceof YerbaMate) {
                YerbaMate mate = (YerbaMate) beverage;
                if (highest == null || mate.getPrice() > highest.getPrice()) {
                    highest = mate;
                }
            }
        }
        return highest;
    }
}
