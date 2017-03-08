
public class Palin {

		public static void main(String[] args) {

			// INITIALIZATION
			String Input;
			int i, j, Length, Flag = 0;
			Utility u = new Utility();

			// INPUT THE STRING
			System.out.print("enter string: ");
			Input = u.inputString();

			// CALCULATING THE LENGTH OF STRING
			Length = Input.length();

			// STRING CONVERTED TO ARRAY
			char[] ArrayString = Input.toCharArray();

			// COMPUTATION
			for (i = 0, j = Length - 1; i < j; i++, j--) {
				if (ArrayString[i] == ArrayString[j])
					Flag = 0;
				else {
					Flag = 1;
					break;
				}
			}

			if (Flag == 0)
				System.out.println("The given string is a PALINDROME");
			else
				System.out.println("The given string is NOT a PALINDROME");
		}
	}

