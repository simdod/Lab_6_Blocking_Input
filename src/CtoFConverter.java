import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        double celsius = 0;
        boolean done = false;
        String trash;

        do {
            System.out.print("Enter temp in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        System.out.println(celsius + " degrees celsius = " + fahrenheit + " degrees fahrenheit");

    }
}