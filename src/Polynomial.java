import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * @author Morgan Williams
 */
public class Polynomial {
	
	// variable declarations 
	private ArrayList<Term> polynomial;
	private String functionName;

    /**
	 * Creates a new Polynomial object with no terms
	 */
	public Polynomial(){
		polynomial = new ArrayList<Term>();
	}
	
	  /**
	    * Inserts a new term into a Polynomial
	    */
	public void insert(int q, int p){
		System.out.println("Insert function called");
		
		Term temp = new Term(q,p);
		
		polynomial.add(temp);

		for(int i = 0; i < polynomial.size(); i++){
			if(p > polynomial.get(i).getExponent()){
				//use collections swap to switch elements
				Collections.swap(polynomial, polynomial.size()-1, i);
			    break;
			}
		}	
	}
	
	public void GetInputFromFile(){
		
		try {
			Scanner in = new Scanner(new File(System.getProperty("user.dir") + "/src/infile.txt"));
			
			String input = new String();
		    String[] i;
		    
			input = in.nextLine();
			i = input.split(",");
			
			//set the equation head to function name
			functionName = i[0];
			
			// creates the equation 
			for(int z = 1; z < i.length; z+=2 ){
				insert(Integer.parseInt(i[z]), Integer.parseInt(i[z+1])); 
				product();
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 /**
	    * Deletes the first occurrence of a term from a Polynomial
	    * Prints an appropriate message if the term does not appear in the Polynomial
	    */
	
	public void delete(int q, int p){
		System.out.println("Delete function called.");
		
		for(Term a : polynomial){
			if(a.getCoefficient() == q)
				if (a.getExponent() == p){
					polynomial.remove(a);
					break;
				}		
		}	
	}
	
	
	/**
	    * Reverses the order of the terms of a Polynomial.
	    */
	public void reverse(){
		System.out.println("Reverse function called.");
		Collections.reverse(polynomial);
	}
	
	
	/**
	    * Returns a polynomial as a String in this form: 3x^2 + 7x^3 + 2x^5
	    */
	
	public void product(){
		
		System.out.println("Product function called.");
		System.out.print(functionName+ " = ");
		
		for(int x = 0; x < polynomial.size(); x++){
			
			if((x+1) == polynomial.size() || x==0)
				System.out.print(polynomial.get(x).toString());
			
			else if(polynomial.get(x).getCoefficient() > 0)
				System.out.print("+" + polynomial.get(x).toString());
			
			else
				System.out.print(polynomial.get(x).toString());
		}
		
		System.out.print("\n");
	
	}
}
