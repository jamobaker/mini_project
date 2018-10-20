package geometries;
import primitives.*;
public class Tube extends Cylinder
{
	protected double height;

	public Tube(int _radius, ThreeDimensionDot axisPoint, Vector axisDirection, double height)
	{
		super(_radius, axisPoint, axisDirection);
		this.height = height;
	}

	protected double getHeight()
	{
		return height;
	}

	protected void setHeight(double height)
	{
		this.height = height;
	}
	
}
