package com.mycompany.taller.Modelos;
import java.util.List;
import java.util.ArrayList;

public class PersonalAcademico extends Usuario {
    
    private List<Incidente> incidentesIngresados = new ArrayList<>();
    public void reportarError(String email, String contenido) { }
    public void solicitarAsesoramientoDelSistema(String email, String contenido) { }
    public void comentarEnForo(Foro foro, String comentario) { }
    public List<Incidente> getIncidentesIngresados() { return incidentesIngresados; }
    public void setIncidentesIngresados(List<Incidente> incidentesIngresados) { this.incidentesIngresados = incidentesIngresados; }
}
