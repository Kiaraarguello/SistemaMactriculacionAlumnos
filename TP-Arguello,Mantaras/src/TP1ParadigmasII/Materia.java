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

public class Materia {
    private final String nombre;
    private final String Curso;
    private final String cuatrimestre;
    private final Profesor profesor;
    private final ArrayList<Alumno> alumnosEnMateria;

    public Materia(String nombre, String Curso, String cuatrimestre, Profesor profesor) {
        this.nombre = nombre;
        this.Curso = Curso;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
        this.alumnosEnMateria = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCurso(){
        return Curso;
    }
    
    public String getcuatrimestre() {
        return cuatrimestre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    public ArrayList<Alumno> getalumnosEnMateria() {
        return alumnosEnMateria;
    }
    
    public void addAlumno(Alumno alumno) {
        alumnosEnMateria.add(alumno);
    }
    
    public void imprimirAlumnosInscritos() {
    System.out.println("Materia: " + nombre);
    if (alumnosEnMateria.isEmpty()) {
        System.out.println("No hay alumnos inscritos en esta materia.");
    } else {
        System.out.println("Alumnos inscritos:");
        for (Alumno alumno : alumnosEnMateria) {
            System.out.println(alumno.getNombre() + " - " + alumno.getDNI()); // Suponiendo que Alumno tiene un método getDNI()
        }
    }
}
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Materia: " + nombre + ", Curso: " + Curso + ", Cuatrimestre: " + cuatrimestre +  ", Profesor: " + profesor.getNombre();
    }

    Iterable<Alumno> getAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getCuatrimestre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Iterable<Alumno> getAlumnosEnMateria() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
