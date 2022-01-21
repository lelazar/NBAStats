package statistics;

import java.util.Scanner;

public class
DReboundPercentage
{
    private static Scanner scanner = new Scanner(System.in);
    private static int DRB;
    private static float MPTm;
    private static float MP;
    private static int DRBTm;
    private static int ORBOpp;

    private static float
    DRBPercentage(int DRB, float MPTm, float MP, int DRBTm, int ORBOpp)
    {
        return 100 * ((DRB * (MPTm / 5)) / (MP * (DRBTm + ORBOpp)));
    }

    public static void
    printDRBPercentage()
    {
        System.out.println("Defensive rebound percentage is an estimate of the percentage of available defensive rebounds a player grabbed while he was on the floor.\n");
        System.out.print("Number of Defensive Rebounds: ");
        DRB = scanner.nextInt();
        System.out.println();
        System.out.print("Team Minutes Played: ");
        MPTm = scanner.nextFloat();
        System.out.println();
        System.out.print("Minutes Played: ");
        MP = scanner.nextFloat();
        System.out.println();
        System.out.print("Team Defensive Rebounds: ");
        DRBTm = scanner.nextInt();
        System.out.println();
        System.out.print("Opponent's Offensive Rebounds: ");
        ORBOpp = scanner.nextInt();
        System.out.println("Defensive Rebound Percentage of the Player: " + DRBPercentage(DRB, MPTm, MP, DRBTm, ORBOpp) + "%");
    }
}
