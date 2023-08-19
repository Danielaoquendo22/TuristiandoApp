package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.LocalValidacion;

public class Local {
    protected Util util= new Util();

    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;

    protected LocalValidacion validacion = new LocalValidacion();

    public Local() {
    }

    public Local(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }


    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = util.generarId();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nitV)  {
        try{
            this.validacion.validarNit(nitV);
            this.nit = nitV;

        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreEm)throws Exception {
        try {
            this.validacion.validarNombre(nombreEm);
            this.nombre = nombreEm;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getUbicacion() {

        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }
}
