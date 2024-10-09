// Carlos John Escala
// September 18th 2024
// Lab 8 Looping
// This lab takes user test scores and determines quantities



import java.util.Scanner;

public class Looping
{
    public static void main(String[] args)
    {
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter any number of student test scores, once you're done input -1 ");
            int userEntry = input.nextInt();

            int userEntryCount = 0;
            int finalUserEntry = 0;
            int highestUserEntry = 0;
            int lowestUserEntry = 0;

            if (userEntry >= 0)
            {
                finalUserEntry = userEntry;
                highestUserEntry = userEntry;
                lowestUserEntry = userEntry;
                userEntryCount = 1;
            }
            do
            {
                System.out.print("Enter another test score, if you're done type -1 ");
                userEntry = input.nextInt();
                
                if (userEntry >= 0)
                {
                    finalUserEntry += userEntry;
                    userEntryCount++;
                    if (userEntry > highestUserEntry)
                    {
                        highestUserEntry = userEntry;
                    }
                    if (userEntry < lowestUserEntry)
                    {
                        lowestUserEntry = userEntry;
                    }
                }
            }
            while (userEntry >= 0);
            if (userEntryCount > 0)
            {
                double averageUserEntry = finalUserEntry / userEntryCount;

                System.out.println("\nNumber of scores entered: " + userEntryCount);
                System.out.println("Highest score: " + highestUserEntry);
                System.out.println("Lowest score: " + lowestUserEntry);
                System.out.println("Average score: " + averageUserEntry);
            }
        }
    }
}
