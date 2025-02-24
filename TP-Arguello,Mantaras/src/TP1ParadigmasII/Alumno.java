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
import java.util.Random;

public class Alumno {
    private final String nombre;
    private final String DNI;
    private final String Correo;
    private final int Legajo;
    private Carrera carrera;
    private final ArrayList<MateriaCursada> materiasCursando;
    private final ArrayList<MateriaCursada> materiasFinalizadas; // Nueva lista para materias finalizadas

    public Alumno(String nombre, String DNI, String Correo) {  
        this.nombre = nombre;
        this.DNI = DNI;
        this.Correo = Correo;
        this.materiasCursando = new ArrayList<>();
        this.materiasFinalizadas = new ArrayList<>();
        this.Legajo = GenerarLegajo();
    }

    public String getNombre() {
        return nombre;
    }
 
    public String getDNI() {
        return DNI;
    }

    public String getCorreo() {
        return Correo;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    
    public int getLegajo() {
        return Legajo;
    }

    private int GenerarLegajo() {
        Random random = new Random();
        // Genera un número aleatorio entre 10000 y 99999 (ajusta el rango según tus necesidades)
        return 10000 + random.nextInt(90000);
    }
    
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void inscribirMateria(Materia materia) {
        if (materia != null && !estaInscritoEn(materia)) {
            materiasCursando.add(new MateriaCursada(materia));
        }
    }

    public boolean estaInscritoEn(Materia materia) {
        for (MateriaCursada mc : materiasCursando) {
            if (mc.getMateria().equals(materia)) {
                return true;
            }
        }
        return false;
    }

    public MateriaCursada buscarMateriaCursada(Materia materia) {
        for (MateriaCursada mc : materiasCursando) {
            if (mc.getMateria().equals(materia)) {
                return mc;
            }
        }
        return null;
    }

    public ArrayList<MateriaCursada> getMateriasCursando() {
        return materiasCursando;
    }

    public void finalizarMateria(MateriaCursada materiaCursada) {
        if (materiasCursando.remove(materiaCursada)) {
            materiasFinalizadas.add(materiaCursada);
        }
    }

    public ArrayList<MateriaCursada> getMateriasFinalizadas() {
        return materiasFinalizadas;
    }

    @Override
    public String toString() {
        // Construimos la lista de nombres de materias
        StringBuilder materiasInscritas = new StringBuilder();
        for (MateriaCursada materiaCursada : materiasCursando) {
            materiasInscritas.append(materiaCursada.getMateria().getNombre()).append(", ");
        }

        // Si el alumno no está inscrito en ninguna materia
        if (materiasInscritas.length() == 0) {
            materiasInscritas.append("No inscrito en ninguna materia");
        } else {
            // Eliminar la última coma y espacio sobrantes
            materiasInscritas.setLength(materiasInscritas.length() - 2);
        }

        return "Alumno: " + nombre +
               ", Carrera: " + (carrera != null ? carrera.getNombre() : "No inscrito en ninguna carrera") +
               ", Legajo: " + Legajo +
               ", Materias Cursando: " + materiasInscritas.toString();
        
    }

}
