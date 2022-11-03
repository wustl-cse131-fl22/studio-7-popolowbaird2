package studio7;

public class Fraction {
	private double numerator;
	private double denominator;
	
	
	public Fraction(double num, double denom) {
		numerator = num;
		denominator = denom;
	}
	/**
	 * adds the fractions using sum formula
	 * @param other
	 * @return
	 */
	public String addition(Fraction other) {
		double newNum= (numerator*other.denominator + denominator*other.numerator);
		double newDenom = (denominator * other.denominator);
		return newNum + "/" + newDenom;
	}
	
	/**
	 * multiplies fractions
	 * @param other
	 * @return
	 */
	public String multiplication(Fraction other) {
		double newNum = (numerator*other.numerator);
		double newDenom = (denominator*other.denominator);
		return newNum + "/" + newDenom;
	}
	
	/**
	 * flips numerator and denominator
	 * @return
	 */
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	/**
	 * iterates until no common factors left
	 * @return
	 */
	public String simplify() {
	double numer = numerator;
	double den = denominator;
	int i = 2;
	while(i<= numer && i<=den) {
		if(numer%i == 0 && den%i == 0) {
			numer = numer/i;
			den = den/i;
			i=2;
			}
		i++;
		}
	return numer + "/" + den; 	
	}
	
	public static void main(String[] args) {
		Fraction test = new Fraction(10,5);
		Fraction test1 = new Fraction(2,1);
		System.out.println(test.addition(test1));
		System.out.println(test.multiplication(test1));
		System.out.println(test.reciprocal());
		System.out.println(test.simplify());

	}

}
