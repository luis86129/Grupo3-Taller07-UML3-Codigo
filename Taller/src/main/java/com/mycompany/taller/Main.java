/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
import com.mycompany.taller.Modelos.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Iniciando Centro de Aprendizaje Online");
     
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Rafael");
        estudiante.setUsuario("Zambrano");
        Curso curso = new Curso();
        curso.setNombre("Diseño de software uml en clases");
        curso.setEstadoDisponible(true);
        System.out.println("El estudiante " + estudiante.getNombre() + " está en el curso: " + curso.getNombre());
        estudiante.solicitarInscripcionCurso(curso);    
        System.out.println("Finalizado .");
    }
}