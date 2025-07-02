public class Main {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Alice", 30, 5, 1500.0);
        Patient p2 = new OutPatient("P102", "Bob", 25, 800.0);

        System.out.println(p1.getPatientDetails());
        System.out.println("Bill: " + p1.calculateBill());

        System.out.println(p2.getPatientDetails());
        System.out.println("Bill: " + p2.calculateBill());

        if (p1 instanceof MedicalRecord) {
            ((MedicalRecord)p1).addRecord("InPatient - Surgery Done");
            System.out.println(((MedicalRecord)p1).viewRecords());
        }

        if (p2 instanceof MedicalRecord) {
            ((MedicalRecord)p2).addRecord("OutPatient - Regular Checkup");
            System.out.println(((MedicalRecord)p2).viewRecords());
        }
    }
}