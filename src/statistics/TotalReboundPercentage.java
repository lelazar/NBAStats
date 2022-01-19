package statistics;

import java.util.Scanner;

public class
TotalReboundPercentage
{
    private TotalReboundPercentage totalReboundPercentage;
    private static Scanner scanner = new Scanner(System.in);
    private static int TRB;
    private static float MPTm;
    private static float MP;
    private static int TRBTm;
    private static int TRBOpp;

    public TotalReboundPercentage(TotalReboundPercentage totalReboundPercentage)
    {
        this.totalReboundPercentage = totalReboundPercentage;
    }

    public static float
    TRBPercentage(int TRB, float MPTm, float MP, int TRBTm, int TRBOpp)
    {
        return 100 * (TRB * (MPTm / 5)) / (MP * (TRBTm + TRBOpp));
    }

    public static void
    printTRBPercentage()
    {
        System.out.println("Total rebound percentage is an estimate of the percentage of available rebounds a player grabbed while he was on the floor.\n");
        System.out.print("Player Total Number of Rebounds: ");
        TRB = scanner.nextInt();
        System.out.println();
        System.out.print("Team Minutes Played: ");
        MPTm = scanner.nextFloat();
        System.out.println();
        System.out.print("Minutes Played: ");
        MP = scanner.nextFloat();
        System.out.println();
        System.out.print("Team Total Rebounds: ");
        TRBTm = scanner.nextInt();
        System.out.println();
        System.out.print("Opponent Total Rebounds: ");
        TRBOpp = scanner.nextInt();
        System.out.println("Total Rebound Percentage of the Player: " + TRBPercentage(TRB, MPTm, MP, TRBTm, TRBOpp) + "%");
    }
}
