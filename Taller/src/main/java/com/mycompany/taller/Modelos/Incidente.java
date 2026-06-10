package com.mycompany.taller.Modelos;
import java.util.Date;
import java.util.List;


public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    private SoporteTecnico soporteEncargado;
    private PersonalAcademico beneficiario;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Date getFecha_reportado() { return fecha_reportado; }
    public void setFecha_reportado(Date fecha_reportado) { this.fecha_reportado = fecha_reportado; }
    
}