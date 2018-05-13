import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class PatternMatchingTest {

	@Test
	public void testcase() {
		String template = "<h1>Testing Template 001</h1><p><br/></p><p>This is a sample template</p><p>Deal Number :&nbsp;@deal_number@</p><p>Counterparty :&nbsp;@counterparty@</p><p><br/></p>";
		
		String pattern = "@(\\w+)@";
		
		System.out.println(template);
		System.out.println(template.replaceAll(pattern, "FIELD"));
		
		
		Pattern MY_PATTERN = Pattern.compile(pattern);
		Matcher m = MY_PATTERN.matcher(template);
		while (m.find()) {
		    String s = m.group(1);
		    System.out.println(s);
		    // s now contains "BAR"
		}
		
	}
	
}
