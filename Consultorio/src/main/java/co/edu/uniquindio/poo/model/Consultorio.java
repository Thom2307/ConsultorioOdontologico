package co.edu.uniquindio.poo.model;


import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private final List<Odontologo> odontologos = new ArrayList<>();
    private final List<Paciente> pacientes = new ArrayList<>();

    public void agregarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    public List<Odontologo> getOdontologos() {
        return new ArrayList<>(odontologos);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void actualizarPaciente(Paciente viejo, Paciente nuevo) {
        int indice = pacientes.indexOf(viejo);
        if (indice != -1) {
            pacientes.set(indice, nuevo);
        }
    }

    public List<Paciente> getPacientesConMasDe5Tratamientos() {
        List<Paciente> resultado = new ArrayList<>();
        for (Paciente p : pacientes) {
            if (p.getTratamientosRealizados() > 5) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Paciente> getTodosPacientes() {
        return new ArrayList<>(pacientes);
    }
}