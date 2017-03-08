package bridgeittest;

import java.util.ArrayList;

public class DoctorsInfo {
	Utility u = new Utility();
	String mName,mSpecialization,mAvailability;
	int mId;
	
	DoctorsInfo(){}
	//Parameterised constructor
	public DoctorsInfo(String mName, int mId, String mSpecialization, String mAvailability)
	{
		this.mName = mName;
		this.mId = mId;
		this.mSpecialization = mSpecialization;
		this.mAvailability = mAvailability;
	}
	//displaying info for single doctor
	public void printDoctor(DoctorsInfo d)
	{
		System.out.println("Name : "+d.mName);
		System.out.println("Id : "+d.mId);
		System.out.println("Specialization : "+d.mSpecialization);
		System.out.println("Availability : "+d.mAvailability +"\n");
	}

	//Displaying List of Doctors
	public void listOfDoctors(ArrayList<DoctorsInfo> doctors)
	{
		for(DoctorsInfo info : doctors)
		{
			System.out.println("Name : "+info.mName);
			System.out.println("Id : "+info.mId);
			System.out.println("Specialization : "+info.mSpecialization);
			System.out.println("Availability : "+info.mAvailability +"\n");
		}
	}

	
	//search method for Doctor
	public void searchDoctor(ArrayList<DoctorsInfo> doctors){
		Utility u = new Utility();
		System.out.println("1.Name\n2.Id\n3.Specilization\n4.Availability");
		int choice = u.inputInteger();
		switch(choice){
			case 1:{
				System.out.print("Please enter Name to Search: ");
				String mNameSearch = u.inputString();
				this.searchByName(doctors,mNameSearch);
				break;
			}
			case 2:{
				System.out.print("Please Enter Id: ");
				int mIdSearch = u.inputInteger();
				this.searchById(doctors,mIdSearch);
				break;
			}
			case 3:{
				System.out.print("Please Enter Specilization for search: ");
				String spSearch = u.inputString();
				this.searchBySpecilization(doctors,spSearch);
				break;
			}
			case 4:{
				System.out.print("Please Enter Morning or Evening: ");
				String available = u.inputString();
				this.searchByAvailability(doctors,available);
				break;
			}
			default:{
				System.out.println("Entered Wrong Choice");
			}
		}//end of switch	
	}//end of searchDoctor

	//search by mName
	public void searchByName(ArrayList<DoctorsInfo> doctors,String mName){
		int count=0;
		for(DoctorsInfo doctor : doctors){
			if(mName.equals(doctor.mName)){
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Doctor for given Name not found");
	}

	//searching doctor by mId
	public void searchById(ArrayList<DoctorsInfo> doctors,int mId){
		int count=0;
		for(DoctorsInfo doctor : doctors){
			if(mId == doctor.mId){
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println(" Doctor for given Id not found");

	}

	//searching Doctor by specilization
	public void searchBySpecilization(ArrayList<DoctorsInfo> doctors,String mSpecialization){
		int count=0;
		for(DoctorsInfo doctor : doctors){
			if(mSpecialization.equals(doctor.mSpecialization)){
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Doctor for given Specialization not found");
	}

	//searching Doctor by mAvailability
	public void searchByAvailability(ArrayList<DoctorsInfo> doctors,String mAvailability){
		int count=0;
		for(DoctorsInfo doctor : doctors){
			if(mAvailability.equals(doctor.mAvailability)){
				this.printDoctor(doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Doctor for given Availability not found");
	}

}
