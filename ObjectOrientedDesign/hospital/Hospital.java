package objectmodeling_relationships.hospital;

import java.util.ArrayList;

public class Hospital {
	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	public Hospital(String name) {
		this.name = name;
		this.patients = new ArrayList<>();
		this.doctors = new ArrayList<>();
	}
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	public void displayHospitalInfo() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
        System.out.println();
    }
}
