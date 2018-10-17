
import java.util.*;

public class CashRegister {

	public static void main(String[] args) {
		
		String i1 = "Pen";
		String i2 = "Pencil";
		String no1 = "PEN35MMR";
		String no2 = "PENC20MM3";
		int a1 = 20;
		int tracker1 = 20;
		int a2 = 20;
		int tracker2 = 20;
		int taken1;
		int taken2;
		double tprice1 = 0.00;
		double tprice2 = 0.00;
		double price1 = 35.00;
		double price2 = 20.00;
		double tax = 0.10;
		double tax1;
		double tax2;
		double tbtax = 0.00;
		double taxamount;
		double total = 0.00;
		boolean qst = true;
		
		Scanner input = new Scanner(System.in);
		
		while (qst==true){
			System.out.println ("The available items are: " + i1 + ",	" + i2);
			System.out.println ("Enter the name of the item to buy: ");
			String rItem = input.next();
			
			if (rItem.equalsIgnoreCase("pen")) {
				while (true) {
					System.out.println(" ");
					System.out.println ("Description of " + i1 + " that we have");
					System.out.println ("Item number: " + no1);
					System.out.println("Selling price per pen:" + price1);
					System.out.println ("Available quantity: " + a1);
					System.out.println(" ");
					System.out.println ("Enter 'Y' to buy this product or ANY KEY to cancel"); //decide which key to use //if used specific key, check else statement related to this
					String what1 = input.next();
					
					if (what1.equalsIgnoreCase("Y")){
						System.out.println(" ");
						System.out.println("How many do you want to buy?");
						int rq1 = input.nextInt();
						
						if (0 <= rq1 && rq1 <= a1) {
							tprice1 = tprice1 + (price1 * rq1);  	// calculation part
							a1 = a1 - rq1; 				// calculation part
							
							System.out.println("Enter 'Y' to continue shopping or ANY KEY to end"); //Decide WHICH KEY/
							String what2 = input.next();
							if (what2.equalsIgnoreCase("Y")){
								//Go to top //redirect to the top of the program.
								break;
							}
							else {
								//Go to the receipt part
								qst = false;
								break;
								
							}
							
						}
						else if (rq1 > a1) {
							System.out.println("Oops! only " + a1 + " items are available.");
							System.out.println("Please select another product or quantity");
							//perhaps redirect user to input rq1 statement
							break;
						}
						else {
							//the program should start over here
							break;
							
						}
					}
					else {
						//Go to the top of the program (Restart)
						break;
						
						
					}
			}
					
				}
			else if (rItem.equalsIgnoreCase("pencil")){
					//pencil part of the program
				//System.out.println("Pencil part of the program - under construction");
				while (true) {
					System.out.println(" ");
					System.out.println ("Description of " + i2 + " that we have");
					System.out.println ("Item number: " + no2);
					System.out.println("Selling price per pencil:" + price2);
					System.out.println ("Available quantity: " + a2);
					System.out.println(" ");
					System.out.println ("Enter 'Y' to buy this product or ANY KEY to cancel"); //decide which key to use //if used specific key, check else statement related to this
					String what4 = input.next();
					
					if (what4.equalsIgnoreCase("Y")){
						System.out.println(" ");
						System.out.println("How many do you want to buy?");
						int rq2 = input.nextInt();
						
						if (0 <= rq2 && rq2 <= a2) {
							tprice2 = tprice2 + (price2 * rq2);  	// calculation part
							a2 = a2 - rq2; 				// calculation part
							
							System.out.println("Enter 'Y' to continue shopping or ANY KEY to end"); //Decide WHICH KEY/
							String what3 = input.next();
							if (what3.equalsIgnoreCase("Y")){
								//Go to top //redirect to the top of the program.
								break;
							}
							else {
								//Go to the receipt part
								qst = false;
								break;
								
							}
							
						}
						else if (rq2 > a2) {
							System.out.println("Oops! only " + a2 + " items are available.");
							System.out.println("Please select another product or quantity");
							//perhaps redirect user to input rq1 statement
							break;
						}
						else {
							//the program should start over here
							break;
							
						}
					}
					else {
						//Go to the top of the program (Restart)
						break;
						
						
					}
			}
					
				}
			else {
					//No ITEM part of the program
				System.out.println(" ");
				System.out.println("We APOLOGIZE! but we do not have that item. :( ");
				System.out.println("Please select from available items.");
				System.out.println(" ");
				System.out.println("Press Y to see and shop available items.");
				String what10 = input.next();
				if (what10.equalsIgnoreCase("y")) {
					continue;
				}
				else {
					qst = false;
					break;
				}
				
				}
			
		}
		
		//final calculation and receipt showing part
		
		tax1 = tprice1*tax;
		tax2 = tprice2*tax;
		
		tbtax = tprice1 + tprice2;
		
		taxamount = tbtax*tax;
		
		total = tbtax + taxamount;
		
		taken1 = tracker1 - a1;
		taken2 = tracker2 - a2;
		
		System.out.println("     ");//just a blank line
		
		if (tprice1 > 0 && tprice2 <= 0) {
			System.out.println("Particulars" + "     " + "Quantity" + "     " + "Amount");
			System.out.println(i1 + "                  " + taken1 + "        " + tprice1);
			System.out.println("Tax" + "                            " + tax1);
			System.out.println("Total" + "                         " + (tax1 + tprice1));
			System.out.println("  ");
			System.out.println("Thanks for visiting us!");
		}
		else if (tprice2 > 0 && tprice1 <= 0) {
			System.out.println("Particulars" + "     " + "Quantity" + "     " + "Amount");
			System.out.println(i2 + "               " + taken2 + "        " + tprice2);
			System.out.println("Tax" + "                            " + tax2);
			System.out.println("Total" + "                         " + (tax2 + tprice2));
			System.out.println("  ");
			System.out.println("Thanks for visiting us!");
		}
		else if (tprice1 > 0 && tprice2 > 0 ){
			System.out.println("Particulars" + "     " + "Quantity" + "     " + "Amount");
			System.out.println(i1 + "                  " + taken1 + "        " + tprice1);
			System.out.println(i2 + "               " + taken2 + "        " + tprice2);
			System.out.println("Total before tax" + "              "+ tbtax);
			System.out.println("Tax" + "                            " + taxamount);
			System.out.println("Total" + "                         " + total);
			System.out.println("  ");
			System.out.println("Thanks for visiting us!");
		}
		else {
			System.out.println("Thanks for visiting us!");
			System.out.println("Please start again to shop with us.");
		}
			
		}
		
	}
	
