package bridgeittest;

import java.util.ArrayList;

public class PatientsInfo {
	Utility u = new Utility();
	String mName,mMobileNo;
	int mId,mAge;
		PatientsInfo(){}
		public PatientsInfo(String mName,int mId,String mMobileNo,int mAge){
		this.mName = mName;
		this.mId = mId;
		this.mMobileNo = mMobileNo;
		this.mAge = mAge;
	}
	
	//Display Data for One Patient
	public void printPatient(PatientsInfo patient)
	{
		System.out.println("\nPatient's Details are:");
		System.out.println("Name : "+patient.mName);
		System.out.println("ID : "+patient.mId);
		System.out.println("MobileNo : "+patient.mMobileNo);
		System.out.println("age : "+patient.mAge +"\n");
	}

	//Display list of patients
	public void listOfPatients(ArrayList<PatientsInfo> patients){
		for(PatientsInfo info : patients){
			System.out.println("Name : "+info.mName);
			System.out.println("ID : "+info.mId);
			System.out.println("MobileNo : "+info.mMobileNo);
			System.out.println("age : "+info.mAge +"\n");
		}
	}

	//search method for perticular data.
	public void searchPatient(ArrayList<PatientsInfo> patients){
		System.out.println("1.Name\n2.ID\n3.Mobile Number");
		int choice = u.inputInteger();
		switch(choice){
			case 1:{
				System.out.print("Please enter Name to Search: ");
				String nameSearch = u.inputString();
				this.searchByName(patients,nameSearch);
				break;
			}
			case 2:{
				System.out.print("Please Enter ID: ");
				int idSearch = u.inputInteger();
				this.searchById(patients,idSearch);
				break;
			}
			case 3:{
				System.out.print("Please Enter Mobile Number for search: ");
				String spSearch = u.inputString();
				this.searchByNumber(patients,spSearch);
				break;
			}
			default:{
				System.out.println("Entered Wrong Choice");
			}
		}//end of switch	
	}//end of searchPatient

	//Searching for name
	public void searchByName(ArrayList<PatientsInfo> patients,String mName){
		int count=0;
		for(PatientsInfo patient : patients){
			if(mName.equals(patient.mName)){
				this.printPatient(patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Patient for given name not found");
	}//end method

	//searching for id
	public void searchById(ArrayList<PatientsInfo> patients,int id){
		int count = 0;
		for(PatientsInfo patient : patients){
			if(id == patient.mId){
				this.printPatient(patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Patient for given id not found");
	}

	//searching for number
	public void searchByNumber(ArrayList<PatientsInfo> patients, String number){
		int count = 0;
		for(PatientsInfo patient : patients){
			if(number.equals(patient.mMobileNo)){
				this.printPatient(patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry Patient for given number not found");
}
}
