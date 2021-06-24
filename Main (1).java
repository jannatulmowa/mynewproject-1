/*
 * Name: Jannatul Mowa
 * ID: 201-35-3064
 * Section: B
 */
package controllercricketer;
import CricketerInfos.Cricketer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Player Name: ");
        String crickName = input.nextLine();
        System.out.println("Enter The Player Country: ");
        String crickCountry = input.nextLine();
        System.out.println("Enter The Player Age: ");
        double age = input.nextDouble();
        System.out.println("Enter The Player Number of Runs: ");
        int cricketerRun = input.nextInt();
        System.out.println("Enter The Player Number of Wickets: ");
        int crickWickets = input.nextInt();
        System.out.println("Enter The Player Number of Match: ");
        int crickMatch = input.nextInt();
        System.out.println("======================================================================");
        Cricketer mowa = new Cricketer(crickName,crickCountry,age,cricketerRun,crickWickets,crickMatch);
        mowa.printInfo();
        System.out.println("Are you sure to increase Runs? then enter the increase number of Runs");
        int run = input.nextInt();
        mowa.increaseRuns(run);
        System.out.println("Are you sure to increase Wickets? then enter the increase number of Wickets");
        int wickets = input.nextInt();
        mowa.increaseWickets(wickets);
        System.out.println("Are you sure to increase Match? then enter the increase number of Match");
        int match = input.nextInt();
        mowa.increaseMatch(match);
        mowa.printInfo();
    }
    
}
