
import java.util.regex.Pattern;
	import java.util.ArrayList;
	import java.util.Date;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;

	public class Regex {

		public static void main(String[] args) {

			Utility u = new Utility();
			ArrayList<String> MyList = new ArrayList<String>();
			String Input = "", FilePath;

			System.out.print("Enter file path: ");
			FilePath = u.inputString();
			MyList = u.ReadFile(FilePath);

			for (String s : MyList) {
				Input += s + " ";
			}
			System.out.println(Input);

			String FirstName = "abc", PhoneNumber;
			System.out.print("Enter Your Full Name: ");
			String FullName = u.inputString();

			// Taking name and checking the conditions
			boolean CheckName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*", FullName);

			if (CheckName) {
				String name[] = FullName.split(" ");
				FirstName = name[0];
			} else {
				System.out.println("Format is Wrong\nPlease Enter 'Abc Xyz' Format");
				System.exit(0);
			}

			// Taking Phone number and checking the conditions
			System.out.print("Enter Mobile Number: ");
			PhoneNumber = u.inputString();

			boolean CheckNumber = Pattern.matches("[789]{1}\\d{9}", PhoneNumber);

			if (!CheckNumber) {
				System.out.println("Number is incorrect");
				System.exit(0);
			}

			// calculating current date
			DateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String Date = DateFormat.format(new Date());

			Input = Input.replace("<<name>>", FirstName);
			Input = Input.replace("<<full name>>", FullName);
			Input = Input.replace("xxxxxxxxxx", PhoneNumber);
			Input = Input.replace("01/01/2016", Date);

			System.out.println(Input);
		}
	}

