package geometries;
import primitives.*;
public class Plane extends Geometry
{
	protected ThreeDimensionDot q;
	protected Vector pores;
	public Plane(ThreeDimensionDot q, Vector pores) 
	{
		super();
		this.q = q;
		this.pores = pores;
	}
	protected ThreeDimensionDot getQ()
	{
		return q;
	}

	protected void setQ(ThreeDimensionDot q)
	{
		this.q = q;
	}

	protected Vector getPores()
	{
		return pores;
	}

	protected void setPores(Vector pores)
	{
		this.pores = pores;
	}

	@Override
	public Vector getNormal(ThreeDimensionDot tdt)
	{
		return null;
	}
}

