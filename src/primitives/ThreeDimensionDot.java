package primitives;

public class ThreeDimensionDot extends TwoDimensionDot
{
	protected Coordinate z;

	public ThreeDimensionDot(Coordinate x, Coordinate y, Coordinate z)
	{
		super(x, y);
        this.z= new Coordinate(z);
	}

	public Coordinate getZ() {
		return z;
	}

	public void setZ(Coordinate z) {
		this.z = z;
	}

	@Override
	public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof ThreeDimensionDot)) return false;
	ThreeDimensionDot other = (ThreeDimensionDot)obj;
	return super.equals(other) && z.equals(other.z);
	}

	@Override
	public String toString() {
		return "ThreeDimensionDot [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	

	public Vector vectorSubtract (ThreeDimensionDot tdt)

	{
		Coordinate a = this.getX().subtract(tdt.getX());
		
     	Coordinate b = this.getY().subtract(tdt.getY());
     	
	    Coordinate c = this.getZ().subtract(tdt.getZ());
	    
	    ThreeDimensionDot dot = new ThreeDimensionDot(a,b,c);
	    
	    Vector vec = new Vector(dot);
	    
	    return vec;
}
	
	public ThreeDimensionDot vectorAdd (ThreeDimensionDot tdt)
	{
		
		Coordinate a = tdt.getX().add(this.getX());
		
		Coordinate b =tdt.getY().add(this.getY());
		
		Coordinate c = tdt.getZ().add(this.getZ());
		
		return new ThreeDimensionDot(a,b,c);
	
		
	}
	
	public double pointDistance (ThreeDimensionDot tdt)
	{
		
	    Coordinate a = tdt.getX().subtract(this.getX());
		
		Coordinate b = tdt.getY().subtract(this.getY());
		
		Coordinate c = tdt.getZ().subtract(this.getZ());
		
		Coordinate q=a.multiply(a);
		
		Coordinate w=b.multiply(b);
		
		Coordinate r=c.multiply(c);
		
		Coordinate s=q.add(w);
		
		Coordinate g=s.add(r);
		
		 double d= Math.sqrt(g.get());
		 
		return d;
	}
}
