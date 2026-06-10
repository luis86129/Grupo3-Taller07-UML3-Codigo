package com.mycompany.taller.Modelos;
import java.util.List;
import java.util.ArrayList;

public class SoporteTecnico extends Usuario {
    private List<Incidente> incidentesAtendidos = new ArrayList<>();
    public void brindarAsistenciaUsuario(Usuario usuario) { }
    public void resolverProblemaTecnico(Usuario usuario) { }
    public void derivarProblemaDeGestion(Administrador administrador) { } 
    public List<Incidente> getIncidentesAtendidos() { return incidentesAtendidos; }
    public void setIncidentesAtendidos(List<Incidente> incidentesAtendidos) { this.incidentesAtendidos = incidentesAtendidos; 

    }
}