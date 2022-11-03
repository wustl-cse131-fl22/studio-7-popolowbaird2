package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double r, double i) {
		real = r;
		imaginary = i;
	}
/**
 * adds the complex numbers
 * @param other
 * @return
 */
	public String sum(Complex other) {
		return (real + other.real) + " + " + (imaginary + other.imaginary) + "i";	
	}
	
	/**
	 * multiplies the complex numbers
	 * @param other
	 * @return
	 */
	public String multiplication(Complex other) {
		return ((real*other.real)-(imaginary*other.imaginary)) + " + " + ((real*other.imaginary)+(other.real * imaginary)) + "i";
		
	}
	
	public static void main(String[] args) {
		Complex test = new Complex(2,4);
		Complex test1 = new Complex(3,1);
		System.out.println(test.sum(test1));
		System.out.println(test.multiplication(test1));
	}

}
