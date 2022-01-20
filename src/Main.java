/* ***************************************************************************************************************************************
* Calculation of some (advanced) NBA statistics from user input.
* Abbreviations:
*   - 3P: 3-Point Field Goals
*   - 3PA: 3-Point Field Goal Attempts
*   - AST: Assists
*   - BLK: Blocks
*   - DRB: Defensive Rebounds
*   - FGA: Field Goal Attempts
*   - FG: Field Goals Made
*   - FT: Free Throws Made
*   - FTA: Free Throw Attempts
*   - MP: Minutes Played
*   - Opp: Opponent
*   - ORB: Offensive Rebounds
*   - PTS: Points
*   - Poss: Possessions
*   - PF: Personal Fouls
*   - STL: Steals
*   - Tm: Team
*   - TO: Turnovers
*   - TRB: Total Rebounds
*
* Formulas:
* Assist Percentage (AST%): 100 * AST / (((MP / (Tm MP / 5)) * Tm FG) - FG)
* Block Percentage (BLK%): 100 * (BLK * (Tm MP / 5)) / (MP * (FGAOpp - 3PAOpp))
* Defensive Rebound Percentage (DRB%): 100 * (DRB * (Tm MP / 5)) / (MP * (Tm DRB + ORBOpp))
* Effective Field Goal Percentage (eFG%): (FG + 0.5 * 3P) / FGA
* Game Score (GmSc): PTS + 0.4 * FG - 0.7 * FGA - 0.4*(FTA - FT) + 0.7 * ORB + 0.3 * DRB + STL + 0.7 * AST + 0.7 * BLK - 0.4 * PF - TO
* Offensive Rebound Percentage (ORB%): 100 * (ORB * (Tm MP / 5)) / (MP * (Tm ORB + DRBOpp))
* Possessions (Poss):
*   - Traditional method: Possession = (0.96 * (FGA + TO)) + (0.44 * (FTA - ORB))
*   - Special method: Possession = 0.5 * ((FGA + 0.4 * FTA - 1.07 * (ORB / (ORB + DRBOpp)) * (FGA - FG) + TO) +
*                                  (FGAOpp + 0.4 * FTAOpp - 1.07 * (ORBOpp / (ORBOpp + DRB)) * (FGAOpp - FGOpp) + TOOpp))
* Turnover Percentage (TO%): 100 * TO / (FGA + 0.44 * FTA + TO)
* True Shooting Percentage (TS%): PTS / (2 * (FGA + 0.44 * FTA))
* Total Rebound Percentage (TRB%): 100 * (TRB * (Tm MP / 5)) / (MP * (Tm TRB + TRBOpp))
* Usage Percentage (Usg%): 100 * ((FGA + 0.44 * FTA + TO) * (Tm MP / 5)) / (MP * (Tm FGA + 0.44 * Tm FTA + Tm TO))
 *************************************************************************************************************************************** */

import statistics.AssistPercentage;
import statistics.BlockPercentage;
import statistics.TotalReboundPercentage;

import java.util.Scanner;

public class
Main
{
    private static boolean isExit = false;
    private static Scanner scanner = new Scanner(System.in);

    public static void
    main(String[] args)
    {
        mainScreen();

        while(!isExit) {
            System.out.print("Your option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AssistPercentage.printASTPercentage();
                    exitMessage();
                    break;
                case 2:
                    BlockPercentage.printBLKPercentage();
                    exitMessage();
                    break;
                case 3:
                    TotalReboundPercentage.printTRBPercentage();
                    exitMessage();
                    break;
                default:
                    assert false : "Invalid option chosen!";
            }
        }
    }

    public static void
    mainScreen()
    {
        System.out.println("==================================================");
        System.out.println("Welcome to the NBA Advanced Statistics Calculator!");
        System.out.println("Please choose one from the below options.");
        System.out.println("1. Assist Percentage");
        System.out.println("2. Block Percentage");
        System.out.println("3. Total Rebound Percentage");
        System.out.println("==================================================");
    }

    public static void
    exitMessage()
    {
        System.out.println("Would you like to check another statistic record (1) or exit the application (2)?");
        System.out.print("Your choice: ");
        int exitChoice = scanner.nextInt();
        switch (exitChoice)
        {
            case 1:
                isExit = false;
                mainScreen();
                break;
            case 2:
                isExit = true;
                break;
            default:
                isExit = true;
                assert false : "Invalid option chosen!";
        }
    }
}















