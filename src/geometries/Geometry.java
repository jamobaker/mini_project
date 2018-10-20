package geometries;

import primitives.*;

public abstract class Geometry
{

	public Geometry()
	{
		//pass
	}
	
	
	public abstract Vector getNormal(ThreeDimensionDot tdt);
}
