package bridgeittest;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UtilityTest {
	BufferedReader bufferedreader;
	final String REGEX_name = "<<name>>";
	final String REGEX_fullname = "<<full name>>";
	final String REGEX_mobilenumber = "xxxxxxxxxx";
	final String REGEX_date = "01/12/2017";
	String message="";
	public UtilityTest() {
		bufferedreader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String convertString(UserInfo userinfo, String message) {
		
		Pattern pattern = Pattern.compile(REGEX_name);
		Matcher matcher=pattern.matcher(message);
		message = matcher.replaceAll(userinfo.getfirstname());

		pattern = Pattern.compile(REGEX_fullname);
		matcher = pattern.matcher(message);
		message = matcher.replaceAll(userinfo.getfirstname() + " " + userinfo.getlastname());

		pattern = Pattern.compile(REGEX_mobilenumber);
		matcher = pattern.matcher(message);
		message = matcher.replaceAll(userinfo.mobileno());

		pattern = Pattern.compile(REGEX_date);
		matcher = pattern.matcher(message);
		//System.out.println(userinfo.Date());
		message =matcher.replaceAll(userinfo.Date());
		
		return message;
	}

	// read String input
	public String inputString() {
		try {
			return bufferedreader.readLine();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return " ";
	}

	// read integer input
	public int inputInteger() {
		try {
			try {
				return Integer.parseInt(bufferedreader.readLine());
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("e");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		return 0;
	}
	
	// date object in this format 01/12/2017
	public String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
		
	}

	
	

	// Taking file name input and return message of file text
	public String getFileText(String Regextext){
		try {

			bufferedreader = new BufferedReader(new FileReader(Regextext));
			StringBuilder sb = new StringBuilder();
			String line = bufferedreader.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = bufferedreader.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	

	}
}
