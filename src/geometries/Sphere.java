package geometries;

import primitives.*;

public class Sphere extends RadialGeometry
{
	
    protected ThreeDimensionDot a;

	public Sphere(int _radius, ThreeDimensionDot a)
	{
	super(_radius);
	this.a = a;
    }

	@Override
	public Vector getNormal(ThreeDimensionDot tdt) 
	{
		return null;
	}

	public ThreeDimensionDot getA() {
		return a;
	}
	
}
