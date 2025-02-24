/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1ParadigmasII;

/**
 *
 * @author kiara
 */


public class MateriaCursada {
    private Materia materia;
    private int inasistencias;
    private String Estado;

    public MateriaCursada(Materia materia) {
        this.materia = materia;
        this.Estado = ""; // Estado inicial vacío
        this.inasistencias = 0;
    }

    public Materia getMateria() {
        return materia;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        this.inasistencias = inasistencias;
    }
   
    @Override
    public String toString() {
        return "Materia: " + materia.getNombre() +
               ", Condicion: " + Estado +
               ", Inasistencias: " + inasistencias; 
    }
}
