public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("MH12AB1234", "Sanjay Kumar", "Car");
        Vehicle v2 = new Vehicle("DL04XY9876", "Neha Singh", "Motorcycle");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();

        System.out.println();
        Vehicle.updateRegistrationFee(750.0);

        System.out.println("After updating registration fee:\n");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
    }
}
