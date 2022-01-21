package statistics;

import java.util.Scanner;

public class
OReboundPercentage
{
    private static Scanner scanner = new Scanner(System.in);
    private static int ORB;
    private static float MPTm;
    private static float MP;
    private static int ORBTm;
    private static int DRBOpp;

    private static float
    ORBPercentage(int ORB, float MPTm, float MP, int ORBTm, int DRBOpp)
    {
        return 100 * ((ORB * (MPTm / 5)) / (MP * (ORBTm + DRBOpp)));
    }

    public static void
    printORBPercentage()
    {
        System.out.println("Offensive rebound percentage is an estimate of the percentage of available offensive rebounds a player grabbed while he was on the floor.\n");
        System.out.print("Number of Offensive Rebounds: ");
        ORB = scanner.nextInt();
        System.out.println();
        System.out.print("Team Minutes Played: ");
        MPTm = scanner.nextFloat();
        System.out.println();
        System.out.print("Minutes Played: ");
        MP = scanner.nextFloat();
        System.out.println();
        System.out.print("Team Offensive Rebounds: ");
        ORBTm = scanner.nextInt();
        System.out.println();
        System.out.print("Opponent's Defensive Rebounds: ");
        DRBOpp = scanner.nextInt();
        System.out.println("Offensive Rebound Percentage of the Player: " + ORBPercentage(ORB, MPTm, MP, ORBTm, DRBOpp) + "%");
    }
}
