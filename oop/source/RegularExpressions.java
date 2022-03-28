import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions
{
	public RegularExpressions()
	{
		System.out.println("Constructor - RegularExpressions");
	}

	public void basicRegEx()
	{
		// defining the pattern in teh Pattern object
		Pattern ptrn = Pattern.compile("name", Pattern.CASE_INSENSITIVE);

		// creating the matcher
		Matcher mchr = ptrn.matcher("My Name Is Udaraname Abeyrathne");

		boolean foundPattern = mchr.find();

		if(foundPattern)
		{
			System.out.println("Found match");
		}
		else
		{
			System.out.println("Can't find");
		}
	}
}