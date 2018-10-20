package geometries;

import primitives.*;

public class Triangle extends Geometry
{
    protected ThreeDimensionDot a;
    protected ThreeDimensionDot b;
    protected ThreeDimensionDot c;
	
	public Triangle(ThreeDimensionDot a, ThreeDimensionDot b, ThreeDimensionDot c) 
	{
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public ThreeDimensionDot getA()
	{
		return a;
	}


	public ThreeDimensionDot getB()
	{
		return b;
	}


	public ThreeDimensionDot getC() 
	{
		return c;
	}

	@Override
	public Vector getNormal(ThreeDimensionDot tdt)
	{		
		return null;
	}

}
