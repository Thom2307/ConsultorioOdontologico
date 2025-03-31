package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Consultorio;
import co.edu.uniquindio.poo.model.Especialidad;
import co.edu.uniquindio.poo.model.Odontologo;
import co.edu.uniquindio.poo.model.Paciente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();

        Odontologo od1 = new Odontologo("OD-001", "Dra. María Pérez", "LP-12345", Especialidad.ORTODONCIA);
        Odontologo od2 = new Odontologo("OD-002", "Dr. Juan Gómez", "LP-54321", Especialidad.ENDODONCIA);
        consultorio.agregarOdontologo(od1);
        consultorio.agregarOdontologo(od2);

        Paciente p1 = new Paciente("HC-001", "Ana López", 30, "555-1234",
                "Calle 123", LocalDate.now(), 3);
        Paciente p2 = new Paciente("HC-002", "Carlos Ruiz", 45, "555-5678",
                "Avenida 456", LocalDate.now(), 7);
        consultorio.agregarPaciente(p1);
        consultorio.agregarPaciente(p2);

        Paciente p2Actualizado = new Paciente(
                p2.getHistoriaClinica(),
                p2.getNombre(),
                p2.getEdad(),
                "555-9999",
                p2.getDireccion(),
                LocalDate.now(),
                p2.getTratamientosRealizados() + 1
        );
        consultorio.actualizarPaciente(p2, p2Actualizado);

        System.out.println("=== Pacientes con más de 5 tratamientos ===");
        for (Paciente p : consultorio.getPacientesConMasDe5Tratamientos()) {
            System.out.println(p);
        }

        System.out.println("\n=== Odontólogos registrados ===");
        for (Odontologo od : consultorio.getOdontologos()) {
            System.out.println(od);
        }
    }
}