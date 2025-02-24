/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1ParadigmasII;

/**
 *
 * @author kiara
 */


import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private Coordinador coordinador;
    private String Duracion;
    private String Inscripcion;
    private String Cuota;
    private ArrayList<Materia> materias;
    private ArrayList<Alumno> alumnosInscritos;

    public Carrera(String nombre, Coordinador coordinador, String Duracion, String Inscripcion, String Cuota) {
        this.nombre = nombre;
        this.coordinador = coordinador;
        this.Duracion = Duracion;
        this.Inscripcion = Inscripcion;
        this.Cuota = Cuota;
        this.materias = new ArrayList<>();
        this.alumnosInscritos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    
    public String getDuracion() {
        return Duracion;
    }
    
    public String getInscripcion() {
        return Inscripcion;
    }   

    public String getCuota() {
        return Cuota;
    }

    
    public void addMateria(Materia materia) {
        materias.add(materia);
    }

    public void addAlumno(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }
    
    public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }
    
    @Override
    public String toString() {
        return "Carrera: " + nombre + ", Coordinador: " + coordinador.getNombre();
    }

    Iterable<Alumno> getAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
