package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;

public class Reserva {
    protected Oferta oferta1= new Oferta();
    protected Util util = new Util();
    protected ReservaValidacion validacion = new ReservaValidacion();
    private Integer id;
    private Usuario usuario;
    private Oferta oferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer reserva;

    public Reserva() {
    }

    public Reserva(ReservaValidacion validacion, Integer id, Usuario usuario, Oferta oferta, Double costoTotal, LocalDate fechaReserva, Integer reserva) {
        this.validacion = validacion;
        this.id = id;
        this.usuario = usuario;
        this.oferta = oferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.reserva = reserva;
    }

    public ReservaValidacion getValidacion() {
        return validacion;
    }

    public void setValidacion(ReservaValidacion validacion) {
        this.validacion = validacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try {
            this.util.validarFormatoFecha(fechaReserva);
            this.fechaReserva = this.util.convertirStringAFecha(fechaReserva);

        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer res)  {
        try {
            this.validacion.validarReserva(res);
            this.reserva = res;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public void calculiIva(Double cpp){

        Double iva;

        iva = ( cpp *  reserva) * 0.19;


        System.out.println(iva);




    }
}