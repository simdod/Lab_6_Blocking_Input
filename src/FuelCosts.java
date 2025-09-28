import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, price = 0;
        boolean done;
        String trash;
        done = false;
        do
        {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        done = false;
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble())
            {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        double costPer100Miles = (100.0 / mpg) * price;
        double distanceFullTank = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance car can go on full tank: %.2f miles%n", distanceFullTank);
    }
}
