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
		System.out.println("public void basicRegEx()");
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

	// Regular Expression Patterns
	public void regularExpressionPatterns()
	{
		System.out.println("public void regularExpressionPatterns()");
		// defining the pattern in teh Pattern object
		Pattern ptrn_checkChars = Pattern.compile("[NIA]", Pattern.CASE_INSENSITIVE);

		// creating the matcher
		Matcher mchr_checkChars = ptrn_checkChars.matcher("My Name Is Udaraname Abeyrathne");

		boolean foundPattern = mchr_checkChars.find();

		if(foundPattern)
		{
			System.out.println("Found match Char - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Char - " + foundPattern);
		}

		Pattern ptrn_num = Pattern.compile("[0-9]");
		Matcher mchr_num = ptrn_num.matcher("My Name Is Udaraname Abeyrathne");
		foundPattern = mchr_num.find();

		if(foundPattern)
		{
			System.out.println("Found match Num - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find NUM - " + foundPattern);
		}

		Pattern ptrn_not = Pattern.compile("[^a-zA-Z]", Pattern.CASE_INSENSITIVE);
		Matcher mchr_not = ptrn_not.matcher("MyNameIsUdaranameAbeyrathne");
		foundPattern = mchr_not.find();

		if(foundPattern)
		{
			System.out.println("Found match ^Not - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find ^Not - " + foundPattern);
		}
	}
}