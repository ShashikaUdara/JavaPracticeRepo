public class EncapsulationClass
{
	public EncapsulationClass(String sSomeVal)
	{
		System.out.println("Constructor - EncapsulationClass(): " + sSomeVal);
	}

	private String sName = "";

	public void setName(String sName)
	{
		this.sName = sName;
	}

	public String getName()
	{
		return this.sName;
	}
}