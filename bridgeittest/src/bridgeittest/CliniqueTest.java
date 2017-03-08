package bridgeittest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CliniqueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 0;
		Utility utility=new Utility();
		
		ArrayList<DoctorsDetails> doctor=new ArrayList<DoctorsDetails>();
		ArrayList<PatientDetails> patient=new ArrayList<PatientDetails>();
		
		DoctorsDetails doctor1 = new DoctorsDetails("Dr.Kaal",11,"Dental","Morning");
		DoctorsDetails doctor2 = new DoctorsDetails("Dr.Jackal",22,"Mental","Evening");
		PatientDetails patient1 = new PatientDetails("Monk","9668699333",1,25);
		PatientDetails patient2 = new PatientDetails("Trozan","7978787272",2,30);
		PatientDetails patient3 = new PatientDetails("somes","7377497377",3,35);
		PatientDetails patient4 = new PatientDetails("Itachi","8801979232",4,40);
		PatientDetails patient5 = new PatientDetails("Uchiha","8260006053",5,45);
		
		//Adding Doctors and patients into ArrayList
		doctor.add(doctor1);
		doctor.add(doctor2);
		patient.add(patient1);
		patient.add(patient2);
		patient.add(patient3);
		patient.add(patient4);
		patient.add(patient5);
		
		/*System.out.println(doctor.toString());
		System.out.println(patient.toString());*/
		//Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("-----------Welcome to Bridge Clinic---------");
			System.out.println();
			System.out.println("1.Doctors details");
			System.out.println("2.patient details");
			System.out.println("3.Search Doctor by :");
			System.out.println("4.Search Patient by:");
			System.out.println("5.Appointment");
			System.out.println("6.Display Appointment details: ");
			System.out.println("7.Exit");
			// String name=scanner.nextLine();
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				/*System.out.println("Enter doctor details");
				System.out.println("Enter the Dr's name:");
				String names1[] = new String[2];

				for (int i = 0; i < names1.length; i++) {
					names1[i] = utility.inputString();
				}
				System.out.println("Available Doctors names:");
				for (String i : names1) {
		
					System.out.println("Dr." + i.toUpperCase());
				}
				*/
				System.out.println("List Of Available Doctors:");
				new DoctorsDetails().listOfDoctors(doctor);
				break;

			case 2:
				/*System.out.println("Enter Patient details");
				System.out.println("Enter the Patient name:");
				String names2[] = new String[2];

				for (int i = 0; i < names2.length; i++) {
					names2[i] = utility.inputString();
				}
				System.out.println("Patient's name:");

				for (String i : names2) {
					
					System.out.println("Dr." + i.toUpperCase());
				}
				*/
				System.out.println("List Of Patients:");
				new PatientDetails().listOfPatient(patient);
				break;
				
			case 3:
				System.out.println("Search Doctor By:");
				new DoctorsDetails().DoctorsSearch(doctor);
				break;
			case 4:
				System.out.println("Search Patient By:");
				new PatientDetails().PatientSearch(patient);
				break;
			case 5:
				
				System.out.println("Appointment");
				System.out.println("Enter patients name:");
				String name=utility.inputString();
				System.out.println("Enter patients mobile number:");
				String mobileno=utility.inputString();
				System.out.println("Enter patients Id:");
				int id1=utility.inputInteger();
				PatientDetails pDetails=new PatientDetails();
				
				System.out.println("Enter Doctor's Id:");
				int id2=utility.inputInteger();
				
				break;
				
			case 6:
				System.out.println("Appointment Details");
				break;
			case 7:
				System.out.println("Bye");
				System.exit(0);
				break;
			default:
				System.out.println("You entered wrong choice");
				break;
			}
		} while (ch < 7);
	}
}
