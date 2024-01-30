import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*
        model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "Elkin Tordecilla";
        myDoctor.showName();
        myDoctor.showId();

        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctor.showId();
         */

        //showMenu();

        Doctor myDoctor = new Doctor("Elkin", "elkin@mail.com");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        System.out.println(myDoctor);

        /*
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
         */

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Lina Hernandez", "lina@mail.com");

        System.out.println(patient);

    }
}
