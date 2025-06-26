package objectmodeling_relationships.hospital;

public class Main {
	public static void main(String[] args) {
		Hospital myHospital = new Hospital("ABC Hospital");
		
		// Create Doctors
        Doctor drSmith = new Doctor("Smith", "Cardiology");
        Doctor drJane = new Doctor("Jane", "Neurology");
        
        //Create Patients
        Patient patientJohn = new Patient("John", 45);
        Patient patientEmily = new Patient("Emily", 30);
        
        myHospital.addDoctor(drJane);
        myHospital.addDoctor(drSmith);
        
        myHospital.addPatient(patientEmily);
        myHospital.addPatient(patientJohn);
        
        drSmith.consult(patientEmily);
        drSmith.consult(patientJohn);
        drJane.consult(patientEmily);
        
        drJane.showPatients();
        drSmith.showPatients();
        
        patientEmily.showDoctors();
        patientJohn.showDoctors();
        
        myHospital.displayHospitalInfo();

        
	}
}
