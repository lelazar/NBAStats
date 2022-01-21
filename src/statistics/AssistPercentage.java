package statistics;

import java.util.Scanner;

public class AssistPercentage
{
    private static Scanner scanner = new Scanner(System.in);
    private static int AST;
    private static float MP;
    private static float MPTm;
    private static int FGTm;
    private static int FG;

    public static float
    ASTPercentage(int AST, float MP, float MPTm, int FGTm, int FG)
    {
        return 100 * AST / ((MP / (MPTm / 5) * FGTm) - FG);
    }

    public static void
    printASTPercentage()
    {
        System.out.println("Assist percentage is an estimate of the percentage of teammate field goals a player assisted while he was on the floor.\n");
        System.out.print("Number of Assists: ");
        AST = scanner.nextInt();
        System.out.println();
        System.out.print("Minutes Played: ");
        MP = scanner.nextFloat();
        System.out.println();
        System.out.print("Team Minutes Played: ");
        MPTm = scanner.nextFloat();
        System.out.println();
        System.out.print("Team Field Goals Made: ");
        FGTm = scanner.nextInt();
        System.out.println();
        System.out.print("Field Goals Made: ");
        FG = scanner.nextInt();
        System.out.println("Assist Percentage of the Player: " + ASTPercentage(AST, MP, MPTm, FGTm, FG) + "%");
    }
}







