import java.util.Scanner;

public class OstuniC_Quiz1 {

	public static void main(String[] args){
	
	// create a scanner object
	Scanner input = new Scanner(System.in);
	
	// prompt the user to enter number of touch downs
	System.out.print("Enter number of touchdowns: ");
	// assign users input to "TD"
	double TD = input.nextDouble();
	
	// prompt the user to enter number of total yards
	System.out.print("Enter number of total yards: ");
	// assign users input to "Yards"
	double Yards = input.nextDouble();
	
	// prompt the user to enter number of interceptions
	System.out.print("Enter number of interceptions: ");
	// assign users input to "INT"
	double INT = input.nextDouble();
	
	// prompt the user to enter number of completions
	System.out.print("Enter number of completions: ");
	// assign users input to "Comp"
	double Comp = input.nextDouble();
	
	// prompt the user to enter number of passes attempted
	System.out.print("Enter number of passes attempted: ");
	// assign users input to "ATT"
	double ATT = input.nextDouble();
	
	// there are 4 separate equations that calculate the QB rating
	
	double eq1 = ((Comp / ATT) - .3) * 5;
	double eq2 = ((Yards / ATT) - 3) * .25;
	double eq3 = (TD / ATT) * 20;
	double eq4 = 2.375 - ((INT / ATT) * 25);
	
	// the equation "scorecard" uses the 4 equations from above to
	// calculate the given quarterback's rating
	
	double scorecard = ((eq1 + eq2 + eq3 + eq4) / 6) * 100;
	System.out.println("The quarterback's rating is " + scorecard);
		
	}
	
}
