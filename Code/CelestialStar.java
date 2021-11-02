public class CelestialStar implements Comparable
{
	private String starName;
	private int distanceFromEarth;//measured in light years
	private String constellation;
	private char navigationalStar;
	
	public CelestialStar()
	{
		this("", 0, "",'~');
	}
	
	public CelestialStar(String name,int distance,String conste, char navigational)
	{
		setStarName(name);
		setDistanceFromEarth(distance);
		setConstellation(conste);
		setNavigationalStar(navigational);
	}


	public void setStarName(String sn)
	{
		starName = sn;
	}
	
	public void setDistanceFromEarth(int d)
	{
		distanceFromEarth = d;
	}
	
	public void setConstellation(String c)
	{
		constellation = c;
	}
	
	public void setNavigationalStar(char n)
	{
		navigationalStar = n;
	}
	
		
	public String getStarName()
	{
		return starName;
	}
	
	public int getDistanceFromEarth()
	{
		return distanceFromEarth;
	}
	
	public String getConstellation()
	{
		return constellation;
	}
	
	public char getNavigationalStar()
	{
		return navigationalStar;
	}
	
	@Override 
	public String toString() 
	{
		return getStarName() + ", Distance from earth: " + getDistanceFromEarth()+ " light years, Constellation star belongs to: " + getConstellation()+ ", Navigational Star (Y/N): " + getNavigationalStar()+"\n";
	}


	public int compareTo(Object s)
	{
		if (this.getClass().equals(s.getClass()))
		{
			CelestialStar star = (CelestialStar)s;
			if(this.getDistanceFromEarth() == star.getDistanceFromEarth())
				return 0;
			else
				if (this.getDistanceFromEarth() > star.getDistanceFromEarth())
					return -1;
				else
					return 1;
		}
		else
		{
			return this.getClass().getName().compareTo(s.getClass().getName());
		}
	}
}
	
