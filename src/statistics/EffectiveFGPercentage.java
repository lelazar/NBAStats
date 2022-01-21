package statistics;

import java.util.Scanner;

public class
EffectiveFGPercentage
{
    private static Scanner scanner = new Scanner(System.in);
    private static int FG;
    private static int _3P;
    private static int FGA;

    private static double
    EFGPercentage(int FG, int _3P, int FGA)
    {
        return (FG + (0.5 * _3P)) / FGA;
    }

    public static void
    printEFGPercentage()
    {
        System.out.println("This statistic adjusts for the fact that a 3-point field goal is worth one more point than a 2-point field goal.\n");
        System.out.print("Field Goals Made: ");
        FG = scanner.nextInt();
        System.out.println();
        System.out.print("3-point Field Goals Made: ");
        _3P = scanner.nextInt();
        System.out.println();
        System.out.print("Field Goal Attempts: ");
        FGA = scanner.nextInt();
        System.out.println();
        System.out.println("Effective Field Goal Percentage of the Player: " + EFGPercentage(FG, _3P, FGA) + "%");
    }
}
