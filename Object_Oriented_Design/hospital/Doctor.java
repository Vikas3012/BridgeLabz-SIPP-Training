package objectmodeling_relationships.hospital;

import java.util.ArrayList;

public class Doctor {
	private String name;
	private String specialization;
	private ArrayList<Patient> patients;
	
	public Doctor(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
		this.patients = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void consult(Patient patient) {
		if(!patients.contains(patient)) {
			patients.add(patient);
            patient.addDoctor(this); // mutual association
		}
        System.out.println("Dr. " + name + " is consulting Patient " + patient.getName());
	}
	
	public void showPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for(Patient p : patients) {
            System.out.println("- " + p.getName());
        }
        System.out.println();
	}
}
