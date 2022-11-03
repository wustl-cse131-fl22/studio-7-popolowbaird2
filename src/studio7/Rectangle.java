/**
 * 
 */
package studio7;

/**
 * @author apopo
 *
 */
public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	
	/**
	 * finds perimeter
	 * @return
	 */
	public double Perimeter() {
		return 2*width + 2*length;
	}
	
	/**
	 * finds area
	 * @return
	 */
	public double Area() {
		return width*length;
	}
	
	/**
	 * compares area with another rectangle
	 * @param other
	 * @return
	 */
	public boolean smallerArea(Rectangle other) {
		if(this.Area() < other.Area()) {
			return true;
		}
		return false;
	}
	
	/**
	 * finds if the rectangle is square by comparing side lengths
	 * @return
	 */
	public boolean isSquare() {
		if(width==length) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle test = new Rectangle(2,2);
		System.out.println(test.Perimeter());
		System.out.println(test.Area());
		Rectangle comparison = new Rectangle(3,4);
		System.out.println(test.smallerArea(comparison));
		System.out.println(test.isSquare());
		}

}
