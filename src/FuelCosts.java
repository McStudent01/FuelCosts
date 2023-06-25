import java.util.Scanner;

public class FuelCosts
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double gallons;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallons = scanner.nextDouble();

            if (gallons <= 0)
            {
                System.out.println("The number of gallons must be greater than 0.");
            } else
            {
                break;
            }
        } while (true);

        double milesPerGallon;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            milesPerGallon = scanner.nextDouble();

            if (milesPerGallon <= 0)
            {
                System.out.println("The fuel efficiency must be greater than 0.");
            } else
            {
                break;
            }
        } while (true);

        double pricePerGallon;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = scanner.nextDouble();

            if (pricePerGallon <= 0) {
                System.out.println("The price of gas must be greater than 0.");
            } else
            {
                break;
            }
        } while (true);

        double distance = gallons * milesPerGallon;

        double costPer100Miles = pricePerGallon * 100 / milesPerGallon;

        System.out.printf("The car can go %.2f miles.\n", distance);
        System.out.printf("The cost per 100 miles is $%.2f.\n", costPer100Miles);
    }
}
