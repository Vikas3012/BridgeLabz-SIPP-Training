package objectmodeling_relationships.hospital;

import java.util.ArrayList;

public class Patient {
	private String name;
	private int age;
	private ArrayList<Doctor> doctors;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
		this.doctors = new ArrayList<>();
	}
	
	

	public String getName() {
		return name;
	}
	
	public void addDoctor(Doctor doctor) {
		if(!doctors.contains(doctor)) {
			doctors.add(doctor);
		}
	}
	
    public void showDoctors() {
        System.out.println("Patient " + name + "'s Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
        System.out.println();
    }
}
