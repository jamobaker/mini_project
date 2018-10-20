package primitives;

public class Vector
{
	protected ThreeDimensionDot head;
	// ***************** Constructors ********************** //
	protected Vector(ThreeDimensionDot head) {
		super();
		this.head = head;
	}
	// ***************** Getters/Setters ********************** //
	protected ThreeDimensionDot getHead() {
		return head;
	}
	protected void setHead(ThreeDimensionDot head) {
		this.head = head;
	}
	//הוספת וקטור
	public Vector addVector(Vector v)
	{
		ThreeDimensionDot a = this.head;
		ThreeDimensionDot b = v.getHead();
		ThreeDimensionDot c = a.vectorAdd(b);
		return new Vector(c);
	}
	//חיסור וקטור
	public Vector subVector(Vector v)
	{
		ThreeDimensionDot a = this.head;
		ThreeDimensionDot b = v.getHead();
		Vector c = a.vectorSubtract(b);
		return c;
	}
	//הכפלת וקטור בסקלר ולא מכפלה וקטורית
	public Vector multVector(double scalar)
	{
		Coordinate a = this.head.x.scale(scalar);
		Coordinate b = this.head.y.scale(scalar);
		Coordinate c = this.head.z.scale(scalar);
		ThreeDimensionDot dot = new ThreeDimensionDot(a,b,c);
		return new Vector(dot);
	}
	//מכפלה סקלרית
	public double saclarianProduct(Vector v)
	{
		return (this.head.x._coord*v.getHead().x._coord+this.head.y._coord*v.getHead().y._coord+this.head.y._coord*v.getHead().y._coord);
	}
	//מכפלה וקטורית
	public Vector vectorianProduct(Vector v)
	{
		Coordinate a = (this.head.y.multiply(v.getHead().z));
		Coordinate b = (this.head.z.multiply(v.getHead().y));
		a = a.subtract(b);
		Coordinate c = (this.head.z.multiply(v.getHead().x));
		Coordinate d = (this.head.x.multiply(v.getHead().z));
		c = c.subtract(d);
		Coordinate e = (this.head.x.multiply(v.getHead().y));
		Coordinate f = (this.head.y.multiply(v.getHead().x));
		e = e.subtract(f);
		ThreeDimensionDot dot = new ThreeDimensionDot(a,c,e);
		return new Vector(dot);
	}
	//אורך הוקטור
	public double length()
	{
		double a = this.head.x._coord*this.head.x._coord;
		double b = this.head.y._coord*this.head.y._coord;
		double c = this.head.z._coord*this.head.z._coord;
		double d = a + b + c;
		double len = Math.pow(d,0.5);
		return len;
	}
	//נרמול הוקטור
	public Vector normalize()
	{
		double a = 1/this.length();
		Vector vec = this.multVector(a);
		return vec;
	}
	//השוואת וקטורית

public boolean equals(Object obj) 

	{

	    if (this == obj) return true;

	    if (obj == null) return false;	

	    if (!(obj instanceof Vector)) return false;

	    Vector other = (Vector)obj;

        return head.equals(other.head);
    }

}

