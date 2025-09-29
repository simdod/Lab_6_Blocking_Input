import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean done;
        String trash;

        done = false;
        do
        {
            System.out.print("Enter width of rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        done = false;
        do
        {
            System.out.print("Enter height of rectangle: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal: %.2f%n", diagonal);
    }
}

