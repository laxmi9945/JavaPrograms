package bridgeittest;

import java.util.ArrayList;

public class PatientDetails {
	int Patientid, pAge;
	String pName;
	String MobileNo;

	PatientDetails() {

	}

	PatientDetails(String pName, String MobileNo, int Patientid, int pAge) {
		this.pName = pName;
		this.Patientid = Patientid;
		this.pAge = pAge;
		this.MobileNo = MobileNo;
	}

	public void displayPatient(PatientDetails p) {
		System.out.println("Name:" + p.pName);
		System.out.println("MobileNo:" + p.MobileNo);
		System.out.println("Id:" + p.Patientid);
		System.out.println("Age:" + p.pAge);

	}

	public void listOfPatient(ArrayList<PatientDetails> patient) {
		for (PatientDetails info : patient) {
			System.out.println("Name : " + info.pName);
			System.out.println("Patientid : " + info.Patientid);
			System.out.println("pAge : " + info.pAge);
			System.out.println("MobileNo : " + info.MobileNo + "\n");
		}
	}
	
	public void PatientSearch(ArrayList<PatientDetails> patient) {
		// TODO Auto-generated method stub
		System.out.println("1.Search by pName,2.Search by Patientid,3.Search by pAge,4.Search by MobileNo\n ");
		Utility utility=new Utility();
		int choice = utility.inputInteger();
		switch (choice) 
		{
		case 1:
		{
			System.out.println("Enter the name for search:");
			String pNameSearch = utility.inputString();
			this.searchByName(patient,pNameSearch);
			break;
		}
		case 2:
		{
			System.out.println("Enter the patient id for search:");
			int Patient_Id=utility.inputInteger();
			this.searchById(patient, Patient_Id);
			break;
		}
		case 3:
		{
			System.out.println("Enter the Patient age for search:");
			int Patient_Age=utility.inputInteger();
			this.searchByAge(patient,Patient_Age);
			break;
		}
		case 4:
		{
			System.out.println("Enter the patient MobileNo for search");
			String PMobileNo=utility.inputString();
			this.searchByMobileNo(patient,PMobileNo);
			break;
		}
	}

}

	
	public void searchByName(ArrayList<PatientDetails> patient, String pNameSearch) {
		// TODO Auto-generated method stub
		int count=0;
		for(PatientDetails Patient : patient){
			if(pNameSearch.equals(Patient.pName)){
				this.displayPatient(Patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Entered Name for Doctor is not found");
		else
			System.out.println("Name found");
	}
	public void searchById(ArrayList<PatientDetails> patient,int PId){
		int count=0;
		for(PatientDetails Patient:patient){
			if(PId==Patient.Patientid){
				this.displayPatient(Patient);
				count++;
			}
		}
		if(count==0)
		System.out.println("Patient id not found");
	}
	private void searchByAge(ArrayList<PatientDetails> patient,int PAge) {
		// TODO Auto-generated method stub
		int count=0;
		for(PatientDetails Patient:patient){
			if(PAge==Patient.pAge){
				this.displayPatient(Patient);
				count++;
			}
		}
		if(count==0)
			System.out.println("Patient age not found");
	}
	private void searchByMobileNo(ArrayList<PatientDetails> patient,String pMobileNo) {
		// TODO Auto-generated method stub
		int count=0;
		for( PatientDetails Patient:patient){
			if(pMobileNo.equals(Patient.MobileNo)){
				this.displayPatient(Patient);
				count++;
			}
		}
		if(count==0)
		System.out.println("Patient id not found");
	}

	
}
