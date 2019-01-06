package id.ststech.javabasic.figures;

/**
 * Class circle
 * 
 * @author Ali Irawan
 *
 */
public class Circle extends Figure {

	private double radius;

	/**
	 * Construct a circle with radius
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * Get the radius 
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Set the radius
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Get the area
	 */
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
