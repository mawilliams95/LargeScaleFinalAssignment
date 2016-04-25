import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Polynomial expression = new Polynomial();
		expression.GetInputFromFile();
		
		int userSelection=0;
		do{ //prompt user to add entry
			System.out.println("Enter 1 to add an entry to the polynomial and press enter");
			//prompt user to delete entry
			System.out.println("Enter 2 to delete an entry from the polynomial and press enter.");
			//prompt user to change entry
			System.out.println("Enter 3 to reverse the polynomial and press enter.");
			//prompt user to print the Phone Directory
			System.out.println("Enter 4 to print the polynomial and press enter.");
			//prompt user to exit the program
			System.out.println("Enter 0 to exit the program and press enter.");
			
			Scanner in = new Scanner(System.in);
			int coefficient, exponent;
			userSelection = in.nextInt();
			in.nextLine();
			
			switch(userSelection){
			//add an entry
			case 1:
				System.out.println("Enter the coefficient of the entry.");
				coefficient = in.nextInt();
				System.out.println("Enter the exponent of the entry.");
				exponent = in.nextInt();
				expression.insert(coefficient, exponent);
				break;
			//delete an entry
			case 2: 
				System.out.println("Enter the coefficient of the entry.");
				coefficient = in.nextInt();
				System.out.println("Enter the exponent of the entry.");
				exponent = in.nextInt();
				expression.delete(coefficient, exponent);
				break;
			//reverse the polynomial
			case 3: 
				expression.reverse();
				break;
			////print the Polynomial
			case 4: 
				expression.product();
				break;
				   
			default:
				break;
			}
			
		   }while(userSelection != 0);	   
		
	}
}
