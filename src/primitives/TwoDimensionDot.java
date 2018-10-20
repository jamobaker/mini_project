package primitives;

public class TwoDimensionDot  
 {
    protected Coordinate x;
    protected Coordinate y;
    
	public TwoDimensionDot(Coordinate x, Coordinate y) 
	{
		this.x = x;
		this.y = y;
	}

	public Coordinate getX() {
		return x;
	}

	public void setX(Coordinate x) {
		this.x = x;
	}

	public Coordinate getY() {
		return y;
	}

	public void setY(Coordinate y) {
		this.y = y;
	}
    
	@Override
	public boolean equals(Object obj) 
	{
	    if (this == obj) return true;
	    if (obj == null) return false;	
	    if (!(obj instanceof TwoDimensionDot)) return false;
	    TwoDimensionDot other = (TwoDimensionDot)obj;
        return x.equals(other.x) && y.equals(other.y);
    }
	@Override
	public String toString()
	{
		return "TwoDimensionDot [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
 }
 