package primitives;

public class Ray
{
	protected Vector direction;
	protected ThreeDimensionDot POO;
	public Ray(Vector direction, ThreeDimensionDot pOO) {
		super();
		this.direction = direction;
		POO = pOO;
	}
	public boolean equals(Object obj) 

	{

	    if (this == obj) return true;

	    if (obj == null) return false;	

	    if (!(obj instanceof Ray)) return false;

	    Ray other = (Ray)obj;

        return direction.equals(other.direction) && POO.equals(other.POO);
    }
}