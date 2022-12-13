package abc.model;


/**
 * To help create a fraction data type
 * @author sriram
 *
 */
public class Fraction {
	
	String numerator;
	String denominator;
	boolean isFraction;
	
	public Fraction() {
		
	}
	
	public Fraction(String numerator, String denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String getNumerator() {
		return numerator;
	}

	public void setNumerator(String numerator) {
		this.numerator = numerator;
	}

	public String getDenominator() {
		return denominator;
	}

	public void setDenominator(String denominator) {
		this.denominator = denominator;
	}
	
	public int convertToInt() {
		return Integer.valueOf(this.numerator)/Integer.valueOf(this.denominator);
	}

}

