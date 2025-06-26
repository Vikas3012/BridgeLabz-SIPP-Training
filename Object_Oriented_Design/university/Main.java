package objectmodeling_relationships.university;

public class Main {
	public static void main(String[] args) {
		University gla = new University("GLA University");
		
		Department phy = new Department("Physics");
		Department cse = new Department("CSE");
		
		Faculty profAlice = new Faculty("Alice", "Professor");
        Faculty profBob = new Faculty("Bob", "Associate Professor");
        Faculty profCarol = new Faculty("Carol", "Lecturer");

        cse.assignFaculty(profCarol);
        cse.assignFaculty(profBob);

        phy.assignFaculty(profAlice);
        
        gla.addDepartment(cse);
        gla.addDepartment(phy);
        
        gla.displayUniversityInfo();
        
        // Delete University (composed departments are deleted)
        gla.deleteUniversity();

        // Faculty still exist (aggregation)
        System.out.println("Faculty still exist independently:");
        profAlice.displayInfo();
        profBob.displayInfo();
        profCarol.displayInfo();
	}
}
