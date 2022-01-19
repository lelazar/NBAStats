package statistics;

import java.util.Scanner;

public class
BlockPercentage
{
    private BlockPercentage blockPercentage;
    private static Scanner scanner = new Scanner(System.in);
    private static int BLK;
    private static float MPTm;
    private static float MP;
    private static int FGAOpp;
    private static int _3PAOpp;

    public BlockPercentage(BlockPercentage blockPercentage)
    {
        this.blockPercentage = blockPercentage;
    }

    public static float
    BLKPercentage(int BLK, float MPTm, float MP, int FGAOpp, int _3PAOpp)
    {
        return 100 * (BLK * (MPTm / 5)) / (MP * (FGAOpp - _3PAOpp));
    }

    public static void
    printBLKPercentage()
    {
        System.out.println("Block percentage is an estimate of the percentage of opponent two-point field goal attempts blocked by the player while he was on the floor.\n");
        System.out.print("Number of Blocks: ");
        BLK = scanner.nextInt();
        System.out.println();
        System.out.print("Team Minutes Played: ");
        MPTm = scanner.nextFloat();
        System.out.println();
        System.out.print("Minutes Played: ");
        MP = scanner.nextFloat();
        System.out.println();
        System.out.print("Opponent Field Goal Attempts: ");
        FGAOpp = scanner.nextInt();
        System.out.println();
        System.out.print("Opponent 3Pt. Field Goal Attempts: ");
        _3PAOpp = scanner.nextInt();
        System.out.println("Block Percentage of the Player: " + BLKPercentage(BLK, MPTm, MP, FGAOpp, _3PAOpp) + "%");
    }
}
