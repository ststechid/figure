package id.ststech.javabasic.figures;

/**
 * Class Square
 * 
 * @author Ali Irawan
 *
 */
public class Square extends Figure {

	/**
	 * The length
	 */
	private double length;

	/**
	 * The width
	 */
	private double width;

	/**
	 * Create a square
	 * 
	 * @param length length of square
	 * @param width  width of square
	 */
	public Square(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	/**
	 * Get the length
	 * 
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Set the length
	 * 
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Get the width
	 * 
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Set the width
	 * 
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Get the area
	 */
	@Override
	public double getArea() {
		return width * length;
	}

}
