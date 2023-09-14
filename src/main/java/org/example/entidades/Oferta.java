package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;

public class Oferta {

    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Empresa local;
    protected Util util = new Util();

    protected OfertaValidacion validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Empresa local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception{
        try {
            this.validacion.validarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio)throws Exception {
        try{
            this.util.validarFormatoFecha(fechaInicio);
            this.fechaInicio = this.util.convertirStringAFecha(fechaInicio);

        }catch (Exception error){
            System.out.println(error.getMessage());
        }


    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {

        try{
            this.util.validarFormatoFecha(fechaFin);
            this.validacion.validarFechaFinal(this.fechaInicio,this.util.convertirStringAFecha(fechaFin));

            this.fechaFin = this.util.convertirStringAFecha(fechaFin);

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) throws Exception {
        try {
            this.validacion.validarCosto(costoPersona);
            this.costoPersona=costoPersona;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Empresa getLocal() {
        return local;
    }

    public void setLocal(Empresa local) {
        this.local = local;
    }
}
