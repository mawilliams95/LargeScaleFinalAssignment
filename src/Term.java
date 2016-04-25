
public class Term {

	private int coefficient;
	private int exponent;
	
	public Term(int coefficient, int exponent){
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	
	public int getExponent(){
		return exponent;
	}
	
	public int getCoefficient(){
		return coefficient;
	}
	public String toString(){
		String output;
		if(exponent == 0)
			output = String.valueOf(coefficient) ; 
		else if(exponent == 1)
			output = (coefficient + "x");
		else
			output = (coefficient + "x^" + exponent);

		return output;		
	}
	
	
	
	
}
