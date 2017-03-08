package bridgeittest;

import java.util.ArrayList;

public class DoctorsDetails {
	int Doctor_id;
	String Specialization, dName;
	String Availability;

	DoctorsDetails() {
	}

	DoctorsDetails(String dName, int Doctor_id, String Specialization, String Availability) {
		this.Doctor_id = Doctor_id;
		this.dName = dName;
		this.Specialization = Specialization;
		this.Availability = Availability;
	}

	public void displayDoctor(DoctorsDetails d) {
		System.out.println("Name:" + d.dName);
		System.out.println("Id:" + d.Doctor_id);
		System.out.println("Specialization:" + d.Specialization);
		System.out.println("Availability:" + d.Availability);
	}

	public void listOfDoctors(ArrayList<DoctorsDetails> doctor) {
		for (DoctorsDetails info : doctor) {
			System.out.println("Name : " + info.dName);
			System.out.println("Id : " + info.Doctor_id);
			System.out.println("Specialization : " + info.Specialization);
			System.out.println("Availability : " + info.Availability + "\n");
		}
	}

	public void DoctorsSearch(ArrayList<DoctorsDetails> doctor)
 {
	 System.out.println("1.Search by name,2.Search by Id,3.Search by Specialization,4.Search by Availability\n");

		    Utility utility=new Utility();
			// String name=scanner.nextLine();
			int choice = utility.inputInteger();
			switch (choice) 
			{
			case 1:
			{
				System.out.println("Enter the name to search:");
				String dNameSearch = utility.inputString();
				this.searchByName(doctor,dNameSearch);
				break;
				
			}
			case 2:
			{
				System.out.println("Enter Id to search:");
				int DId=utility.inputInteger();
				this.searchById(doctor,DId);
				break;
			}
			case 3:
			{
				System.out.println("Enter Specialization for search:");
				String SpecializationSearch=utility.inputString();
				this.searchforSpecialization(doctor,SpecializationSearch);
				break;
			}
			case 4:
			{
				System.out.println("Enter search for Availability: ");
				String Availability=utility.inputString();
				this.searchByAvailability(doctor,Availability);
				break;
			}
			}
			
 }

	private void searchByName(ArrayList<DoctorsDetails> doctor, String dName) {
		// TODO Auto-generated method stub
		int count=0;
		for(DoctorsDetails Doctor : doctor){
			if(dName.equals(Doctor.dName)){
				this.displayDoctor(Doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Entered Name for Doctor is not found");
		else
			System.out.println("Name found");
	}

	private void searchById(ArrayList<DoctorsDetails> doctor, int DIdSearch) {
		// TODO Auto-generated method stub
		int count=0;
		for(DoctorsDetails Doctor:doctor){
			if(DIdSearch==Doctor_id){
				this.displayDoctor(Doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Doctor_id not found");
	}
	
	private void searchforSpecialization(ArrayList<DoctorsDetails> doctor, String specializationSearch) {
		// TODO Auto-generated method stub
		int count=0;
		for(DoctorsDetails Doctor:doctor){
			if(specializationSearch.equals(Doctor.Specialization)){
				this.displayDoctor(Doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Specialization not found");
	}

	private void searchByAvailability(ArrayList<DoctorsDetails> doctor, String AvailabilitySearch) {
		// TODO Auto-generated method stub
		int count=0;
		for(DoctorsDetails Doctor:doctor){
			if(AvailabilitySearch.equals(Doctor.Availability)){
				this.displayDoctor(Doctor);
				count++;
			}
		}
		if(count==0)
			System.out.println("Availability not found");
	}

}
