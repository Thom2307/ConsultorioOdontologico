package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Paciente {

    private final String historiaClinica;
    private final String nombre;
    private final int edad;
    private final String telefono;
    private final String direccion;
    private final LocalDate fechaUltimaConsulta;
    private final int tratamientosRealizados;

    public Paciente(String historiaClinica, String nombre, int edad, String telefono,
                    String direccion, LocalDate fechaUltimaConsulta, int tratamientosRealizados) {
        this.historiaClinica = historiaClinica;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaUltimaConsulta = fechaUltimaConsulta;
        this.tratamientosRealizados = tratamientosRealizados;
    }

    public String getHistoriaClinica() {
        return historiaClinica; }

    public String getNombre() {
        return nombre; }

    public int getEdad() {
        return edad; }

    public String getTelefono() {
        return telefono; }

    public String getDireccion() {
        return direccion; }

    public LocalDate getFechaUltimaConsulta() {
        return fechaUltimaConsulta; }

    public int getTratamientosRealizados() {
        return tratamientosRealizados; }

    @Override
    public String toString() {
        return nombre + " - Tratamientos: " + tratamientosRealizados;
    }
}