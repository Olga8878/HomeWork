package Dop8;


public class Main {
    public static void main(String[] args) {

        TreatmentPlan plan1 = new TreatmentPlan(1);
        Patient patient1 = new Patient(plan1);
        patient1.assignDoctor();
    }
}




