package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {

    Util util = new Util();

    public OfertaValidacion() {
    }

    public boolean validarTitulo(String titulo) throws Exception {
        if (titulo.length() > 20) {
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDOS.getMensaje());
        } else {
            return true;
        }
    }

    public boolean validarFechaFinal(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isBefore(fechaFin)) {
            return true;

        } else {

            throw new Exception(Mensaje.VALIDAR_FECHA.getMensaje());
        }

    }

    public boolean validarCosto(Double costoP) throws Exception{
        String numeroPositivoRegex = "^[1-9]\\d*(\\.\\d+)?$";

        if(!Util.validarExpresionRegular(costoP.toString(), numeroPositivoRegex)){
            throw new Exception(Mensaje.VALIDAR_COSTO.getMensaje());
        }else{
            return true;
        }

    }



}
