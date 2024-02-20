import java.util.Scanner;
public class Practical_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The full Name: ");
        String name = sc.nextLine();
        printName(name);
        sc.close();
    }
    public static void printName(String name)
    {
        // Trim leading and trailing spaces
        name = name.trim();
       
        // Split the name into first name and last name
        String[] nameParts = name.split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Reformat the name and print it out
        String formattedName = lastName + ", " + firstName;
        System.out.println("Formatted name: " + formattedName);
    }
}
