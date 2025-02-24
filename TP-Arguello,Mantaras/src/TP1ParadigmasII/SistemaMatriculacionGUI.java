/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1ParadigmasII;

/**
 *
 * @author kiara
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class SistemaMatriculacionGUI extends JFrame {
    private ArrayList<Carrera> carreras = new ArrayList<>(); // Lista de carreras disponibles en el sistema
    private ArrayList<Alumno> alumnos = new ArrayList<>(); // Lista de alumnos registrados en el sistema

    public SistemaMatriculacionGUI() {
        // Configuración básica de la ventana
        setTitle("Sistema de Matriculación"); // Establece el título de la ventana
        setSize(600, 400); // Establece el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura la operación de cierre de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(new GridLayout(0, 1)); // Establece un layout de cuadrícula para los elementos de la ventana

        // Crear Coordinadores y Profesores (ejemplo)
        Coordinador coordinador1 = new Coordinador("Carlos Perez");
        Coordinador coordinador2 = new Coordinador("Maria Lopez");
        Coordinador coordinador3 = new Coordinador("Pedro Rodriguez");
        
        Profesor profesor1 = new Profesor("Juan Garcia");
        Profesor profesor2 = new Profesor("Ana Martinez");
        
        // Se crean instancias de materias y se asocian a los profesores
        Materia materia1Carrera1 = new Materia("Analisis Matematico I", "A", "Primer cuatrimestre", profesor1);
        Materia materia2Carrera1 = new Materia("Programacion I", "B", "Segundo cuatrimestre", profesor2);
        Materia materia3Carrera2 = new Materia("Alimentos I", "B", "Primer cuatrimestre", profesor1);
        Materia materia4Carrera2 = new Materia("Filosofia", "B", "Segundo cuatrimestre", profesor2);
        Materia materia5Carrera3 = new Materia("Modelo y Simulacion", "A", "Primer cuatrimestre", profesor1);
        Materia materia6Carrera3 = new Materia("Historia del Arte", "B", "Segundo cuatrimestre", profesor2);
        Materia materia7Carrera4 = new Materia("Fonoestomatologia", "B", "Segundo cuatrimestre", profesor1);
        Materia materia8Carrera4 = new Materia("Fonacion", "B", "Primer cuatrimestre", profesor2);
        
        // Se crean instancias de carreras y se asocian a los coordinadores
        Carrera carrera1 = new Carrera("Ingenieria en Sistemas", coordinador1, "5 años", "180.000 Pesos", "300.000 Pesos");
        Carrera carrera2 = new Carrera("Lic. en Nutricion", coordinador1, "5 años", "160.000 Pesos", "300.000 Pesos");
        Carrera carrera3 = new Carrera("Lic. Diseño Grafico", coordinador2, "5 años", "150.000 Pesos", "300.000 Pesos");
        Carrera carrera4 = new Carrera("Lic. en Fonoaudiologia", coordinador3, "5 años", "160.000 Pesos", "300.000 Pesos");

        // Asignación de materias a las carreras correspondientes
        carrera1.addMateria(materia1Carrera1);
        carrera1.addMateria(materia2Carrera1);
        carrera2.addMateria(materia3Carrera2);
        carrera2.addMateria(materia4Carrera2);
        carrera3.addMateria(materia5Carrera3);
        carrera3.addMateria(materia6Carrera3);
        carrera4.addMateria(materia7Carrera4);
        carrera4.addMateria(materia8Carrera4);

        // Agregar las carreras a la lista del sistema
        this.carreras.add(carrera1);
        this.carreras.add(carrera2);
        this.carreras.add(carrera3);
        this.carreras.add(carrera4);

        // Crear los botones
        JButton btnMatricularAlumno = new JButton("Matricular alumno a una Carrera");
        JButton btnInscribirMateria = new JButton("Inscribir alumno en una Materia");
        JButton btnCargarSituacionFinal = new JButton("Cargar situación final de Materia");
        JButton btnMostrarAlumnosCarrera = new JButton("Mostrar alumnos de una Carrera y Materia");
        JButton btnMostrarCarreras = new JButton("Mostrar carreras y materias disponibles");
        JButton btnMostrarAlumnosInscritosCarrera = new JButton("Mostrar alumnos inscritos en carreras");
        JButton btnMostrarAlumnosInscritosMateria = new JButton("Mostrar alumnos inscritos en materias");
        JButton btnSalir = new JButton("Salir");

        // Añadir botones al JFrame
        add(btnMatricularAlumno);
        add(btnInscribirMateria);
        add(btnCargarSituacionFinal);
        add(btnMostrarAlumnosCarrera);
        add(btnMostrarCarreras);
        add(btnMostrarAlumnosInscritosCarrera);
        add(btnMostrarAlumnosInscritosMateria);
        add(btnSalir);

        // Configuración de los listeners para cada botón
        btnMatricularAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                matricularAlumno(); // Llama al método para matricular a un alumno en una carrera
            }
        });

        btnInscribirMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inscribirAlumnoEnMateria(); // Llama al método para inscribir a un alumno en una materia
            }
        });

        btnCargarSituacionFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarSituacionFinal(); // Llama al método para cargar la situación final de una materia
            }
        });

        btnMostrarAlumnosCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarAlumnosCarreraMateria(); // Llama al método para mostrar los alumnos de una carrera y materia específica
            }
        });

        btnMostrarCarreras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCarrerasYMaterias(); // Llama al método para mostrar las carreras y materias disponibles
            }
        });

        btnMostrarAlumnosInscritosCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarAlumnosInscritosCarrera(); // Llama al método para mostrar los alumnos inscritos en una carrera
            }
        });

        btnMostrarAlumnosInscritosMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarAlumnosInscritosMateria(); // Llama al método para mostrar los alumnos inscritos en una materia
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra la aplicación cuando se presiona el botón "Salir"
            }
        });
    }


    private void matricularAlumno() {
        String nombreAlumno = JOptionPane.showInputDialog(this, "Ingrese el nombre del alumno:");
        String DNIAlumno = JOptionPane.showInputDialog(this, "Ingrese el DNI del alumno:");
        String CorreoAlumno = JOptionPane.showInputDialog(this, "Ingrese el Correo del alumno:");

        if (nombreAlumno != null && DNIAlumno != null && CorreoAlumno != null) {
            Alumno alumno = new Alumno(nombreAlumno, DNIAlumno, CorreoAlumno);

            Carrera carreraSeleccionadaObj = (Carrera) JOptionPane.showInputDialog(this,
                    "Seleccione una Carrera:",
                    "Carreras",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    carreras.toArray(),
                    carreras.get(0));
            

            if (carreraSeleccionadaObj != null) {
                alumno.setCarrera(carreraSeleccionadaObj);
                carreraSeleccionadaObj.addAlumno(alumno);
                alumnos.add(alumno);
                JOptionPane.showMessageDialog(this, "Alumno matriculado en " + alumno.getCarrera().getNombre());
            } else {
                JOptionPane.showMessageDialog(this, "Selección inválida.");
            }
        }
    }

    private void inscribirAlumnoEnMateria() {
        String nombreAlumnoInscripcion = JOptionPane.showInputDialog(this, "Ingrese el nombre del alumno:");
        Alumno alumnoInscripcion = buscarAlumno(nombreAlumnoInscripcion);

        if (alumnoInscripcion != null && alumnoInscripcion.getCarrera() != null) {
            Carrera carreraAlumno = alumnoInscripcion.getCarrera();
            Materia materiaSeleccionadaObj = (Materia) JOptionPane.showInputDialog(this,
                    "Seleccione una Materia para inscribir:",
                    "Materias",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    carreraAlumno.getMaterias().toArray(),
                    carreraAlumno.getMaterias().get(0));

            if (materiaSeleccionadaObj != null) {
                materiaSeleccionadaObj.addAlumno(alumnoInscripcion);
                alumnoInscripcion.inscribirMateria(materiaSeleccionadaObj);
                JOptionPane.showMessageDialog(this, "Alumno inscrito en " + materiaSeleccionadaObj.getNombre());
            } else {
                JOptionPane.showMessageDialog(this, "Selección inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado o no matriculado en una carrera.");
        }
    }

    private void cargarSituacionFinal() {
        String nombreAlumnoFin = JOptionPane.showInputDialog(this, "Ingrese el nombre del alumno:");
        Alumno alumnoFin = buscarAlumno(nombreAlumnoFin);

        if (alumnoFin != null) {
            MateriaCursada materiaCursada = (MateriaCursada) JOptionPane.showInputDialog(this,
                    "Seleccione la Materia para cargar la situación final:",
                    "Materias Cursadas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    alumnoFin.getMateriasCursando().toArray(),
                    alumnoFin.getMateriasCursando().get(0));

            if (materiaCursada != null) {
                String[] estados = {"Libre", "Regular", "Promocionado"};
                String estadoSeleccionado = (String) JOptionPane.showInputDialog(this,
                        "Seleccione el estado del alumno:",
                        "Estado",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        estados,
                        estados[0]);
                materiaCursada.setEstado(estadoSeleccionado);

                int inasistencias = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la cantidad de inasistencias:"));
                materiaCursada.setInasistencias(inasistencias);

                alumnoFin.finalizarMateria(materiaCursada);
                JOptionPane.showMessageDialog(this, "Situación final cargada y materia finalizada.");
            } else {
                JOptionPane.showMessageDialog(this, "Selección inválida.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado.");
        }
    }

    private void mostrarAlumnosCarreraMateria() {
        String nombreAlumnoVer = JOptionPane.showInputDialog(this, "Ingrese el nombre del alumno:");
        Alumno alumnoVer = buscarAlumno(nombreAlumnoVer);

        if (alumnoVer != null) {
            JTextArea textArea = new JTextArea(10, 40);
            textArea.setText("Carrera: " + alumnoVer.getCarrera().getNombre() + "\n");
            for (MateriaCursada materia : alumnoVer.getMateriasCursando()) {
                textArea.append("Materia: " + materia.getMateria().getNombre() + ", Estado: " + materia.getEstado() + ", Inasistencias: " + materia.getInasistencias() + "\n");
            }
            JScrollPane scrollPane = new JScrollPane(textArea);
            JOptionPane.showMessageDialog(this, scrollPane, "Alumnos en Carrera y Materia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Alumno no encontrado.");
        }
    }

       private void mostrarCarrerasYMaterias() {
           JTextArea textArea = new JTextArea(10, 40);
           for (Carrera carrera : carreras) {
               textArea.append("Carrera: " + carrera.getNombre() + "\n");
               for (Materia materia : carrera.getMaterias()) {
                   textArea.append("  Materia: " + materia.getNombre() + ", Curso: " + materia.getCurso() + ", Cuatrimestre: " + materia.getcuatrimestre() + "\n");
               }
               textArea.append("\n");
           }
           JScrollPane scrollPane = new JScrollPane(textArea);
           JOptionPane.showMessageDialog(this, scrollPane, "Carreras y Materias Disponibles", JOptionPane.INFORMATION_MESSAGE);
       }

       private void mostrarAlumnosInscritosCarrera() {
    // Mostrar un cuadro de diálogo con las carreras disponibles para seleccionar
    Carrera carreraSeleccionada = (Carrera) JOptionPane.showInputDialog(this,
            "Seleccione la Carrera:",
            "Carreras",
            JOptionPane.QUESTION_MESSAGE,
            null,
            carreras.toArray(),
            carreras.get(0)); // Mostrar la primera carrera como opción por defecto

    if (carreraSeleccionada != null) {
        // Si se selecciona una carrera, mostrar los alumnos inscritos
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setText("Alumnos inscritos en la Carrera: " + carreraSeleccionada.getNombre() + "\n");
        for (Alumno alumno : carreraSeleccionada.getAlumnosInscritos()) {
            textArea.append("Alumno: " + alumno.getNombre() + ", DNI: " + alumno.getDNI() + "\n");
        }
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(this, scrollPane, "Alumnos Inscritos en la Carrera", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Si no se selecciona ninguna carrera, mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "Selección inválida.");
    }
}

private void mostrarAlumnosInscritosMateria() {
    // Crear una lista con todas las materias disponibles en las carreras
    ArrayList<Materia> todasLasMaterias = new ArrayList<>();
    for (Carrera carrera : carreras) {
        todasLasMaterias.addAll(carrera.getMaterias());
    }

    // Mostrar un cuadro de diálogo con las materias disponibles para seleccionar
    Materia materiaSeleccionada = (Materia) JOptionPane.showInputDialog(this,
            "Seleccione la Materia:",
            "Materias",
            JOptionPane.QUESTION_MESSAGE,
            null,
            todasLasMaterias.toArray(),
            todasLasMaterias.get(0)); // Mostrar la primera materia como opción por defecto

    if (materiaSeleccionada != null) {
        // Si se selecciona una materia, mostrar los alumnos inscritos
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setText("Alumnos inscritos en la Materia: " + materiaSeleccionada.getNombre() + "\n");
        for (Alumno alumno : materiaSeleccionada.getalumnosEnMateria()) {
            textArea.append("Alumno: " + alumno.getNombre() + ", DNI: " + alumno.getDNI() + "\n");
        }
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(this, scrollPane, "Alumnos Inscritos en la Materia", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Si no se selecciona ninguna materia, mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "Selección inválida.");
    }
}

       private Alumno buscarAlumno(String nombre) {
           for (Alumno alumno : alumnos) {
               if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                   return alumno;
               }
           }
           return null;
       }

       private Carrera buscarCarrera(String nombre) {
           for (Carrera carrera : carreras) {
               if (carrera.getNombre().equalsIgnoreCase(nombre)) {
                   return carrera;
               }
           }
           return null;
       }

       private Materia buscarMateria(String nombre) {
           for (Carrera carrera : carreras) {
               for (Materia materia : carrera.getMaterias()) {
                   if (materia.getNombre().equalsIgnoreCase(nombre)) {
                       return materia;
                   }
               }
           }
           return null;
       }

       public static void main(String[] args) {
           SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                   new SistemaMatriculacionGUI().setVisible(true);
               }
           });
       }
   }

