package org.example.entidades;

import org.example.entidades.interfaces.Ireporte;

public class EmpresaPrivada extends Empresa implements Ireporte {

    private String representanteLegal;
    private Double cobro;

    public EmpresaPrivada() {
    }

    @Override
    public Double cobro() {
        return (200000 * 1.19) * 1.10 ;
    }

    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String representanteLegal, Double cobro) {
        super();
        this.representanteLegal = representanteLegal;
        this.cobro = cobro;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Double getCobro() {
        return cobro;
    }

    public void setCobro(Double cobro) {
        this.cobro = cobro;
    }

    @Override
    public void generarReporte() {
        
    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}


