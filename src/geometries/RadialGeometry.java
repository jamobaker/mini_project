package geometries;

public abstract class RadialGeometry extends Geometry
{

	protected int _radius;
	
	public RadialGeometry(int _radius) {
		super();
		this._radius = _radius;
		
	}
	
	public int getRadius() {
		
		return this._radius;
	}

public RadialGeometry(RadialGeometry g) 
	{
		this._radius = g._radius;
	}

	
}
