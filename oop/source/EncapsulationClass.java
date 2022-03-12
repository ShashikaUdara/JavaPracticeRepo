import java.util.Scanner;

public class EncapsulationClass
{
	public EncapsulationClass(String sSomeVal)
	{
		System.out.println("Constructor - EncapsulationClass(): " + sSomeVal);
	}

	private String sName = "";

	public void setName()
	{
		String sName = inputName();
		this.sName = sName;
	}

	public String getName()
	{
		return this.sName;
	}

	public String inputName()
	{
		Scanner oName = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String sName = oName.nextLine();
		System.out.println("\nYour Name: " + sName);

		return sName;
	}
}