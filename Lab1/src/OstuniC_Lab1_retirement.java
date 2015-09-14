// Caroline Ostuni: CISC 181010

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class OstuniC_Lab1_retirement {

	public static void main(String[] args) {
	
	// create a scanner object
	Scanner input = new Scanner(System.in);
	
	// ask the user for appropriate variables
	
	System.out.print("How many years do you plan to work?: ");
	double work_years = input.nextDouble();
	
	System.out.print("What is your expected percent% average annual return on investment?: ");
	double inv_return = input.nextDouble();
	
		// use range of 0-20% for annual return when in investment mode
		while (inv_return >20 || inv_return < 0) {
			System.out.println("Please enter average annual return on invesment between 0-20%: ");
			inv_return = input.nextDouble();
		}
	// convert the users percent input to a decimal & assign the decimal value to "ann_return"
	double ann_return = inv_return / 100;
	
	
	System.out.print("What is your expected percent% average anual return for retirement?: ");
	double pay_return = input.nextDouble();
	
		// use range 0-3% for annual return when in payback mode
		while (pay_return > 3 || pay_return < 0) {
			System.out.println("Please enter average annual return for retirement between 0-3%: ");
			pay_return = input.nextDouble();
		}
	// convert the users percent input to a decimal & assign the decimal value to "ann_return_retire"
		double ann_return_retire = pay_return / 100;
	
	
	System.out.print("How many years do you plan to be retired for?: ");
	double retire_years = input.nextDouble();
	
	System.out.print("What is your required income?: ");
	double req_income = input.nextDouble();
	
	System.out.print("What is your expected SSI income?: ");
	double SSI = input.nextDouble();
	
	// take the users input and put into proper parts of an equation
	// assign those individual equations to a variable
	
	double r;
	double n;
	double y;
	double p;
	double f;
	boolean t;
	
	r = ann_return_retire / 12;
	n = retire_years * 12;
	y = req_income - SSI;
	f = 0;
	t = false;
	
	// find present value (PV) using the "FinanceLib" calculation for PV
	// assign the calculated answer for the present value to the variable "PV"
	double PV;
	PV = FinanceLib.pv(r, n, y, f, t);
	
	// find what you need to save each month (PMT) using the "FinanceLib" calculation for PMT
	double PMT;
	r = ann_return / 12;
	n = work_years * 12;
	p = 0;
	f = PV;
	t = false;
	
	// assign the calculated answer for how much you need to save to the variable "PMT"
	PMT = FinanceLib.pmt(r, n, p, f, t);
	
	// tell the user how much money they will have to save per month 
	// in order to reach their desired income during retirement.
	
	System.out.printf("You will have to save $%.2f each month to reach your predicted income during retirement.", PMT);
	
	}
}
