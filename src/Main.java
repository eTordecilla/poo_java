import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        /*
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Elkin Tordecilla";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
         */

        //showMenu();

        Doctor myDoctor = new Doctor("Elkin", "Cirugía");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
        /*System.out.println();
        System.out.println();
        Patient patient = new Patient("Lina Hernandez", "lina@mail.com");
        Patient patient2 = new Patient("Maria", "e@e.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
         */

        /*
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());
         */

    }
}
