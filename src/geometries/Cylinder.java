package geometries;
import primitives.*;
public class Cylinder extends RadialGeometry 
{
	protected ThreeDimensionDot axisPoint;
	protected Vector axisDirection;
	public Cylinder(int _radius, ThreeDimensionDot axisPoint, Vector axisDirection)
	{
		super(_radius);
		this.axisPoint = axisPoint;
		this.axisDirection = axisDirection;
	}
	
	protected ThreeDimensionDot getAxisPoint() 
	{
		return axisPoint;
	}

	protected void setAxisPoint(ThreeDimensionDot axisPoint) 
	{
		this.axisPoint = axisPoint;
	}

	protected Vector getAxisDirection()
	{
		return axisDirection;
	}

	protected void setAxisDirection(Vector axisDirection)
	{
		this.axisDirection = axisDirection;
	}

	@Override
	public Vector getNormal(ThreeDimensionDot tdt) 
	{
		return null;
	}
}