package com.mycompany.taller.Modelos;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible; 
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private Profesor responsable;
    private List<Foro> foros = new ArrayList<>();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList<>();
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public boolean isEstadoDisponible() { return estadoDisponible; }
    public void setEstadoDisponible(boolean estadoDisponible) { this.estadoDisponible = estadoDisponible; }    
    public List<Estudiante> getEstudiantesInscritos() { return estudiantesInscritos; }
    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) { this.estudiantesInscritos = estudiantesInscritos; }
    public Profesor getResponsable() { return responsable; }
    public void setResponsable(Profesor responsable) { this.responsable = responsable; }
    
}