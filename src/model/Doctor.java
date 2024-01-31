package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //atributos
    /*
    static int id = 0; //Autoincrement
    private String name;
    private String email;
     */
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del model.Doctor asignado es: "+ name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Este nos ayuda a crear la cita e ingresarla en el Array
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Este nos devuelve el array con el total de citas ingresadas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+speciality+ "\nAvailable: "+availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleados del Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: "+date+ "\nTome: "+time;
        }
    }
}
