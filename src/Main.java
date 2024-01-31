import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

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

        System.out.println("\n"+myDoctor);

        User user = new Doctor("\nElkin", "elkin@gmail.com");
        user.showDataUser();

        User userPatient = new Patient("\nLina", "lina@gmail.com");
        userPatient.showDataUser();

        User user1 = new User("\nDoctor", "doctor@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("\nDoctor");
                System.out.println("Trabaja en el Hospital: Cruz Verde");
                System.out.println("Departamento: de Urología");
            }
        };

        user1.showDataUser();

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
