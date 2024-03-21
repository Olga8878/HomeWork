package Dop8;


public class Patient {

    private TreatmentPlan plan;
    private Doctor doctor;

    public Patient(TreatmentPlan plan) {
        this.plan = plan;
    }

    public void assignDoctor() {
        if (plan.getTreatmentCode() == 1) {
            doctor = new Surgeon();
        } else if (plan.getTreatmentCode() == 2) {
            doctor = new Dantist();
        } else {
            doctor = new Therapist();
        }
        doctor.heal();

    }
}



