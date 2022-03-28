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

	// Metacharacters
	public void metacharactersExample()
	{
		System.out.println("public void metacharactersExample()");
		int count = 0;

		// pipe - Find a match for any one of the patterns separated by '|'
		Pattern ptrn_pipe = Pattern.compile("cat|dog|donkey", Pattern.CASE_INSENSITIVE);
		Matcher mchr_pipe = ptrn_pipe.matcher("MyNameIsUdaranameAbeyrathne");
		boolean foundPattern = mchr_pipe.find();

		if(foundPattern)
		{
			System.out.println("Found match Pipe (Without 'udara') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Pipe (Without 'udara') - " + foundPattern);
		}

		ptrn_pipe = Pattern.compile("cat|dog|donkey|udara", Pattern.CASE_INSENSITIVE);
		mchr_pipe = ptrn_pipe.matcher("MyNameIsUdaranameAbeyrathne");
		foundPattern = mchr_pipe.find();

		if(foundPattern)
		{
			System.out.println("Found match Pipe (With 'udara') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Pipe (With 'udara') - " + foundPattern);
		}

		// .(dot) - Find just one instance of any character
		Pattern ptrn_dot = Pattern.compile(".i");
		Matcher mchr_dot = ptrn_dot.matcher("MyNameIsUdaranameAbeyrathne");
		foundPattern = mchr_dot.find();

		if(foundPattern)
		{
			System.out.println("Found match Dot ('.i') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Dot ('.i') - " + foundPattern);
		}

		ptrn_dot = Pattern.compile(".I");
		mchr_dot = ptrn_dot.matcher("MyNameIsUdaranameAbeyrathne");
		foundPattern = mchr_dot.find();

		if(foundPattern)
		{
			System.out.println("Found match Dot ('.I') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Dot ('.I') - " + foundPattern);
		}

		// ^ (caret) - Finds a match as the beginning of a string
		Pattern ptrn_caret = Pattern.compile("^Name");
		Matcher mchr_caret = ptrn_caret.matcher("MyNameIsUdaranameAbeyrathne");
		foundPattern = mchr_caret.find();

		if(foundPattern)
		{
			System.out.println("Found match Caret ('MyNameIsUdaranameAbeyrathne') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Caret ('MyNameIsUdaranameAbeyrathne') - " + foundPattern);
		}

		ptrn_caret = Pattern.compile("^");
		mchr_caret = ptrn_caret.matcher("My Name Is Udaraname Abeyrathne");
		foundPattern = mchr_caret.find();

		if(foundPattern)
		{
			System.out.println("Found match Caret ('My Name Is Udara name Abeyrathne') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Caret ('My Name Is Udaraname Abeyrathne') - " + foundPattern);
		}

		// $ (dollar) - Finds a match at the end of the string
		Pattern ptrn_dollar = Pattern.compile("Name$");
		Matcher mchr_dollar = ptrn_dollar.matcher("My NameIs Udaraname");
		foundPattern = mchr_dollar.find();

		if(foundPattern)
		{
			System.out.println("Found match Dollar ('My NameIs Udaraname') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Dollar ('My NameIs Udaraname') - " + foundPattern);
		}

		ptrn_dollar = Pattern.compile("Name$");
		mchr_dollar = ptrn_dollar.matcher("MyName");
		foundPattern = mchr_dollar.find();

		if(foundPattern)
		{
			System.out.println("Found match Dollar ('MyName') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find Dollar ('MyName') - " + foundPattern);
		}

		// \d - Finds digit
		Pattern ptrn_digit = Pattern.compile("\\d 5");
		Matcher mchr_digit = ptrn_digit.matcher("My NameIs Udaraname");
		foundPattern = mchr_digit.find();

		if(foundPattern)
		{
			System.out.println("Found match \\d 5 ('My NameIs Udaraname') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find \\d 5 ('My NameIs Udaraname') - " + foundPattern);
		}

		ptrn_digit = Pattern.compile("\\d 5");
		mchr_digit = ptrn_digit.matcher("My 5 5 NameIs Udara 5 5 name");
		foundPattern = mchr_digit.find();

		if(foundPattern)
		{
			System.out.println("Found match \\d 5 ('My 5 NameIs Udara 5 name') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find \\d 5 ('My 5 NameIs Udara 5 name') - " + foundPattern);
		}

		while(mchr_digit.find())
		{
			count++;
		}

		if(count == 0)
		{
			System.out.println("0 matches for \\d 5");
		}
		else
		{
			System.out.println(count + " matches for \\d 5");
			count = 0;
		}

		// \s - Find a whitespace character
		Pattern ptrn_ws = Pattern.compile("\\s");
		Matcher mchr_ws = ptrn_ws.matcher("MyNameIsUdaranameAbeyrathne");
		foundPattern = mchr_ws.find();

		if(foundPattern)
		{
			System.out.println("Found match \\s ('MyNameIsUdaranameAbeyrathne') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find \\s ('MyNameIsUdaranameAbeyrathne') - " + foundPattern);
		}


		ptrn_ws = Pattern.compile("\\s");
		mchr_ws = ptrn_ws.matcher("My Name Is Udara name Abeyrathne");
		foundPattern = mchr_ws.find();

		if(foundPattern)
		{
			System.out.println("Found match \\s ('My Name Is Udara name Abeyrathne') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find \\s ('My Name Is Udara name Abeyrathne') - " + foundPattern);
		}

		while(mchr_ws.find())
		{
			count++;
		}

		if(count == 0)
		{
			System.out.println("0 matches for \\s");
		}
		else
		{
			System.out.println(count + " matches for \\s");
			count = 0;
		}

		// \\u - Find the Unicode character specified by the hexadecimal number xxxx
		Pattern ptrn_hex = Pattern.compile("\\uFFFF");
		Matcher mchr_hex = ptrn_hex.matcher("My Name Is Udara name Abeyrathne");
		foundPattern = mchr_hex.find();

		if(foundPattern)
		{
			System.out.println("Found match \\u ('My Name Is Udara name Abeyrathne') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find \\u ('My Name Is Udara name Abeyrathne') - " + foundPattern);
		}

		ptrn_hex = Pattern.compile("\\uFFFF");
		mchr_hex = ptrn_hex.matcher("My Name \\uFFFF Is Udara \\uFFFF name Abeyrathne \\uFFFF");
		foundPattern = mchr_hex.find();

		if(foundPattern)
		{
			System.out.println("Found match \\u ('My Name \\uFFFF Is Udara name Abeyrathne \\uFFFF') - " + foundPattern);
		}
		else
		{
			System.out.println("Can't find \\u ('My Name \\uFFFF Is Udara name Abeyrathne \\uFFFF') - " + foundPattern);
		}

		while(mchr_ws.find())
		{
			count++;
		}

		if(count == 0)
		{
			System.out.println("0 matches for \\s");
		}
		else
		{
			System.out.println(count + " matches for \\s");
			count = 0;
		}
	}
}