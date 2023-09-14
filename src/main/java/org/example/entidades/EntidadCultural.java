package org.example.entidades;

import org.example.entidades.interfaces.Ireporte;
import org.example.utilidades.Mensaje;
import org.example.validaciones.EntidadCulturalValidacion;
import org.example.validaciones.LocalValidacion;

public  class EntidadCultural extends Empresa implements Ireporte {

    private String secretaria;

    private String mision;

    private Double cobro;

    protected EntidadCulturalValidacion validacion = new EntidadCulturalValidacion();

    public EntidadCultural() {
    }

    public EntidadCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String secretaria, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.secretaria = secretaria;
        this.mision = mision;
        this.cobro= cobro();
    }



    @Override
    public Double cobro() {
        return  (200000*1.19)*0.90;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        try{
            this.validacion.validarSecretaria(secretaria);
            this.secretaria = secretaria;
        }catch (Exception error){
            System.out.println(Mensaje.NUMERO_CARACTERES_INVALIDOS);
        }

    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
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
