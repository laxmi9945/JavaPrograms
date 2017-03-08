package bridgeittest;


import java.util.Date;

public class RegeEx {
	public static void main(String[] args) 
	{
		
		UtilityTest utility=new UtilityTest();
		
		UserInfo userinfo=new UserInfo();
		//String REGEX_name = null;
		//Giving user details as input
		System.out.println("Enter first name");
		userinfo.setfirstname(utility.inputString());
		System.out.println();
		
		System.out.println("Enter last name");
		userinfo.setlastname(utility.inputString());
		System.out.println();
		
		System.out.println("Enter mobile number");
		userinfo.setmobileno(utility.inputString());
		System.out.println();
		
		//System.out.println("Enter date");
		userinfo.setdate(utility.getFormatedDate(new Date()));
		System.out.println(utility.convertString(userinfo,utility.getFileText("/home/bridgeit/workspace/bridgeittest/src/bridgeittest/Regextext")));
		
	}
}

